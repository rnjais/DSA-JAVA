package LeetCodeProblems;

public class P4CheckArrayIsSorted {
    
    // Function to check if the array is sorted
    public static boolean isSorted(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // If any element is smaller than the previous one, return false
                if (arr[j] < arr[i]) 
                    return false;
            }
        }
        return true; // Return true if no unsorted elements are found
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 5;
       boolean ans =isSorted(arr, n);
        // Output result
       System.out.println(ans);
    }
}


