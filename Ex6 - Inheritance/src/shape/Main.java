package shape;

public class Main {
    public static void main(String[] args) {
//        Shape shape1 = new Shape();
//        System.out.println(shape1);
        Circle circle1 = new Circle();
        System.out.println(circle1);
        circle1 = new Circle(3.5);
        System.out.println(circle1);
        circle1 = new Circle("red", true,3.5);
        System.out.println(circle1);
//        Rectangle rectangle1 = new Rectangle();
//        System.out.println(rectangle1);
    }
}
