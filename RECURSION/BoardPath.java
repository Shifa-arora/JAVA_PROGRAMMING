import java.util.Scanner;

public class BoardPath {
    public static void boardPath(int curr, int end, String path) {
        if (curr==end) {
            System.out.println(path);
            return;
        }
        if(curr>end){
            return ;
        }
        for(int dice = 1; dice <= 6; dice++){
            boardPath(curr+dice, end, path+dice);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boardPath(0, n, "");
    }
}
