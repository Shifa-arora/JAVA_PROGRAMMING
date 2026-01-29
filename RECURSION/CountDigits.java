import java.util.Scanner;

public class CountDigits {
    public static int count(int line) {
        if(line==0) return 0;
        return 1 + count(line/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0) System.out.println("1");
        else{
            System.out.println(count(n));
        }
    }
}
