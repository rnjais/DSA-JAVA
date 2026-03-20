

package LeetCodeProblems;

public class P6RemoveDuplicateElementInArray {
    
  static int a1(int nums[]){
    if(nums.length==0){
        return 0;
    }
      int k = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]){// Check Element is Unique
                nums[k] = nums[i];//Stores uniques Element
                k++;
            }
        }
        return k;
  }
    public static void main(String args[]){
         int[] nums = {1,2,2,3};

        int k = a1(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
   
   
   }


