package ThrowAndThrows;

import java.nio.InvalidMarkException;

class InvalidMarksException extends Exception{
    InvalidMarksException(String message){
        super(message);
    }
}

public class CustomExceptionForInvalidMarks {
    static void checkMarks(int marks) throws InvalidMarksException{
        if(marks<0 || marks>100){
            throw new InvalidMarksException("Marks should be between 0 and 100.");
        } else{
            System.out.println("Valid Marks");
        }
    }  
    public static void main(String [] args){
        try{
            checkMarks(120);
        }
        catch(InvalidMarkException e){
            System.out.println("Exception: "+ e.getMessage());
        }
    }
}
