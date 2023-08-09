package Rectangle;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the width of rectangle : ");
        double width = input.nextDouble();
        System.out.print("Enter the height of rectangle : ");
        double height = input.nextDouble();
        Rectangle rec = new Rectangle(width, height);
        System.out.println("Your Rectangle.Rectangle \n"+ rec.display());
        System.out.println("Perimeter of the Rectangle.Rectangle: "+ rec.getPerimeter());
        System.out.println("Area of the Rectangle.Rectangle: "+ rec.getArea());
    }
}