public class PrimeNumber {
    static void method1(){
   int n = 100;

for(int i = 2; i <= n; i++) {
    boolean prime = true;
    for(int j = 2; j <= i/2; j++) {
        if(i % j == 0) {
            prime = false;
            break;
        }
    }
    if(prime)
        System.out.print(i + " ");
}

    }
    static void method2(int n){
        int count = 0;
        for (int i = 1; i <= n; i++) {
           if(n%i==0) {
            count++;
           }
        }
        if(count == 2){
            System.out.println("Prime");
        }else{
            System.out.println("Not");
        }
    }
    public static void main(String[] args) {
       method2(0);
    }
}
