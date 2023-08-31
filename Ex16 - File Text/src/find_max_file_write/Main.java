package find_max_file_write;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        System.out.println("Enter the link: ");
        Scanner sc = new Scanner(System.in);
        String filePath = sc.nextLine();
        int max = findMax(readAndWriteFile.readFile(filePath));
        readAndWriteFile.writeFile("source.txt", max);
    }
    public static int findMax(List<Integer> list) {
        int max = list.get(0);
        for (Integer e : list) {
            if (e > max) {
                max = e;
            }
        }
        return max;
    }
}
