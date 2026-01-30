package RECURSIONpractice;

import java.util.Scanner;

public class LostDocumentSearch {
    public static int Find(int arr[], int index, int key){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==key){
            return index;
        }
        return Find(arr, index+1, key);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to find in the file: ");
        int number = sc.nextInt();

        int result = Find(arr, 0, number);
        if(result == -1){
            System.out.println("Document not found");
        }
        else{
            System.out.println("number found at index: "+ result);
        }

    }
}
