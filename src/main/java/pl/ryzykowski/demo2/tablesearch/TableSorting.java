package pl.ryzykowski.demo2.tablesearch;

public class TableSorting {

    private int operations = 0;

    public int getOperations() {
        return operations;
    }


    public Integer[] bubbleSortingAsc(Integer[] table){
        for (int i=0; i<table.length; i++) {
            for (int j=0; j<table.length-1; j++) {
                if (table[j]>table[j+1]){
                    int temp = table[j+1];
                    table[j+1] = table[j];
                    table[j] = temp;
                    operations++;
                }
            }
        }
        return table;
    }
}
