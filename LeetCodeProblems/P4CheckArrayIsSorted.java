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

    public static boolean isSorted1(int[] arr, int n) {
        for (int i = 1; i < n; i++) {

            if (arr[i - 1] > arr[i])
                return false;
        }

        return true;
    }

    public static boolean isSorted2(int[] arr,int i) {

    int n = arr.length;

     if(i==n){
        return true;
     }
     if(arr[i]<arr[i-1])
        return false;

    return  isSorted2(arr, i+1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 10, 4, 5 };
        //int n = 5;
        boolean ans = isSorted2(arr, 1);
        // Output result
        System.out.println(ans);
    }
}
