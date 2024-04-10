class DivideByZeroException extends Exception {

    public DivideByZeroException(String message) {
        super(message);
    }
}

public class Practical6_q1 {

    public static double divide(int numerator, int denominator) throws DivideByZeroException {
        if (denominator == 0) {
            throw new DivideByZeroException("Error: Cannot divide by zero!");
        }
        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {

            double result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (DivideByZeroException e) {

            System.out.println(e.getMessage());
        }
    }
}