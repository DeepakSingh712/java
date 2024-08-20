package PracticalQuetions;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map map = new java.util.HashMap();
        map.put(5,"Raj");
        map.put(3,"deepak");
        map.put(1,"ronak");
        map.put(4,"Rahul");
        map.put(2,"rohit");
        System.out.println(map);
        System.out.println(map.get(4));
        System.out.println(map.keySet());

    }
}
