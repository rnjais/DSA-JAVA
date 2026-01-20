package DSA.SearchingAndSorting;
import java.util.Scanner;
public class SelectionSort {
    public static void maxiMumValue(int a[]) {
        int size = a.length; 
        int temp = 0;
        System.out.println("Before Sorting");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sorting");
        for (int i = 0; i < size; i++) {
            int min = 0;
            for (int j = 1; j < size - i; j++) {
                if (a[min] < a[j]) {
                    min = j;
                }
            }
            temp = a[min];
            a[min] = a[size - i - 1];
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
    public static void miniMumValue(int a[]) {
        int size = a.length; 
        int temp = 0;
        System.out.println("Before Sorting");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sorting");
        for (int i = 0; i < size; i++) {
            int min = i;
            for (int j = i; j < size; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            if(min!=i){
            temp = a[min];
            a[min] = a[i];
            a[i] = temp;
            }
         

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
        Scanner sc = new Scanner(System.in);
        int a[] = new int[6];
        System.out.println("Enter Element Of Array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        miniMumValue(a);
        sc.close();
    }

}
