import java.util.Scanner;

public class LexicographicalCounting {

    public static void lexCount(int curr, int n) {
        if (curr > n) {
            return;
        }

        System.out.print(curr + " ");

        for (int i = 0; i <= 9; i++) {
            int next = curr * 10 + i;
            if (next > n) break;
            lexCount(next, n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            lexCount(i, n);
        }
    }
}
