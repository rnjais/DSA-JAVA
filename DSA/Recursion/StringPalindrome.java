public class StringPalindrome {
       static void q1(String str){
        String rev ="";
        for(int i = str.length()-1; 0 <= i; i--){
         rev= rev +  str.charAt(i);
        }
      if(str.equals(rev)){
          System.out.println("Palindrome");
      }else{
          System.out.println("Not");
      }
    }
    
    public static void main(String[] args) {
        
    }
}
