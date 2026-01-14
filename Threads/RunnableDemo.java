class MyTask implements Runnable {

    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {

        MyTask task = new MyTask();     // task created
        Thread t = new Thread(task);   // thread created with task
        t.start();                     // thread starts
    }
}
// Runnable is an interface that represents a task, and Thread is used to execute that task in a separate thread.

//   In Java:
// You cannot extend more than one class

// If you already extend some class, you can’t extend Thread
// 👉 Solution?
// Use Runnable interface (because interfaces can be implemented).