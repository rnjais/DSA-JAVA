import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();
        //Insertion
        nums.add(25);
        nums.add(36);
        nums.add(16);
        nums.add(86);
        nums.add(55);
        nums.add(55);

        //  How to Print all Element
         for (int n : nums) {
            System.out.println(n);      //Hashset doesn't support duplicate value
        }
       System.out.println( nums.contains(25));//true
       //nums.clear();[]

        if(!nums.contains(2)){
            System.out.println("Does Not Contain 2");
        }
        //Iterator
       Iterator<Integer> itr = nums.iterator();
       while(itr.hasNext()){
       System.out.println(itr.next());
       }
    }
}               //Time Complexity
// Insert Add       O(1) 
// Search Contain   O(1) 
// Delete Remove    O(1) 

// Always use:
// Set<Integer> nums = new HashSet<>();
// Map<Integer, Integer> map = new HashMap<>();
// List<Integer> list = new ArrayList<>();

//hasNext()--> True/False