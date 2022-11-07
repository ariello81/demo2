package pl.ryzykowski.demo2.tablesearch;

import java.util.Arrays;

public class TableSearch {

    private Integer[] table;

    public TableSearch(Integer[] table) {
        this.table = table;
    }

    public boolean javaBinarySearch(Integer number){
        int i = Arrays.binarySearch(table, number);
        if (i>=0) return true;
        return false;
    }

    public boolean listSearch(Integer number){
        if (Arrays.asList(table).contains(number)) {
            return true;
        }
        return false;
    }

    public boolean myBinarySearch(Integer number){
        int bottomIndex = 0;
        int topIndex = table.length-1;
        while(bottomIndex<=topIndex){
            int indexMiddle = bottomIndex + (topIndex-bottomIndex)/2;
            if (number > table[indexMiddle]) {
                bottomIndex = indexMiddle+1;
            }
            else if (number < table[indexMiddle]) {
                topIndex = indexMiddle-1;
            }
            else {
                return true;
            }

        }
        return false;
    }

    public boolean myBinarySearchRecursion(Integer number, int indexLow, int indexHigh) {
        boolean result = false;
        int indexMiddle = indexLow + (indexHigh-indexLow)/2;
        if (indexLow <= indexHigh) {
            if (table[indexMiddle] > number) {
                indexHigh = indexMiddle - 1;
                result = myBinarySearchRecursion (number, indexLow, indexHigh);
            } else if (table[indexMiddle] < number) {
                indexLow = indexMiddle + 1;
                result = myBinarySearchRecursion (number, indexLow, indexHigh);
            }
            else {
                result = true;
            }
        }
        return result;
    }

}
