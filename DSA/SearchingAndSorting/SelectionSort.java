package DSA.SearchingAndSorting;

public class SelectionSort {
    public static void method(int a[]) {
        int size = a.length;
        int temp = 0;
        System.out.println("Before Sorting");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sorting");
        for (int i = 0; i < size; i++) {
            int max = 0;
            for (int j = 1; j < size - i; j++) {
                if (a[max] < a[j]) {
                    max = j;
                }
            }
            temp = a[max];
            a[max] = a[size - i - 1];
            a[size - i - 1] = temp;

            for (int k : a) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("After Sorting");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int a[] = { 5, 8, 4, 9, 3, 6 };
        method(a);
    }

}
