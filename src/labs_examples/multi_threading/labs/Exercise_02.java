package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class Thread02Controller {
    public static void main(String[] args) {
        Thread02 myFirstThread = new Thread02("My first thread...");
        Thread02 mySecondThread = new Thread02("My second thread...");
    }
}

class Thread02 extends Thread{
    public Thread02(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " is running...");
    }
}
