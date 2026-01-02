public class Palindrome {
    public static void main(String[] args) {
        int n = 54745;
        int rev = 0;
        int temp = n;
        while(n!=0){
            int l = n%10;
            rev = rev * 10 + l;
            n = n/10;
        }
        if(temp == rev){
            System.out.println("Palindrome");
        }else{
        System.out.println("Not");
    }
    }
}
