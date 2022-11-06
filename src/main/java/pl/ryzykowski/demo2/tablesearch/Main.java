package pl.ryzykowski.demo2.tablesearch;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;


public class Main {

    public static void main (String[] args){
        Integer[] table = new Integer[]{9,8,7,6,5,4,3,2,1};

        /*TableSearch ts = new TableSearch();
        System.out.println("java binary search:");
        System.out.println(ts.javaBinarySearch(table, 2));
        System.out.println(ts.javaBinarySearch(table, 6));
        System.out.println(table.length);

        System.out.println("list search:");
        System.out.println(ts.listSearch(table, 2));
        System.out.println(ts.listSearch(table, 6));

        System.out.println("my binary search:");
        System.out.println(ts.myBinarySearch(table, 2));
        System.out.println(ts.myBinarySearch(table, 7));
        System.out.println(ts.myBinarySearch(table, 6));*/

        TableSorting tsort = new TableSorting();
        tsort.bubbleSortingAsc(table);
        System.out.println(Arrays.asList(table));
        System.out.println(tsort.getOperations());
    }


    //sortowanie merge
    //sortowanie quick
    //wczytanie malej i duzej tablicy z pliku korzystajac z try-with
    //oszacowanie czasu wyszukiwania i sortowania
    //testy
    //https://www.samouczekprogramisty.pl/podstawy-zlozonosci-obliczeniowej/
    //https://www.baeldung.com/java-quicksort
}
