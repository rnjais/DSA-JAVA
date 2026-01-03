public class StringPalindrome {
    static void q1(String str) {
        String rev = "";
        for (int i = str.length() - 1; 0 <= i; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not");
        }
    }

    static void m1(String str, int i, String rev) {
        if (i < 0) {

            if (str.equals(rev)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not");
            }
            return;
        }
        rev = rev + str.charAt(i);
        m1(str, i - 1, rev);
    }
    static boolean m2(String str, int start, int end){
        if(start==str.length()-1){  
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        return m2(str, start+1, end-1);
    }
    static boolean m3(String str, int i){
        if(i==str.length()-1){  
            return true;
        }
        if(str.charAt(i)!=str.charAt(str.length()-1-i)){
            return false;
        }
        return m3(str, i+1);
    }

    public static void main(String[] args) {
        String str = "madam";
        String rev = "";
        int i = 0;
        // m1(str, i, rev);
        System.out.println(m3(str,i));
    }
}
