package services;

import java.util.Scanner;

public class ExceptionManager {
    private static final Scanner sc = new Scanner(System.in) ;

    public static int ExceptionAge() {
        int age = 0;
        do {
            System.out.println("Enter the age (18 - 120): ");
            try {
                age = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Enter numbers only, please re-enter!!!");
            }

            if (age < 18 || age > 120) {
                age = 0;
                System.err.println("The age is not valid, please re-enter!!!");
            }
        } while (age == 0);
        return age;
    }
    public static double ExceptionAvg() {
        double avg = -1.0;
        do {
            System.out.println("Enter the average point: ");
            try {
                avg = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Enter numbers only, please re-enter!!!");
            }
            if (avg > 10 || avg < 0) {
                avg = -1;
                System.err.println("Average point is not valid, please re-enter!!!");
            }
        } while (avg == -1);
        return avg;
    }
    public static String ExceptionGender() {
        String gender = "";
            System.out.println("Enter the student gender (Male-Female): ");
            try {
                gender = sc.nextLine();
            } catch (NumberFormatException e) {
                System.err.println("Enter numbers only, please re-enter!!!");
            }
        return gender;
    }
}
