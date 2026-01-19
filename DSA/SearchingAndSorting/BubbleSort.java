package DSA.SearchingAndSorting;

public class BubbleSort {
    public static void method(int a[]) {
        int size = a.length;
        int temp = 0;
        System.out.println("Before Sort:");
        for (int i : a) {
            System.out.print(i+" ");
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
                System.out.println();
                System.out.println("Sorting:");
                for (int k : a) {
                    System.out.print(k+" ");
                }
            }

        }
        System.out.println();
        System.out.println("After Sort:");
        for (int i : a) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {

        int a [] = {8,4,9,2,6};
        method(a);
    }
}