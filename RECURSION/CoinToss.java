import java.util.Scanner;

public class CoinToss {
    public static void toss(int n, String ans) {
        if(n==0){
            System.out.println(ans);
            return;
        }
        toss(n-1, ans+"H");
        toss(n-1, ans+"T");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toss(n,"");
    }
}
