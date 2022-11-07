package pl.ryzykowski.demo2.tablesearch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReading {

    public Integer[] readTableFromFile(String csvPath){
        List<Integer> list = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(csvPath))) {
            String line = reader.readLine();
            while(line != null) {
                list.add(Integer.valueOf(line));
                line = reader.readLine();
            }
        }
        catch (IOException io) {
            System.err.println("Cannot find file");
        }
        Integer[] array = new Integer[list.size()];
        return list.toArray(array);
    }

}
