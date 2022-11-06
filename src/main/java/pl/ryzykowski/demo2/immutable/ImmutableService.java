package pl.ryzykowski.demo2.immutable;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

@Service
public class ImmutableService implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        Map<String, City> cities = new HashMap<>();
        cities.put("Warsaw", new City("Warsaw", 1_700_000));
        cities.put("Cracow", new City("Cracow", 750_000));
        cities.put("Poznan", new City("Poznan", 550_000));
        cities.put("Poznan", new City("Poznan", 540_000));

        Set<City> citiesSet = new HashSet<>();
        citiesSet.add(new City("Warsaw", 1_700_000));
        citiesSet.add(new City("Warsaw", 1_700_000));
        citiesSet.add(new City("Warsaw", 1_600_000));
        citiesSet.add(new City("Cracow", 750_000));

        Country country = new Country("Poland",
                new BigDecimal(312.5),
                38_000_000,
                cities, citiesSet);
        City gdansk = new City("Gdansk", 460_000);
        cities.put("Gdansk", gdansk);
        country.getCities().put("Szczecin", new City("Szczecin", 400_000));
        System.out.println(country);
        System.out.println(Objects.hash("Warsaw", 1_700_000));
        System.out.println(Objects.hash("Gdansk", 460_000));
        System.out.println(gdansk.hashCode());
        System.out.println(country.getCities().size());
        System.out.println(country.getCitiesTree().size());
        System.out.println(country.getCity("Cracow"));
        System.out.println(country.getCityTree("Cracow"));
    }
}
