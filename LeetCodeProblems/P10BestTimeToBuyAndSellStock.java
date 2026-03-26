package LeetCodeProblems;

public class P10BestTimeToBuyAndSellStock {
    static int a1(int prices[]){
        int min = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[min]>prices[i]){
                min = i;
            }
        }
        return prices[min];
    }
    public static void main(String[] args) {
        int prices [] = {7,1,5,3,6,4};
        System.out.println(a1(prices));
    }
}
