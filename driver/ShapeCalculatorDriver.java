package driver;

import model.*;

public class ShapeCalculatorDriver {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4);

        System.out.println("Luas Lingkaran: " + calculateArea(circle));
        System.out.println("Luas Persegi: " + calculateArea(rectangle));
        System.out.println("Luas Segitiga: " + calculateArea(triangle));
    }

    private static double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
