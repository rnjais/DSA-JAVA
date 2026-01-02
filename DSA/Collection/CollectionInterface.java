import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface{
    public static void main(String[] args) {
        Collection <Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(3);
        nums.add(1);
        nums.add(8);
        nums.add(5);
        nums.add(5);
        // Collection Interface doesn't provide index of element
        for (int n : nums) {
            System.out.println(n);
        }
        //  nums.remove(1);
        System.out.println(nums.size());
        // System.out.println(nums.hashCode());
       
        nums.clear();
        System.out.println(nums);
    }
}
// | Feature            | Collection        | List  |
// | ------------------ | ----------------  | ----- |
// | Order maintained   | ❌ Not guaranteed | ✅ Yes |
// | Index-based access | ❌ No             | ✅ Yes |
// | Allows duplicates  | Depends           | ✅ Yes |
// | get(index)         | ❌                | ✅     |
