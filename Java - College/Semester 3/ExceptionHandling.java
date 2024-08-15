// Creating a user-defined exception
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            // Throw an instance of our user-defined exception
            throw new MyException("This is a custom exception");
        } catch (MyException e) {
            // Catch and handle our user-defined exception
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}