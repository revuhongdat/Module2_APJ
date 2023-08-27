package read_file_example;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        System.out.println("Enter link file: ");
        Scanner sc = new Scanner(System.in);
        String filePath = sc.nextLine();
        readFileText(filePath);
    }
    public static void readFileText(String filePath) {
        try {
//Đọc file có đường dẫn là filePath
            File file = new File(filePath);
            if (!file.exists() == false) {
                throw new FileNotFoundException();
            }
//Đọc từng dòng của "file" và cộng tổng lại
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("SUM = " + sum);
//Xử lý ngoại lệ
        } catch(Exception e) {
            System.err.println("File not found or file error!!!");
        }
    }
}
