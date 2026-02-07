package DSA.SearchingAndSorting;

public class InsertionSort {
    public static void method(int a[]) {
        int size = a.length;
 
   for (int i = 1; i < size; i++) {
            int key = a[i];   // element to insert
            int j = i - 1;

            // shift elements greater than key
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = key; // insert key

    }
    for (int i : a) {
        System.out.print(i+" ");
    }
}

    public static void main(String[] args) {
        int a[] = { 9, 2, 8, 5, 1, 8 };
        method(a);
    }
}
