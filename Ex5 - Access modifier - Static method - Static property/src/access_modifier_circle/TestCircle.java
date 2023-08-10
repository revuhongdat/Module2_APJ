package access_modifier_circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        double r = circle1.getRadius();
        double area = circle1.getArea();
        System.out.println("Radius : " + r);
        System.out.println("Area : " + area);
    }
}
