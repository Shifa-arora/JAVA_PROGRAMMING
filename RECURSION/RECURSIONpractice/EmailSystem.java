package RECURSIONpractice;
import java.util.*;
public class EmailSystem {
    public static String removechar(String str, char ch){
        if(str.length()==0){
            return "";
        }

        String Rest = removechar(str.substring(1), ch);

        if(str.charAt(0)==ch){
            return Rest;
        }
        else{
            return str.charAt(0) + Rest;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.println("Enetr character to remove: ");
        char ch = sc.next().charAt(0);

        String ans = removechar(n, ch);

        System.out.println(ans);
    }
}
