package pl.ryzykowski.demo2.tablesearch;


import java.util.Arrays;

public class Main {


    public static void main (String[] args){
        Main m = new Main();
        //m.executeSearching();
        m.executeSorting();
    }

    public void executeSearching() {
        long start;
        FileReading fileReading = new FileReading();
        Integer[] tableSorted =
                fileReading.readTableFromFile(this.getClass().getClassLoader().getResource("sorted.csv").getFile());
        final int NUMBER_1 = 0;
        final int NUMBER_2 = 55;
        final int NUMBER_3 = 500;
        final int NUMBER_4 = 800;

        TableSearch ts = new TableSearch(tableSorted);

        start = System.nanoTime();
        System.out.println(ts.javaBinarySearch(NUMBER_1));
        System.out.println(ts.javaBinarySearch(NUMBER_2));
        System.out.println(ts.javaBinarySearch(NUMBER_3));
        System.out.println(ts.javaBinarySearch(NUMBER_4));
        System.out.println("java binary search: " + (System.nanoTime() - start));

        start = System.nanoTime();
        System.out.println(ts.listSearch(NUMBER_1));
        System.out.println(ts.listSearch(NUMBER_2));
        System.out.println(ts.javaBinarySearch(NUMBER_3));
        System.out.println(ts.javaBinarySearch(NUMBER_4));
        System.out.println("list search: " +  + (System.nanoTime() - start));

        start = System.nanoTime();
        System.out.println(ts.myBinarySearch(NUMBER_1));
        System.out.println(ts.myBinarySearch(NUMBER_2));
        System.out.println(ts.javaBinarySearch(NUMBER_3));
        System.out.println(ts.javaBinarySearch(NUMBER_4));
        System.out.println("my binary search: " +  + (System.nanoTime() - start));

        start = System.nanoTime();
        System.out.println(ts.myBinarySearchRecursion(NUMBER_1, 0, tableSorted.length-1));
        System.out.println(ts.myBinarySearchRecursion(NUMBER_2, 0, tableSorted.length-1));
        System.out.println(ts.myBinarySearchRecursion(NUMBER_3, 0, tableSorted.length-1));
        System.out.println(ts.myBinarySearchRecursion(NUMBER_4, 0, tableSorted.length-1));
        System.out.println("my binary search recursion: " +  + (System.nanoTime() - start));
    }

    public void executeSorting() {
        long start;
        GenerateRandom random = new GenerateRandom();
        final int TABLE_LENGTH = 500;
        final int UPPER_BOUND = 1000;

        start = System.nanoTime();
        Integer[] tableUnsorted = random.randomUniqueNumbers(TABLE_LENGTH, UPPER_BOUND);
        System.out.println("randomize tableUnsorted: " +  + (System.nanoTime() - start));
        System.out.println(Arrays.asList(tableUnsorted));

        TableSorting tsort = new TableSorting();

        /*start = System.nanoTime();
        tsort.bubbleSortingAsc(tableUnsorted);
        System.out.println("bubble sorting: " +  + (System.nanoTime() - start));
        System.out.println(Arrays.asList(tableUnsorted));
        System.out.println("operations counter: " + tsort.getOperations());*/

        start = System.nanoTime();
        tsort.quickSorting(tableUnsorted, 0, tableUnsorted.length-1);
        System.out.println("quick sorting: " +  + (System.nanoTime() - start));
        System.out.println(Arrays.asList(tableUnsorted));
        System.out.println("operations counter: " + tsort.getOperations());
    }

    //https://www.samouczekprogramisty.pl/podstawy-zlozonosci-obliczeniowej/
    //https://www.baeldung.com/java-quicksort
}
