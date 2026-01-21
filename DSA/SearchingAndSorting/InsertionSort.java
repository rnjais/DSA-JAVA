package DSA.SearchingAndSorting;

public class InsertionSort {
    public static void method(int a[]) {
        int size = a.length;
         System.out.println("Before Sorting \n");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println("\n---------- \n");

        for (int i = 0; i < size - 1; i++) {
            int key = i + 1;
            for (int j = key - 1; 0 <= j; j--) {
                if (a[j] > a[key]) {
                    int temp = a[j];
                    a[j] = a[key];
                    a[key] = temp;
                    key--;
                    for (int k : a) {
                        System.out.print(k + " ");
                    }
                    System.out.println();
                }
            }
        }
        System.out.println("After Sorting \n");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = { 9,2,8,5,1,8,6,4,3,9,5,6,8 };
        method(a);
    }
}
