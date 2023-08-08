import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Enter the student's name :");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Position of the " + name + " in the list is " + i);
                check = true;
            }
        }
        if (!check) {
            System.out.println("Not found");
        }
    }
}
