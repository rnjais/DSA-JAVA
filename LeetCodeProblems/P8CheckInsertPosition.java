package LeetCodeProblems;

public class P8CheckInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int targetIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                targetIndex = i;
                
            } else if (target != nums[i]) {
                for (int j = 1; j < nums.length; j++) {
                    if (nums[j - 1] <= target && target <= nums[j]) {
                        targetIndex = j;
                    }
                }
            }
        }
        return targetIndex;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 5, 6 };
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }
}
