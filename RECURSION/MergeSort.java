// Merge Sort Program in Java
// Merge Sort uses Divide and Conquer technique
// Time Complexity:
// Best Case   -> O(n log n)
// Average Case-> O(n log n)
// Worst Case  -> O(n log n)

public class MergeSort {
    // Function to divide the array into smaller parts
    static void mergeSort(int arr[], int left, int right) {

        // Check if array has more than 1 element
        if (left < right) {

            // Find middle index
            int mid = (left + right) / 2;

            // Recursively sort left half
            mergeSort(arr, left, mid);

            // Recursively sort right half
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Function to merge two sorted subarrays
    static void merge(int arr[], int left, int mid, int right) {

        // Find sizes of two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data into left temporary array
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        // Copy data into right temporary array
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // Initial indexes
        int i = 0; // index for L[]
        int j = 0; // index for R[]
        int k = left; // index for main array

        // Compare elements from both arrays
        // Put smaller element into original array
        while (i < n1 && j < n2) {

            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Function to print array
    static void printArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String args[]) {

        // Original array
        int arr[] = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original Array:");
        printArray(arr);

        // Call merge sort function
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
