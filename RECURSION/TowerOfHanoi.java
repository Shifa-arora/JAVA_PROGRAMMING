import java.util.Scanner;

public class TowerOfHanoi {
    public static void toh(int n , char src, char helper, char dest) {
        if(n==0) return;
        toh(n-1, src, dest, helper);
        System.out.println("Moving disk "+ n + " from " + src  +" To " + dest);
        toh(n-1, helper, dest, src);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        toh(n, 'A', 'B', 'C');
    }
}
