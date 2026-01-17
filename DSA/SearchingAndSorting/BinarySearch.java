package DSA.SearchingAndSorting;

public class BinarySearch {

    // Iterative Binary Search
    // Returns true if target element is found, otherwise false
    public static boolean bSearch(int a[], int target) {

        // Left pointer starts from first index
        int left = 0;

        // Right pointer starts from last index
        int right = a.length - 1;

        // Loop continues while search space is valid
        while (left <= right) {

            // Find middle index
            int mid = (left + right) / 2;

            // If middle element is the target
            if (a[mid] == target) {
                return true;

            // If target is greater than middle element
            // Search in right half
            } else if (a[mid] < target) {
                left = mid + 1;

            // If target is smaller than middle element
            // Search in left half
            } else {
                right = mid - 1;
            }
        }

        // Element not found
        return false;
    }

    // Recursive Binary Search
    // Returns index of target if found, otherwise -1
    public static int bSearchUsingRecursion(int a[], int target, int left, int right) {

        // Base condition: search space is valid
        if (left <= right) {

            // Find middle index
            int mid = (left + right) / 2;

            // If middle element matches target
            if (a[mid] == target)
                return mid;

            // If target is greater than middle element
            // Search in right half recursively
            else if (a[mid] < target)
                return bSearchUsingRecursion(a, target, mid + 1, right);

            // If target is smaller than middle element
            // Search in left half recursively
            else
                return bSearchUsingRecursion(a, target, left, mid - 1);
        }

        // Base case: element not found
        return -1;
    }

    public static void main(String[] args) {

        // Sorted array (Binary Search works only on sorted data)
        int a[] = { 2, 4, 6, 8, 10 };

        // Element to search
        int target = 2;

        // Initial boundaries
        int left = 0;
        int right = a.length - 1;

        // Call recursive binary search
        int result = bSearchUsingRecursion(a, target, left, right);

        // Check result
        if (result != -1) {
            System.out.println("Element Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
