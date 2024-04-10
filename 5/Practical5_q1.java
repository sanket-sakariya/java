import java.util.Scanner;

abstract class Shape {
    abstract double area();
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class Practical5_q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select shape to calculate area: ");
        System.out.println("1. Triangle");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter base and height of the triangle: ");
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                Triangle triangle = new Triangle(base, height);
                System.out.println("Area of Triangle: " + triangle.area());
                break;
            case 2:
                System.out.println("Enter length and width of the rectangle: ");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                System.out.println("Area of Rectangle: " + rectangle.area());
                break;
            case 3:
                System.out.println("Enter radius of the circle: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("Area of Circle: " + circle.area());
                break;
            default:
                System.out.println("Invalid choice!");
        }
        scanner.close();
    }
}