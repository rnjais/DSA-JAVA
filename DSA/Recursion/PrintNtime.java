class PrintNtime {
    int n = 0;
    public static int  re(int n) {  //using return
         
        if(n == 5){
            return 5; 
        }
       System.out.println(n);
       return re(n+1);
       
    }
    static void re(int i, int n){ // using void
    if(i > n)
    return;
    System.out.println(i);
    re(i+1, n);
    }
    static void reB(int i, int n){ // using Backtracking
    if(i == 0)
    return;
    reB(i-1, n);
    System.out.println(i);
    }
    

    public static void main(String[] args) {
       reB(5,5);
    }
}