package CollectionDemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque d = new ArrayDeque();

        d.add("deepak");
        d.add("ballu");
        d.add("ashu");
        d.add("faizal");

        System.out.println(d);
         d.addLast("baghel");
         d.addLast("khan");
        System.out.println(d);

        d.offerFirst("audi");
        d.offerLast("g63d");
        System.out.println(d);

        d.removeFirst();
        System.out.println(d);

        d.removeLast();
        System.out.println(d);

        d.pollFirst();
        d.pollLast();
        d.remove();
        System.out.println(d);



    }

}
