public class P17{
    public static void main(String[] args) {
       
        for (int i = 0; i < 5; i++) {
            for ( char c = 'a'; c <= 'a'+ i; c++) {
                System.out.print(c);
            }
            System.out.println();
        }

        for ( char ch = 'a'; ch <= 'a'+ 25; ch++) {
            System.out.print(ch);
        }
    }
}