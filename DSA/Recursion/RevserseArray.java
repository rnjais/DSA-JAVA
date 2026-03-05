public class RevserseArray {
    static void q1(int i,int arr[]){
        if(i<0)
            return;
        System.out.print(arr[i]+" ");
        q1(i-1,arr);
    }
    static int [] q2(int l,int r,int arr[]){
        if(l>=r)
            return arr;
       int temp = arr[l];
       arr[l] = arr[r];
       arr[r] = temp;
        return q2(l+1,r-1,arr);
    }
    public static void main(String[] args) {
       int arr[] = {3,1,6,9,5};
       int l = 0;
       int i = arr.length-1;
       arr = q2(l,i,arr);
       for (int x : arr) {
        System.out.print(x+" ");
       }

    }
}
