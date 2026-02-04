package RECURSIONpractice;

import java.util.Scanner;

public class CountVowels {
    public static int count(String str){
        if(str.length()==0) return 0;
        // count(str.substring(1), n+1);
        char ch = Character.toLowerCase(str.charAt(0));
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return 1+ count(str.substring(1));
        }
        else{
            return count(str.substring(1));
        }


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        System.out.println(count(str));
    }
}
