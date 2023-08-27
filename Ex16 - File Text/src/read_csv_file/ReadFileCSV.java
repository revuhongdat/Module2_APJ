package read_csv_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {
    public List<String[]> readFile(String filePath) {
        List<String[]> listCountries = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                listCountries.add(line.split(","));
            }
        } catch (Exception e) {
            System.out.println("File not found or file error!!!");
        }
        return listCountries;
    }
}
