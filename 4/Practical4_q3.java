import java.util.Scanner;

public class Practical4_q3 {

    static double area(double side) {
        return side * side;
    }

    static double area(double length, double width) {
        return length * width;
    }

    static double area(double base, double height, String shape) {
        return 0.5 * base * height;
    }

    static double area(double radius, String shape) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a shape to find the area: ");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Circle");
        int choice = scanner.nextInt();
        double result = 0.0;

        switch (choice) {
            case 1:
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                result = area(side);
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                result = area(length, width);
                break;
            case 3:
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                result = area(base, height, "triangle");
                break;
            case 4:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                result = area(radius, "circle");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        System.out.println("Area of the shape: " + result);
        scanner.close();
    }
}