public class CheckDivisor {
    public static void check(){
        int a = 5;
        int b = 6;
        System.out.println(Math.max(a, b));
    }
    public static void findGcd1(int n1, int n2) {
      
        System.out.println("Factor of " + n1 + ":");
        for (int i = 1; i <= 10; i++) {
            if (n1 % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Factor of " + n2 + ":");
        for (int i = 1; i <= 10; i++) {
            if (n2 % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Common Factors: ");
        for (int i = 1; i <= 10; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
            int gcd = 1;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i; // keep updating, last value will be the biggest
            }
        }
        System.out.println("Greatest Common Factor: "+gcd);
    }

    public static int findGcd2(int n1, int n2) {
        // Initialize gcd to 1
        int gcd = 1;

        // Iterate from 1 up to
        // the minimum of n1 and n2
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            // Check if i is a common
            // factor of both n1 and n2
            if (n1 % i == 0 && n2 % i == 0) {
                // Update gcd to the
                // current common factor i
                gcd = i;
            }
        }

        // Return the greatest
        // common divisor (gcd)
        return gcd;
    }

    public static void main(String[] args) {
       findGcd1(8, 6);

         System.out.println(findGcd2(12, 9));
            check();
    }
}
