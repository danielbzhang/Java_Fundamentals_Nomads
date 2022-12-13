package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 * <p>
 * Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 * working as expected
 */
class Sender {
    public synchronized void send(String msg) {
        System.out.println("Sending\t" + msg);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n" + msg + "Sent.");
    }
}

class ThreadedSend extends Thread {
    private String msg;
    private Thread t;
    Sender sender;

    ThreadedSend(String m, Sender obj) {
        msg = m;
        sender = obj;
    }

    //    public void run() {
//        synchronized (sender) {
//            sender.send(msg);
//        }
//    }
    @Override
    public void run() {
        sender.send(msg);
    }
}

class SyncDemo {
    public static void main(String[] args) {
        Sender snd = new Sender();
        ThreadedSend s1 = new ThreadedSend("hi", snd);
        ThreadedSend s2 = new ThreadedSend("bye", snd);

        s1.start();
        s2.start();

        try {
            s1.join();
            //  main thread will wait until s1 completes before moving forward.
            s2.join();
        } catch (Exception e) {
            System.out.println("Interrupted.");
        }
    }
}