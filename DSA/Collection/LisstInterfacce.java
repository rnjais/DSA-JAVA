import java.util.*;

public class LisstInterfacce {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        // List<Integer> list2 = new LinkedList();
        // List<Integer> list3 = new Vector();
        // List<Integer> list4 = new Stack();
        list1.add(3);
        list1.add(3);
        list1.add(1);
        list1.add(8);
        list1.add(5);
        for (int n : list1) {
            System.out.println(n);
        }
        System.out.println(list1.get(0));
        System.out.println(list1.indexOf(3));
        // List Interface Support Index value
        // List Support Duplicate Value

        Iterator<Integer> itr = list1.iterator(); // Traversing list through Iterator
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }
}
