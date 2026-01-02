public class P13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 2*4; i++) {
            int star = 2*i-1;
            int space = 4-i;
            if(i>4)space = i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            if(i>4)star = 2*4-i;
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            
        System.out.println();
            
        }
    }
    
}
//   for (int i = 1; i <= 2*4; i++) {
//             int star = 2*i-1;
//             int space = 4-i;
//             // if(i==4)space = i;
//             for (int j = 1; j <= space; j++) {
//                 System.out.print(" ");
//             }
//             // if(i==4)star = 2*4-i;
//             for (int j = 1; j <= star; j++) {
//                 System.out.print("*");
//             }
//             // if(i==4)space = i;
//             for (int j = 1; j <= space; j++) {
//                 System.out.print(" ");
//             }
//         System.out.println();
            
//         }