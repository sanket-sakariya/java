public class Practical6_q5 {

    static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        try {
            if (args.length > 0) {
                int num = Integer.parseInt(args[0]);
                if (num == 0) {
                    throw new CustomException("CustomException: First argument cannot be 0");
                } else {
                    System.out.println("First argument is not 0: " + num);
                }
            } else {
                System.out.println("No command line arguments provided");
            }
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
