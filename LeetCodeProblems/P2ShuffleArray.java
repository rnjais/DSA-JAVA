package LeetCodeProblems;

public class P2ShuffleArray {
        static int[] method(int nums[], int n){
        int ans [] = new int[2*n];
        for(int i = 0; i < n; i++){
            ans[2*i] = nums[i];
            ans[2*i+1] = nums[i+n];
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,2,1,5};
        int  n = 3;
        nums= method(nums, n);
        for (int i : nums) {
            System.out.print(i+" ");
        }

    }
}
