package CollectionDemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueDemo {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();

        deque.offer("mercedes");
        deque.offer("dodge challenger");
        deque.offer("jaguar");
        deque.offer("BMW");
        deque.offer("audi");

        System.out.println(deque.getFirst());
        System.out.println(deque.offer("dodge charger"));
        System.out.println(deque.add("rolls royce"));
        System.out.println(deque.peek());
        System.out.println(deque.peekLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());


    }
}
