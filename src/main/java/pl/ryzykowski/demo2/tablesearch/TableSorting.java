package pl.ryzykowski.demo2.tablesearch;

public class TableSorting {

    private int operations;

    public int getOperations() {
        return operations;
    }

    public void bubbleSortingAsc(Integer[] table){
        operations = 0;
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
    }

    public void quickSorting(Integer[] table, int lowIndex, int highIndex){
        if (lowIndex < highIndex) {
            int partitionIndex = partition(table, lowIndex, highIndex);
            quickSorting(table, partitionIndex+1, highIndex);
            quickSorting(table, lowIndex, partitionIndex-1);
        }
    }

    private int partition(Integer[] table, int lowIndex, int highIndex) {

        Integer pivot = table[highIndex];
        int i = lowIndex-1;

        for (int j=lowIndex; j<highIndex; j++) {
            if (table[j] <= pivot) {
                i++;
                Integer swap = table[i];
                table[i] = table[j];
                table[j] = swap;
                operations++;
            }
        }

        Integer swap = table[i+1];
        table[i+1] = table[highIndex];
        table[highIndex] = swap;
        operations++;

        return i+1;
    }

}
