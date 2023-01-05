package labs_examples.datastructures.linkedlist.labs;

/**
 *      LinkedLists - Exercise_02
 *
 *      Write your own custom LinkedList class. Although it can mimic the CustomLinkedList
 *      class we used here, it must be entirely unique. Please also add at least two
 *      additional helper methods that you think could be useful. Refer to Java's built-in
 *      LinkedList class for inspiration. Your new LinkedList class should ONLY allow users
 *      to add and remove elements from the front of the list AND the end of the list.
 *      Also, instead of using the index in the get() and remove() methods, these methods should
 *      get() and remove() based by the Node's value, not it's index.
 */

class CustomeLinkedList<T> {
    private Node head;

    public CustomeLinkedList(T... data) {
        if(data.length < 1) {
            head = null;
        } else {
            for (int i = 0; i < data.length; i++) {
                // add(data[i]);
            }
        }
    }
}

class Node<T> {
    T data;
    Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public Node(T data, Node node) {
        this.data = data;
        this.next = node;
    }
}