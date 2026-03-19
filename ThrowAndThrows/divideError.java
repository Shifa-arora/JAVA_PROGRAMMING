package ThrowAndThrows;

public class divideError {
    static void divide() throws ArithmeticException{
        int a = 10 / 0;
    }

    //***OR********* */

    try {
        int a = 10 / 0;
    } catch (ArithmeticException e) {
        System.out.println("Cannot divide by zero");
    }

    public static void main(String[] args) {
        divide();
    }
}
