public class Practical6_q2  {

    public static void main(String[] args) {
        try {
            methodWithThrow();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException in main");
        } finally {
            System.out.println("Finally block in main");
        }

        try {
            methodWithThrows();
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException in main");
        }

        try {

            try {
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[5]); 
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException");
                throw new NumberFormatException(); 
            }
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException after rethrowing");
        } finally {
            System.out.println("Finally block after multiple catch blocks");
        }
    }

    static void methodWithThrow() {

        throw new NullPointerException("Demo NullPointerException");
    }

    static void methodWithThrows() throws ArithmeticException {

        int result = 10 / 0; 
    }
}