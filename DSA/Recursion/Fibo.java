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

    public static void fibo(int n, int f, int s) {
        if (n == 5) {
            return;
        }
        int fibo = f + s;
        System.out.println(fibo);
        fibo(n + 1, s, fibo); // fibo(n+1, f=s, s=fibo);

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
        // int a =0;
        // int b = 1;
        // System.out.println(a);
        // System.out.println(b);
        // fibo(0, a, b);
        // System.out.println(fibo1(1));
        int n = 10;
        for (int i = 0; i <= n; i++) {
            System.out.println(fibo1(i));
        }
    }
}