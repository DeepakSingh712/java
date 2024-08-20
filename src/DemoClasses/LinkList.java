package DemoClasses;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkList {
    public static void main(String[] args) {
        LinkedList Aa = new LinkedList<>();
        for(int i = 1; i <= 10; i++) {
            // Aa.addFirst(i);
            Aa.addLast(i);
        }    System.out.println(Aa);

    }
}
