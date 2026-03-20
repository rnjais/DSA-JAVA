package LeetCodeProblems;

public class P7RemoveElement {
    static int a1(int nums[], int val) {
        if (nums.length == 0) {
            return 0;
        }
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = { 0,1,2,2,3,0,4,2 };
        int val = 2;

        int k = a1(nums, val);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
