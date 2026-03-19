package LeetCodeProblems;

public class P1ConcatOfArray {
    static int[] method(int nums[], int n){
        int ans [] = new int[2*n];
        for(int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[n+i] = nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,2,1};
        int  n = nums.length;
       nums= method(nums,n);
       for (int i : nums) {
        System.out.print(i+" ");
       }
    }
}
