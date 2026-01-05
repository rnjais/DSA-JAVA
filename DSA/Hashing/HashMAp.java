
package DSA.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class HashMAp {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(101, "Aryan");
        map.put(102, "Karan");
        map.put(103, "Rahul");

        System.out.println(map);//{101=Aryan, 102=Karan, 103=Rahul}

        map.put(103, null);//If I update or modify to exsisting corresponding key the value will update and replace with olderr value

        System.out.println(map);//{101=Aryan, 102=Karan, 103=null}

        System.out.println(map.get(101));//Aryan

        System.out.println(map.containsKey(101));//this method checks the key is exist or not it returns boolean vaue true/false
        
        System.out.println(map.containsValue("Rahul"));//this method checks the value is exist or not it returns boolean value true/false

        System.out.println(map.size());//3

        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey());
        }
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getValue());
        }
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e);
        }

        Set <Integer> keys = map.keySet();
        for (int key : keys) {
            System.out.println(key);
        }
        //Map.Entry<Integer, String> => Type
        
        System.out.println(map.entrySet());//[101=Aryan, 102=Karan, 103=null]

        System.out.println(map.keySet());//[101, 102, 103]
        
        System.out.println(map.values());//[Aryan, Karan, null]

        map.remove(103);
        System.out.println(map);//{101=Aryan, 102=Karan}
    }
}
