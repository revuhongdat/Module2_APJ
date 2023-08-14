package circle_and_cylinder;

public class Circle {
    private double radius;
    private String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.PI * Math.pow(this.radius,2);
    }

    @Override
    public String toString() {
        return "Circle{"
                + "radius = "
                + getRadius()
                + ", color = "
                + getColor()
                + "}";
    }
}
