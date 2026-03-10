public class SumOfArray {
    static int a1(int arr[], int i){
        if(i==arr.length-1)
            return arr[i];
        return arr[i] + a1(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {4,6,1,9,2,9,4,7,1,2,0};
        System.out.println(a1(arr, 0));
    }
}
