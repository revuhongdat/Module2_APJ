package copy_file;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        try {
            ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
//            System.out.println("Enter the source file link: ");

//            Scanner sc = new Scanner(System.in);
//            String filePathIn = sc.nextLine();
            List<Integer> listIn = readAndWriteFile.readFile("D:\\Module2_APJ\\Ex16 - File Text\\src\\copy_file\\source.txt");
//            System.out.println(listIn);
//            System.out.println("Enter the name result file: ");
//            String filePathOut = sc.nextLine();
//            File fileOut = new File(filePathOut);
//            if (fileOut.exists()) {
//                throw new FileAlreadyExistsException(filePathOut);
//            }

            readAndWriteFile.writeFile("D:\\Module2_APJ\\Ex16 - File Text\\src\\copy_file\\result.txt",listIn);
            System.out.println("Copy file successfully");
            System.out.println("The number of characters in the file is " + listIn.size());
//        } catch (FileAlreadyExistsException e) {
//            System.out.println("File Already Exists!!!");
//        }
    }
}
