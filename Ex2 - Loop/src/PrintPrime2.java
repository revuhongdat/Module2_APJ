import java.util.Scanner;

public class PrintPrime2 {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter a number :");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        for (int i = 2; i < number; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
            }
        }
    }
}