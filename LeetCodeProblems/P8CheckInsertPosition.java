package LeetCodeProblems;

public class P8CheckInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int targetIndex = 0;
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                targetIndex = i;
            }
        }
        i++;
        if (i == nums.length) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[j - 1] <= target && target <= nums[j]) {
                    targetIndex = j;
                }
            }
        }
        return targetIndex;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 5, 6 };
        int target = 4;
        System.out.println(searchInsert(nums, target));
    }
}
