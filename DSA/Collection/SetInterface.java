import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(25);
        nums.add(36);
        nums.add(16);
        nums.add(86);
        nums.add(55);
        nums.add(55);
         for (int n : nums) {
            System.out.println(n);      //set doesn't support duplicate value
        }
    }
}
