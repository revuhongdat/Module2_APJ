package read_csv_file;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadFileCSV readFileCSV = new ReadFileCSV();
        List<String[]> listCountries = readFileCSV.readFile("D:\\Module2_APJ\\Ex16 - File Text\\src\\read_csv_file\\file.csv");
        for(String[] array : listCountries) {
            System.out.println(array[2]);
        }
    }
}
