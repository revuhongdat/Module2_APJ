package copy_file;

import java.io.*;

public class ReadAndWriteFileVer2 {
    public void readFileAndWriteFile(String linkInput, String linkOutput ) {
//        List<Integer> arrayList = new ArrayList<>();
        try {
            File fileInput = new File(linkInput);
            File fileOutput = new File(linkOutput);
            if (!fileInput.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(fileInput));
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileOutput));
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
            }
            br.close();
            bw.close();
        } catch (Exception e) {
            System.err.println("File not found or file error!!!");
        }
    }
}
