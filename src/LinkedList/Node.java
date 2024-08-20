package LinkedList;

import java.util.Stack;

public class Node {

        public static void main(String[] args) {
            Stack st  = new Stack();
            st.push("aaa");
            st.push("bbb");
            st.push("ccc");


           System.out.println(st.search("ccc"));
            System.out.println(st.pop());
            System.out.println(st.peek());

            st.push("deepak");
            st.push(" baghel");
            System.out.println();

        }
    }

