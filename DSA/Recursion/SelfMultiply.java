
public class SelfMultiply {
    public static int re1(int n, int x) {
        if (n == 0 && x == 0 || x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        

    if(n%2==0)// n is even
    {
    return (int)(Math.pow(x, n/2) * Math.pow(x, n/2));
    }
    else { // n is odd
    return (int)(Math.pow(x, n/2) * Math.pow(x, n/2) * x);

        
    // int value = (int) Math.pow(x, n);
       
    // return value;
    }
}

    public static void main(String[] args) {
        System.out.println(re1(5, 2));
        
    }
}
