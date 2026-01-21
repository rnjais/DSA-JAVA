package DSA.SearchingAndSorting;

public class InsertionSort {
    public static void method(int a[]) {
        int size = a.length;
 
        for (int i = 1; i < size ; i++) {
            int key = a[i];
            int j = i - 1;
            while (a[j] > key && j >= 0) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
           
        
      
    }

    public static void main(String[] args) {
        int a[] = { 9, 2, 8, 5, 1, 8 };
        method(a);
    }
}
