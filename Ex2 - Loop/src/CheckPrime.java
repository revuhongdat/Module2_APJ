import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
        int number;
        boolean check = true;
        System.out.println("Enter a number :");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if (number <2) {
            check = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        if (check) {
            System.out.println(number + " is a prime!");
        } else {
            System.out.println(number + " is not a prime!");
        }
    }
}
