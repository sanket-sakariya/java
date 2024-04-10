import java.util.Scanner;

public class Practical4_q4 {

    static double volume(double side) {
        return Math.pow(side, 3);
    }

    static double volume(double length, double width, double height) {
        return length * width * height;
    }

    static double volume(double radius, String shape) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a shape to find the volume: ");
        System.out.println("1. Cube");
        System.out.println("2. Rectangular Cube");
        System.out.println("3. Sphere");
        int choice = scanner.nextInt();
        double result = 0.0;

        switch (choice) {
            case 1:
                System.out.print("Enter the side length of the cube: ");
                double side = scanner.nextDouble();
                result = volume(side);
                break;
            case 2:
                System.out.print("Enter the length of the rectangular cube: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangular cube: ");
                double width = scanner.nextDouble();
                System.out.print("Enter the height of the rectangular cube: ");
                double height = scanner.nextDouble();
                result = volume(length, width, height);
                break;
            case 3:
                System.out.print("Enter the radius of the sphere: ");
                double radius = scanner.nextDouble();
                result = volume(radius, "sphere");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        System.out.println("Volume of the shape: " + result);
        scanner.close();
    }
}
