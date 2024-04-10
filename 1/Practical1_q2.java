import java.util.Scanner;

public class Practical1_q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Values from eqn 1 :");
        System.out.println("Enter value of a:");
        double a = input.nextDouble();
        System.out.println("Enter value of b:");
        double b = input.nextDouble();
        System.out.println("Enter value of c:");
        double c = input.nextDouble();

        System.out.println("Values from eqn 2 :");
        System.out.println("Enter value of d:");
        double d = input.nextDouble();
        System.out.println("Enter value of e:");
        double e = input.nextDouble();
        System.out.println("Enter value of f:");
        double f = input.nextDouble();

        double x = ((e*d)-(b*f)) / ((a*d)-(b*c));
        double y = ((a*f)-(e*c)) / ((a*d)-(b*c));

        System.out.println("X ="+x+" Y="+y);

    }
}