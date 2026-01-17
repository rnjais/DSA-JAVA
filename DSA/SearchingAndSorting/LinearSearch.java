package DSA.SearchingAndSorting;

public class LinearSearch {

    // Linear Search method
    // Returns true if target element is found, otherwise false
    public static boolean lSearch(int a[], int target) {

        // Traverse the array element by element
        for (int i = 0; i < a.length; i++) {

            // Check if current element matches target
            if (a[i] == target) {
                return true; // Element found
            }
        }

        // Element not found after checking all elements
        return false;
    }

    public static void main(String[] args) {

        // Input array
        int a[] = { 2, 4, 6, 8, 10 };

        // Element to search
        int target = 10971;

        // Call linear search method
        boolean result = lSearch(a, target);

        // Print result
        if (result == true) {
            System.out.println("Element Found");
        } else {
            System.out.println("Not Found");
        }
    }
}

