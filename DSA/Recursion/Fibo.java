public class Fibo {
    public static void re(int n) {
        int f = 0;
        System.out.println(f);
        int s = 1;
        System.out.println(s);
        int fibo;

        for (int i = 2; i < n; i++) {
            fibo = f + s;
            f = s;
            s = fibo;
            System.out.println(fibo);
        }
    }



    public static int fibo1(int n) {
       if(n==0){
        return 0;
       }
       if(n==1){
        return 1;
       }
       return fibo1(n-1)+fibo1(n-2);
    }
    public static void main(String[] args) {
      
        
        int n = 0;
        for (int i = 0; i <= n; i++) {
            System.out.println(fibo1(i));
        }
    }
}