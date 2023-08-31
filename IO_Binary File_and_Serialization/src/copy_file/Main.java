package copy_file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7Files(File source, File result) throws IOException {
        Files.copy(source.toPath(), result.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File result) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(result);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter source file:");
        String sourcePath = in.nextLine();
        System.out.print("Enter destination file:");
        String resultPath = in.nextLine();

        File sourceFile = new File(sourcePath);
        File resultFile = new File(resultPath);

        try {
            copyFileUsingJava7Files(sourceFile, resultFile);
//            copyFileUsingStream(sourceFile, resultFile);
            System.out.print("Copy completed");
        } catch (IOException ioe) {
            System.out.print("Can't copy that file");
            System.out.print(ioe.getMessage());
        }
    }
}