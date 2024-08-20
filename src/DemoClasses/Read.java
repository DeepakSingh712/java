package DemoClasses;

import Assignment9.Array;

import java.util.ArrayList;

public class Read {

    public static void main(String[] args) {
        ArrayList List = new ArrayList();
        List.add(10);
        List.add(20);
        List.add(30);

        ArrayList List2 = new ArrayList();
        List2.add("deepak");
        List2.add(10);
        List2.add("Baghel");

        List.addAll(List);
        System.out.println(List.size());
        List.clone();
    }
}
