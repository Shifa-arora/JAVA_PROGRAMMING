class Solution1 {
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