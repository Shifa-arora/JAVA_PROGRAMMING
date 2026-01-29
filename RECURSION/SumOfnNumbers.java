import java.util.Scanner;

public class SumOfnNumbers {
    public static int Sum(int n){
        int sum = 0;
        if(n==0) return 0;
        sum = n + Sum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Sum(n));
    }
    
}
