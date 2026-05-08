package ThrowAndThrows;

class ArithmeticsException extends Exception {
    ArithmeticsException(String message){
        super(message);
    }
}

public class ArithmeticDivide{
    public static void divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Cannot divide by zero");
        } else{
            int result =a/b;
            System.out.println(result);
        } 
    }

    public static void main(String[] args){
        try{
            divide(10, 3);
        } catch(ArithmeticException e){
            System.out.println("Exception: "+ e.getMessage());
        } finally{
            System.out.println("Operation done");
        }
    }
}