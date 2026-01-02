class PrintNtime {
    int n = 0;
    public static int  re(int n) { 
         
        if(n == 5){
            return 5; 
        }
       System.out.println(n);
       return re(n+1);
       
    }

    public static void main(String[] args) {
        System.out.println(re(1));
    }
}