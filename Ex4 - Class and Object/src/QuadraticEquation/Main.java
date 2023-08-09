package QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a : ");
        double a = input.nextDouble();
        System.out.print("Enter b : ");
        double b = input.nextDouble();
        System.out.print("Enter c : ");
        double c = input.nextDouble();
        QuadraticEquation Equation = new QuadraticEquation(a,b,c);
        double delta = Equation.getDiscriminant();
        System.out.println("Equation " + a + "x2" + " + " + b +"x" + " + " + c + " = 0");
        if (delta > 0) {
            System.out.print("Equation has two roots : " + Equation.getRoot1() + " and " + Equation.getRoot2());
        } else if (delta == 0) {
            System.out.print("Equation has one root : " + Equation.getRoot1());
        } else {
            System.out.print("Equation has no real roots");
        }
    }
}
