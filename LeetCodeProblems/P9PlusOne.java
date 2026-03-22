package LeetCodeProblems;

import java.util.ArrayList;

public class P9PlusOne {
    static int [] a1(int digit[]){
        ArrayList<Integer> list = new ArrayList<>();
         for (int i = 0; i < digit.length; i++) {
            list.add(digit[i]);
         }
        for (int i = 0; i < digit.length; i++) {

            if(i==digit.length-1){
                digit[i] = digit[i]+1;
            }
        }
        return digit;
    }
    public static void main(String[] args) {
        int digit [] = {1,2,3,5};
        digit = a1(digit);
        for (int i : digit) {
            System.out.print(i+" ");
        }
    }
}
