import java.util.Scanner;

public class PowerOfn {
    public static int power(int n) {
        if(n==0 || n==1) return 1;
        return n*power(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(power(n));
    }
}
