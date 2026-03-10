public class MaxElementInArray {
    static int a1(int arr[], int i){
        if(i==arr.length-1)
            return arr[i];
        return Math.max(arr[i], a1(arr, i+1));
    }
    public static void main(String[] args) {
        int arr[] = {4,1,7,9,3,5};
        System.out.println(a1(arr, 0));
    }
}
