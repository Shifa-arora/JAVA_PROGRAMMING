package RECURSIONpractice;

import java.util.Scanner;

public class OfficeFilesPractice {
    static boolean IsSort(int ids[], int index){
        if(index == ids.length-1){
            return true;
        }
        
        if(ids[index] > ids[index+1]){
            return false;
        }
        return IsSort(ids, index+1);
    }
    public static void main(String[] args){
        Scanner st = new Scanner(System.in);
        int n = st.nextInt();
        int ID[] = new int[n];
        for(int i=0; i<n; i++){
            ID[i] = st.nextInt();
        }
        if(IsSort(ID, 0)){
            System.out.println("Id's are Sorted.");
        }
        else{
            System.out.println("Id's are not sorted.");
        }
    }
}
