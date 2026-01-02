public class PrintNumberReverseOrder {
    public static void re(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
         re(n-1);
    }
    public static void main(String[] args) {
        re(10);
    }
}
