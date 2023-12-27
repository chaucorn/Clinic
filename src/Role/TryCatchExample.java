package Role;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result); // This line won't be reached if an exception occurs
        } catch (ArithmeticException e) {
            // Code to handle the exception
            System.err.println("Error: " + e.getMessage());
        }

        // The program continues to execute after handling the exception
        System.out.println("Program continues...");
    }

    // A method that may throw an exception
    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
