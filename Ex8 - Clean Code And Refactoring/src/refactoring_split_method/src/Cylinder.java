package refactoring_split_method.src;

public class Cylinder {
    public static double getArea(int radius){
        return Math.PI * radius * radius;
    }
    public static double getPerimeter(int radius){
        return 2 * Math.PI  * radius;
    }
    public static double getVolume(int radius, int height){
        double perimeter = getPerimeter(radius);
        double area = getArea(radius);
        return perimeter * height + 2 * area;
    }
}
