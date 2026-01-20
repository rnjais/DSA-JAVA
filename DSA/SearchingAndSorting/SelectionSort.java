package DSA.SearchingAndSorting;

import java.util.Scanner;

public class SelectionSort {

    // This method sorts the array by selecting the MAXIMUM element
    // in each pass and placing it at the END of the array
    public static void maxiMumValue(int a[]) {

        int size = a.length; // Store the size of the array
        int temp = 0; // Temporary variable for swapping

        // Display array before sorting
        System.out.println("Before Sorting");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Sorting");

        // Outer loop controls number of passes
        for (int i = 0; i < size; i++) {

            int max = 0; // Stores index of maximum element in unsorted part

            // Find the maximum element index in the unsorted portion
            for (int j = 1; j < size - i; j++) {
                if (a[max] < a[j]) {
                    max = j;
                }
            }

            // Swap the maximum element with the last unsorted element
            temp = a[max];
            a[max] = a[size - i - 1];
            a[size - i - 1] = temp;

            // Print array after each pass
            for (int k : a) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        // Display array after sorting
        System.out.println();
        System.out.println("After Sorting");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    // This method sorts the array by selecting the MINIMUM element
    // in each pass and placing it at the BEGINNING of the array
    public static void miniMumValue(int a[]) {

        int size = a.length; // Store array size
        int temp = 0; // Temporary variable for swapping
        int minIndex = -1; // Stores index of minimum element

        // Display array before sorting
        System.out.println("Before Sorting");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Sorting");

        // Outer loop for each pass
        for (int i = 0; i < size; i++) {

            minIndex = i; // Assume current index has the minimum value

            // Find the minimum element index in the unsorted part
            for (int j = i + 1; j < size; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }

            // Swap only if a smaller element is found
            if (minIndex != i) {
                temp = a[minIndex];
                a[minIndex] = a[i];
                a[i] = temp;
            }

            // Print array after each pass
            for (int k : a) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        // Display array after sorting
        System.out.println();
        System.out.println("After Sorting");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[6]; // Declare array of size 6

        // Taking array input from user
        System.out.println("Enter Element Of Array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // Call selection sort (maximum version)
        maxiMumValue(a);

        sc.close(); // Close scanner to avoid resource leak
    }
}
