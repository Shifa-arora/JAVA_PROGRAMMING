import java.util.Scanner;

public class SubStringMatrix {
    public static void subarray(int arr[], int n) {
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the number you want to enter: ");
        int n = st.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = st.nextInt();
        }
        subarray(arr, n);
    }
}



        //BY RECURSION