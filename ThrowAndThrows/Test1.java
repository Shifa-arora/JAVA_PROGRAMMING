package ThrowAndThrows;

public class Test1 {
    public static void main(String[] args) {
        int num = -5;

        if (num < 0) {
            // throw an exception with message "Negative number not allowed"
            throw new ArithmeticException("Negative number not allowed");
        }

        System.out.println("Valid number");
    }
} {
    
}
