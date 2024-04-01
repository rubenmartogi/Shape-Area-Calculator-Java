package driver;

import java.util.Scanner;

import model.Circle;
import model.Rectangle;
import model.Shape;
import model.Triangle;

public class ShapeCalculatorDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih operasi yang ingin dilakukan:");
        System.out.println("0: Hitung Luas");
        System.out.println("1: Hitung Keliling");

        int operationChoice = scanner.nextInt();

        System.out.println("Pilih bentuk yang ingin dihitung:");
        System.out.println("0: Lingkaran");
        System.out.println("1: Persegi Panjang");
        System.out.println("2: Segitiga");

        int shapeChoice = scanner.nextInt();
        Shape shape = null;

        switch (shapeChoice) {
            case 0:
                System.out.println("Masukkan panjang jari-jari lingkaran: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;
            case 1:
                System.out.println("Masukkan panjang persegi panjang: ");
                double length = scanner.nextDouble();
                System.out.println("Masukkan lebar persegi panjang: ");
                double width = scanner.nextDouble();
                shape = new Rectangle(length, width);
                break;
            case 2:
                System.out.println("Masukkan alas segitiga: ");
                double base = scanner.nextDouble();
                System.out.println("Masukkan tinggi segitiga: ");
                double height = scanner.nextDouble();
                shape = new Triangle(base, height);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        if (shape != null) {
            if (operationChoice == 0) {
                System.out.println("Luas: " + calculateArea(shape));
            } else if (operationChoice == 1) {
                System.out.println("Keliling: " + calculatePerimeter(shape));
            } else {
                System.out.println("Operasi tidak valid!");
            }
        }

        scanner.close();
    }

    private static double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    private static double calculatePerimeter(Shape shape) {
        return shape.calculateArea();
    }
}
