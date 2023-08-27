package copy_file;

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
    public void writeFile(String filePath, List<Integer> list) {
        try {

            FileWriter fileWriter = new FileWriter(filePath); // true là combine file, không để gì là ghi đè
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int e : list) {
                bufferedWriter.write(""+e);
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
