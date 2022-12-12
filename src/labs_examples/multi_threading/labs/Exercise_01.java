package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 * <p>
 * 1: Create an application that starts a Thread by implementing the Runnable interface
 * 2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 */

class Thread01Controller {
    public static void main(String[] args) {
        System.out.println("Main thread starts...");
        Thread01 MyFirstThread = new Thread01("thread1");
        Thread01 MySecondThread = new Thread01("thread2");
        Thread01 MyThirdThread = new Thread01("thread3");
        System.out.println("Main thread ends...");
    }
}

class Thread01 implements Runnable {
    Thread thread;

    public Thread01(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " starting...");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.println("In " + thread.getName() + " count is " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(thread.getName() + " terminating ...");
    }
}


