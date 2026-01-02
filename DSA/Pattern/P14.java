public class P14 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int start;
            if (i%2==0){
                start = 1;
            }else{
                start = 0;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+start);
                start = 1-start;
            }
            System.out.println();
        }
    }
    
}
