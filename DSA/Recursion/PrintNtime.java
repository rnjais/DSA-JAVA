class PrintNtime {
    int n = 0;
    public static int  re(int n) { 
         
        if(n == 5){
            return 5; 
        }
       System.out.println(n);
       return re(n+1);
       
    }
    static void re(int i, int n){
    if(i > n)
    return;
    System.out.println(i);
    re(i+1, n);
    }

    public static void main(String[] args) {
       re(1,5);
    }
}