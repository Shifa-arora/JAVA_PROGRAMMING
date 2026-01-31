package RECURSIONpractice;
import java.util.*;
public class LastIndex {
    public static int lastIndex(int[] arr, int index, int number){
        if(index == arr.length){
            return -1;
        }

        int foundLater = lastIndex(arr, index+1, number);
        
        if(foundLater!= -1){
            return foundLater;
        }
        if(arr[index]==number){
            return index;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array index: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key number you want to find at last index: ");
        int key = sc.nextInt();

        int result = lastIndex(arr, 0, key);
        if(result == -1){
            System.out.println("not exist");
        }
        else{
            System.out.println("the last index of given key found at index: "+result);
        }
    }
}
