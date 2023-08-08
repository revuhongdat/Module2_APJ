import java.util.Scanner;

public class ConvertTemp {
    public static void main(String[] args) {
        double f,c;
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1.F to C");
            System.out.println("2.C to F");
            System.out.println("0.Exit");
            System.out.println("Your choice is :");
            choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter F :");
                    f = input.nextDouble();
                    System.out.println("F to C : " + FtoC(f) );
                }
                case 2 -> {
                    System.out.println("Enter C :");
                    c = input.nextDouble();
                    System.out.println("C to F : " + CtoF(c) );
                }
                case 0 -> System.exit(0);
            }
        } while (choice != 0);
    }
    public static double FtoC (double x) {
        return (5.0 / 9) * (x - 32);
    }
    public static double CtoF (double x) {
        return (9.0 / 5) * x + 32;
    }
}
