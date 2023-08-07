import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args) {
        float a;
        float b;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a :");
        a = input.nextFloat();
        System.out.println("Input b :");
        b = input.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.println("PT vô số nghiệm!");
            } else {
                System.out.println("PT vô nghiệm");
            }
        } else {
            System.out.println("PT có nghiệm duy nhất :" + -b/a);
        }
    }
}
