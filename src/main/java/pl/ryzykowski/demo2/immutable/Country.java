package pl.ryzykowski.demo2.immutable;

import lombok.Getter;
import lombok.ToString;
import pl.ryzykowski.demo2.aop.Timed;

import java.math.BigDecimal;
import java.util.*;

@Getter
@ToString
public final class Country {
    private final String name;
    private final BigDecimal surface;
    private final int population;
    private final Map<String, City> cities;
    private final Map<String, City> citiesTree;
    private final Set<City> citiesSet;

    public Country(String name, BigDecimal surface, int population,
                   Map<String, City> cities, Set<City> citiesSet) {
        this.name = name;
        this.surface = surface;
        this.population = population;
        this.cities = new HashMap<>();
        this.cities.putAll(cities);
        this.citiesTree = new HashMap<>();
        this.citiesTree.putAll(cities);
        this.citiesSet = new HashSet<>();
        this.citiesSet.addAll(citiesSet);
        /*Map<String, City> tempMap = new HashMap<>();
        // Iterating using for-each loop
        for (Map.Entry<String, City> entry : cities.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        this.cities = tempMap;*/
    }

    public Map<String, City> getCities(){
        Map<String, City> tempMap = new HashMap<>();
        tempMap.putAll(this.cities);
        /*
        for (Map.Entry<String, City> entry : cities.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }*/
        return tempMap;
    }

    public Map<String, City> getCitiesTree(){
        Map<String, City> tempMap = new TreeMap<>();
        tempMap.putAll(this.cities);
        /*
        for (Map.Entry<String, City> entry : cities.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }*/
        return tempMap;
    }

    @Timed
    public City getCity(String key) {
        return this.cities.get(key);
    }

    @Timed
    public City getCityTree(String key) {
        return this.citiesTree.get(key);
    }
}
