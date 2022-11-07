package pl.ryzykowski.demo2.tablesearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableSortingTest {

    @Test
    public void quickSorting_test() {
        //given
        TableSorting ts = new TableSorting();
        Integer[] table = new Integer[] {7, 2, 19, 25, 8};
        Integer[] sortedTable = new Integer[] {2, 7, 8, 19, 25};

        //when
        ts.quickSorting(table, 0, 4);

        //then
        Assertions.assertArrayEquals(sortedTable, table);
    }

    @Test
    public void bubbleSortingAsc() {
        //given
        TableSorting ts = new TableSorting();
        Integer[] table = new Integer[] {7, 2, 19, 25, 8};
        Integer[] sortedTable = new Integer[] {2, 7, 8, 19, 25};

        //when
        ts.bubbleSortingAsc(table);

        //then
        Assertions.assertArrayEquals(sortedTable, table);
    }
}