package LeetCodeProblems;

public class P3MaxConsecutiveOne {
    static int method(int nums[],int n){
         int count = 0;
      for (int i = 0; i < n; i++) {
       ;
        if(nums[i]==0){
            count = 0;
            continue;
        }
        if(nums[i]==1){
            count++;
        }
      }
      return count;
    }
    public static void main(String[] args) {
        int nums []= {1,1,0,1,1,1,1,1,1};
        int n = nums.length;
       int consecutive = method(nums, n);
       System.out.println(consecutive);
    }
}
