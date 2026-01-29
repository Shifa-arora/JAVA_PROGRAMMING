import java.util.Scanner;

public class Reverse {
    public static void Print(int n) {
        if(n==0) return ;
        Print(n-1);
        System.out.println(n);
    }
    public static void Reverse(int n) {
        if(n==0) return;
        System.out.println(n);
        Reverse(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Print(n);
        System.out.println("Reverse:");
        Reverse(n);
    }
}
