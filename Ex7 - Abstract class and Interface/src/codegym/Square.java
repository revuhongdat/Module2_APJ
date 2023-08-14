package codegym;

import interface_colorable.Colorable;

public class Square extends Rectangle implements Colorable {
    public Square() {}

    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
    public String toString() {
        return  "A square with side = "
                + getSide()
                + ", has area = "
                + getArea();
    }

    @Override
    public void resize(double x) {
        super.resize(x);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
