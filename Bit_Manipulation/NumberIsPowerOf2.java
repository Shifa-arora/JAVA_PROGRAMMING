package Bit_Manipulation;

public class NumberIsPowerOf2 {
    public static boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        return((n&(n-1))==0);
    }
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 8;

        System.out.println(num1 + "-->" + isPowerOfTwo(num1));
        System.out.println(num2 + "-->" + isPowerOfTwo(num2));
    }
}
