public class Armstrong {
    
    public static void method1(int n){
        int original = n;
        int count = 0;
        int temp = n;
        int value = 0;
        int sum = 0;
        while (n != 0) {
            n = n / 10;
            count++;
            if (n == 0) {
                while (temp != 0) {
                    int d = temp % 10;
                    value = (int) Math.pow(d, count);
                    sum = sum + value;
                    temp = temp / 10;
                }
            }
        }
        if (original == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not");
        }
    }
    static boolean method2(int n){
        int digit = 0;
        int temp = n;
        int value = 0; 
        int sum = 0;
        while(temp!=0){
            temp = temp /10;
            digit++;
        }
        temp = n;
        while(temp > 0){
            int lastdigit = temp % 10;
            value = (int)Math.pow(lastdigit, digit);
            sum = sum + value;
            temp = temp / 10;
        }
        if(sum==n){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
      System.out.println(method2(136575634));
    }
}
