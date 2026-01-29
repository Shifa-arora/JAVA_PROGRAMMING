import java.util.ArrayList;
import java.util.List;
// import java.util.Scanner;

public class Permutation {
    // public static void substring(String str) {
    //     for(int i=0; i<str.length(); i++){
    //         for(int j=0; j<str.length(); j++){
    //             for(int k=0; k<str.length(); k++){
    //                 if(i!=j && j!=k && k!=i){
    //                     System.out.print(""+str.charAt(i)+str.charAt(j)+str.charAt(k));
    //                 }
    //             }
    //             System.out.println();
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner st = new Scanner(System.in);
        
    //     String str = st.nextLine();
    //     substring(str);
    // }


            //BY RECURSION


    private void Solve(int[] nums, List<List<Integer>> ans, int index){
        if(index >= nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int num : nums){
                temp.add(num);
            }
            ans.add(temp);
            return;
        }
        for(int j = index; j<nums.length;j++){
            swap(nums, index, j);
            Solve(nums, ans, index+1);
            swap(nums, index, j);
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Solve(nums, ans, 0);
        return ans;
    }

}