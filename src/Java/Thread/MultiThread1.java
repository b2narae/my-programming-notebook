package Java.Thread;

public class MultiThread1 implements Runnable {
    int TestNum = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (Thread.currentThread().getName().equals("A")) {
                System.out.println("=====");
                TestNum++;
            }
            System.out.println("ThreadName : " + Thread.currentThread().getName() + " / TestNum : " + TestNum);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main (String[] args) {
        MultiThread1 thread1M = new MultiThread1();
        MultiThread1 thread2M = new MultiThread1();
        Thread thread1 = new Thread(thread1M, "A");
        Thread thread2 = new Thread(thread2M, "B");

        thread1.start();
        thread2.start();

        // Thread.currentThread().getName();
    }
}
