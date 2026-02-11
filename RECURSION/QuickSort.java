package RECURSION;
import java.util.*;

public class QuickSort{
    public static void  QuickSort(int arr[], int low , int high) {
        if(low<high){
            int pivot = partition(arr, low, high);
            QuickSort(arr, low, pivot-1);
            QuickSort(arr, pivot+1, high);
        }
    }
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr,i, j);
            }
        }
        swap(arr, i+1, high); //i+1 pivot se bda element h to pivot ko piche le gye pivot ko
        return i+1;
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        int num[] = {35, 24, 10, 7, 9, 1};
        QuickSort(num, 0, num.length-1);
        for(int n: num){
            System.out.println(n+" ");
        }
    }
}