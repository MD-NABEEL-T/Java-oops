// Without yield() → one thread may finish fully first
// With yield() → threads take turns more often 

class MyThread extends Thread {

    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            
            // Give chance to other threads
            Thread.yield();
        }
    }
}

public class YieldDemo {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}
// | `yield()`                    | `sleep()`                     |
// | ---------------------------- | ----------------------------- |
// | Gives up CPU **voluntarily** | Forces thread to pause        |
// | Time not fixed               | Time is fixed                 |
// | No exception                 | Throws `InterruptedException` |
