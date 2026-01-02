public class CountDigit {
    public static int m1(int n){
        int count = 0;

        if (n == 0) {
            return 1;
        }
        while (n > 0) {
            count++;
            n = n / 10;
        }
       return count;
    }
     public static int m2(int n){
        int count;
        if(n==0){
            return 1;            
        }
        else{
             count =(int) Math.log10(n)+1;
        return count;
        }
     }
    public static void main(String[] args) {
        // System.out.println(m2(1427));
        int m =4;
        // double n = Math.log10(m);
        int n =2;
        System.out.println(n);
        System.out.println(Math.pow(m, n));
        
    }
}