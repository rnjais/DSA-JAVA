public class PrintReverseArray {
    static void re(int a[],int i){
        if(i==a.length){
            return;
        }
        re(a, i+1);
        System.out.println(a[i]);
        
    }
    public static void main(String[] args) {
       int a[] = {2,4,6,8,10};
       int i = 0;
       re(a, i); 
    }
}
