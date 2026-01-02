public class Factorial {
    
    public static int re(int n){
        if(n==1){
            return 1;
        }
        return n * re(n - 1);
    }
    public static void factorial(int n, int fact){
        if(n==5){
            fact = fact * n;
            System.out.println(fact);
            return;
        }
        fact = fact * n;
        factorial(n+1,fact);  
    }
    public static void main(String[] args) {
        // System.out.println(re(5));
        factorial(1,1);
    }
}
