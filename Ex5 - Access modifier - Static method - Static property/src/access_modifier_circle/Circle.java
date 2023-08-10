package access_modifier_circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    Circle() {}
    Circle(double r) {
        this.radius = r;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(this.radius,2);
    }
}
