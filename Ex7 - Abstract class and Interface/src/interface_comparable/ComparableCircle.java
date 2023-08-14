package interface_comparable;
import circle_and_cylinder.Circle;
public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {}

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color) {
        super(radius, color);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() >= o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 0;
    }
}
