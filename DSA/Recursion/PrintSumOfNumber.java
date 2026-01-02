public class PrintSumOfNumber {
    //   public int sumOfSquare(int number) {
    
    //     int sum = 0;
    //     for(int i = 1; i <= number; i++){
            
    //         sum = sum + (int) Math.pow(i,2);
    //     }
    //     return sum;
    // }
    //   public static void sumOfSquares(int number) {
      
    //     int sum = 0;
    //     for(int i = 1; i <= number; i++){
            
    //         sum = sum + (int) Math.pow(i,2);
    //     }
    //     System.out.println(sum);
    // }
   
    
    public static int re(int n) {
        if (n == 0) {
            
            return 0;
        }
        return n + re(n - 1);

    }
     public static void sumofNumber(int i, int n,int sum){
       
        if(n==i){
            sum+=i*i;
            System.out.println(sum);
            return;
        }
        sum = sum + i*i;
        sumofNumber(i + 1,n,sum);
    }
    
    public static void main(String[] args) {
       sumofNumber(1,5,0); 
      
    }
}
