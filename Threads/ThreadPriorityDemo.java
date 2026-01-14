// Java threads have priority from 1 to 10
// Higher priority thread → more chance to get CPU time
// Not guaranteed order, but you’ll usually see high priority run more

class MyThread extends Thread {

    public void run() {
        // Print thread name and priority
        System.out.println(
            Thread.currentThread().getName() +
            " running with priority " +
            Thread.currentThread().getPriority()
        );
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5 (default)
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        // Set names
        t1.setName("Low Priority Thread");
        t2.setName("Normal Priority Thread");
        t3.setName("High Priority Thread");

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}
