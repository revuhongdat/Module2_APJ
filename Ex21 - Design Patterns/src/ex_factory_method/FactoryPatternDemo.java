package ex_factory_method;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("Circle");
        Shape square = shapeFactory.getShape("Square");
        Shape rectangle = shapeFactory.getShape("Rectangle");
        circle.draw();
        square.draw();
        rectangle.draw();
    }
}
