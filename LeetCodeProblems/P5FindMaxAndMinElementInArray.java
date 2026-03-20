package LeetCodeProblems;

public class P5FindMaxAndMinElementInArray {
    static String a1(int arr[]){
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return "Maximum Element: "+max+"\nMinimum Element: "+ min;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,5,10};
        System.out.println(a1(arr));
    }
}
