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
                 add(data[i]);
            }
        }
    }

    public void add(T data) {
        insert(data, size());
    }

    public void insert(T data, int index) {
        if(head == null) {
            head = new Node(data);
        } else {
            Node iterator = head;
            Node previous = null;

            if(index == 0) {
                head = new Node(data, head);
            } else if(index < size()) {
                int count = 0;
                while(count != index) {
                    previous = iterator;
                    iterator = iterator.next;
                    count++;
                }

                previous.next = new Node(data, iterator);
            } else {
                while(iterator.next != null) {
                    iterator = iterator.next;
                }

                iterator.next = new Node(data);
            }
        }
    }

    public T get(int index) {
        try {
            // simple variable to use for looping over the list
            int count = 0;


            // creating a new variable that initially references the "head" node
            // we'll use this new variable to traverse across the list
            Node iterator = head;


            // iterate until index is reach
            while (count != index) {
                iterator = iterator.next;
                count++;
            }
            return (T) iterator.data;


        } catch (NullPointerException ex) {
            return null; // list is empty
        }
    }

    public void set(int index, T data) {
        try {
            int count = 0;
            Node iterator = head;


            // iterate through list
            while (count != index) {
                iterator = iterator.next;
                count++;
            }


            // change data
            iterator.data = data;


        } catch (NullPointerException ex) {
            System.out.println("invalid index");
        }
    }

    public void remove(int index) {
        if(index == 0) {
            head = head.next;
        } else if(index < size()) {
            try{
                int count = 0;
                Node previous = null;
                Node iterator = head;

                while (count != index) {
                    previous = iterator;
                    iterator = iterator.next;
                    count++;
                }

                previous.next = iterator.next;

            } catch(NullPointerException ex) {
                System.out.println("Invalid index");
            }
        } else {
            Node iterator = head;
            while (iterator.next != null) {
                iterator = iterator.next;
            }

            iterator.next = null;
        }
    }

    public int size() {
        int count = 0;
        Node iterator = head;

        while(iterator != null) {
            count++;
            iterator = iterator.next;
        }

        return count;
    }

    public boolean isEmpty() {
        return head == null;
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