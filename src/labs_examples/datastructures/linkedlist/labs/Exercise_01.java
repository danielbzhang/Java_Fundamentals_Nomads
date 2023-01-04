package labs_examples.datastructures.linkedlist.labs;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *      LinkedLists - Exercise_01
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries)
 *      2) add()
 *      3) addAll()
 *      4) addFirst()
 *      5) addLast()
 *      6) getFirst()
 *      7) getLast()
 *      8) get()
 *      9) set()
 *      10) push()
 *      11) pop()
 *      12) remove()
 *      13) contains()
 *      14) listIterator()
 *      15) clear()
 */

class LinkedListDemo{
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        List<String> bb = new LinkedList<>();

        ll.add("Nick");
        ll.add("Bob");
        ll.add("Trent");

        bb.add("1");
        bb.add("2");
        bb.add("3");

        System.out.println(ll);
        System.out.println(bb);

        ll.addAll(bb);
        System.out.println(ll);

        ll.addFirst("First");
        ll.addLast("Last");
        System.out.println(ll);

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.get(2));
        System.out.println(ll.set(2, "Jeff"));
        System.out.println(ll);

        System.out.println("---push, pop, remove----------");
        ll.push("Push");
        System.out.println(ll);
        System.out.println(ll.pop());
        ll.remove();
        System.out.println("after remove: ");
        System.out.println(ll);

        System.out.println(ll.contains("Nick"));

        ListIterator<String> ite = ll.listIterator();
        while(ite.hasNext()) {
            System.out.println(ite.next());
        }

//        ll.clear();
    }
}