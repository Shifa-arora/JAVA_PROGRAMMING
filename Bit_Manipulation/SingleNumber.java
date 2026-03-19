//Bit manipulation

package Bit_Manipulation;

import java.util.Scanner;

public class SingleNumber{
    public static int Singlenumber(int n) {
        int result = 0;
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=0; j<n.length; j++){
                if(((nums[j]>>i)&1)){
                    sum ++;
                }
            }
            sum = sum % 3;
            if(sum!=0){
                
            }
        }
        
    }
    public static void main(String[] args) {
     Scanner st = new Scanner(System.in);
     int n = st.nextInt();
     System.out.println(Singlenumber(n));   
    }
}