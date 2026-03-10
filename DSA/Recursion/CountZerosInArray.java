public class CountZerosInArray {
    static int a1(int arr[], int i, int count){
        if(i==arr.length)
            return count;
        if(arr[i]==0)
            count = count + 1;
        return a1(arr, i+1, count);
    }
    public static void main(String[] args) {
        int arr[] = {5,0,0,9,0,0};
        System.out.println(a1(arr, 0, 0));
    }
}
