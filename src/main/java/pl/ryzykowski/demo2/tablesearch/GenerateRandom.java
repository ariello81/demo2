package pl.ryzykowski.demo2.tablesearch;

import java.util.*;

public class GenerateRandom {

    public Integer[] randomUniqueNumbers(int tableLength, int upperBound) {
        if (upperBound < tableLength) {
            System.err.println("rozmiar tablicy nie może być większy niż górny zakres liczb losowych");
            return null;
        }
        else {
            Set<Integer> set = new LinkedHashSet<>();
            Random rand = new Random();
            while(set.size() < tableLength) {
                set.add(rand.nextInt(upperBound));
            }
            Integer[] array = new Integer[set.size()];
            return set.toArray(array);
        }
    }

}
