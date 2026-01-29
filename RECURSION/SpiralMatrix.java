import java.util.Scanner;

public class SpiralMatrix {
    public static void spiralPrint(int[][] matrix, int n) {
        int top = 0;
        int left = 0;
        int bottom = n-1;
        int right = n-1;
        while(top<=bottom && left<=right){
            for(int j=left; j<=right; j++){
                System.out.print(matrix[top][j]+" ");
            }
            top++;

            for(int i=top; i<=bottom; i++){
                System.out.print(matrix[i][right]+" ");
            }
            right--;

            if(top<=bottom){
                for(int j=right; j>=left; j--){
                    System.out.print(matrix[bottom][j]+" ");
                }
                bottom--;
            }
            
            if(left<=right){
                for(int i = bottom; i>=top; i--){
                    System.out.print(matrix[i][left]+" ");
                }
                left++;
            }
        }
        System.out.println();
    }

    public static int diagonalSum(int matrix[][], int n) {
        int sum=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    sum = sum+matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner st = new Scanner(System.in);
        int n = st.nextInt();
        int[][] matrix = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = st.nextInt();
            }
        }
        spiralPrint(matrix,n);
        System.out.println(diagonalSum(matrix,n));
    }
}

// [
//  1-> 2-> 3-> 4
//               \
//  12->13->14   5
//  /        /   \
//  11  16<-15   6
//  /            \
//  10<- 9<- 8<- 7   
// ]