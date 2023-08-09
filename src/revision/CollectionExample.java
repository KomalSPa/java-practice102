package revision;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(2);
        list.add("Prime");
        list.add(null);
        list.add(true);
        ArrayList list1 = new ArrayList();

        for ( Object object : list){
            System.out.println(object);
        }
        System.out.println("--------------------------------------------------------");
        HashSet set = new HashSet();
        set.add("Green");
        set.add(2);
        set.add(null);
        set.add("prime");


        for ( Object o : set){
            System.out.println(o);
            System.out.println("---------------------------------------------------------------");
            HashMap<Integer, String> map = new HashMap<>();
            Map<Integer, String> map1 = new HashMap();
            map.put(2,"Testing");
            map.put(1,"Prime");
            map.put(3,"Java");
            Set colour = map1.entrySet();
            for ( Object o1 : colour) {
                System.out.println(o);
            }
    }
}}
