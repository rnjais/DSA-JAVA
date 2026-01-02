import java.util.Scanner;
public class P18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
          for (int i = 0; i < n; i++) {
            for ( char c = 'a'; c <= 'a'+ (n - i - 1); c++) {
                System.out.print(c);
            }
            System.out.println();
        }
      sc.close();
    }
}
