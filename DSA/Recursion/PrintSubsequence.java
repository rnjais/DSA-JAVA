import java.util.ArrayList;
import java.util.List;

class PrintSubsequence {
 static void printSubsequence(int i,List<Integer> list,int arr[]){
    if(i==arr.length){
    System.out.println(list);
    return;
    }
    list.add(arr[i]);
    printSubsequence(i+1,list,arr);
    
    list.remove(list.size() - 1);
    printSubsequence(i+1,list,arr);
 }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 2 };
        List<Integer> list = new ArrayList<>();
        int i =0;
        printSubsequence(i,list,arr);

    }

}