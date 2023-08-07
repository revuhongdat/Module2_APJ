import java.util.Scanner;
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number a :");
        a = input.nextInt();
        System.out.println("Enter number b :");
        b = input.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("No Greatest Common Divisor!");
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
        }
        System.out.println("Greatest Common Divisor is : " + a);
    }
}
