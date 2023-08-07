import  java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        year = input.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("%d is a leap year!");
                } else {
                    System.out.println("%d is NOT a leap year!");
                }
            } else {
                System.out.println("%d is a leap year!");
            }
        } else {
            System.out.println("%d is NOT a leap year!");
        }
    }
}
