package interface_resizeable;

import codegym.Circle;
import codegym.Rectangle;
import codegym.Shape;
import codegym.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(3,6);
        shapes[2] = new Square(3);
        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            } else System.out.println(shape);
        }
    }
}
