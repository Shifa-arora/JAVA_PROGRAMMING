package RECURSIONpractice;
import java.util.*;

public class PalindromeCheck{
    public static boolean isPalindrome(String str){
        if(str.length()<=1){
            return true;
        }
        if(str.charAt(0) != str.charAt(str.length()-1)){
            return false;
        }
        return isPalindrome(str.substring(1, str.length()-1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(isPalindrome(str)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}