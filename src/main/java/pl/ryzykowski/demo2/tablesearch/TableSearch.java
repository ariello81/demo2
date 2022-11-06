package pl.ryzykowski.demo2.tablesearch;

import java.util.Arrays;

public class TableSearch {

    public boolean javaBinarySearch(Integer[] table, Integer number){
        Arrays.sort(table);
        int i = Arrays.binarySearch(table, number);
        if (i>=0) return true;
        return false;
    }

    public boolean listSearch(Integer[] table, Integer number){
        if (Arrays.asList(table).contains(number)) {
            return true;
        }
        return false;
    }

    public boolean myBinarySearch(Integer[] table, Integer number){
        int bottomIndex = 0;
        int topIndex = table.length-1;
        while(bottomIndex<=topIndex){
            System.out.println("topindex:" + topIndex);
            System.out.println("bottomindex:" + bottomIndex);
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

}
