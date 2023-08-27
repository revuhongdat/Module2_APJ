package find_max_file_write;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> arrayList = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                arrayList.add(Integer.parseInt(line));
            }
        } catch (Exception e) {
            System.err.println("File not found or file error!!!");
        }
        return arrayList;
    }
    public void writeFile(String filePath, int max) {
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Max =" + max);
            bufferedWriter.close();
            System.out.println("Write file done!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
