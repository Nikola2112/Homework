public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Circle", 5.0);
        Shape rectangle = new Rectangle("Rectangle", 10.0, 20.0);
        Shape triangle = new Triangle("Triangle", 3.0, 4.0);
        Shape square = new Square("Square", 7.0);
        Shape ellipse = new Ellipse("Ellipse", 8.0, 6.0);

        ShapePrinter shapePrinter = new ShapePrinter();
        shapePrinter.printShapeName(circle);
        shapePrinter.printShapeName(rectangle);
        shapePrinter.printShapeName(triangle);
        shapePrinter.printShapeName(square);
        shapePrinter.printShapeName(ellipse);
    }
}
 