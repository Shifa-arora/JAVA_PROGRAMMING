import java.util.Scanner;

public class CountLetters {
    public static int count(String input) {
        if(input.equals("")) return 0;
        return 1+ count(input.substring(1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(count(line));
    }
}
