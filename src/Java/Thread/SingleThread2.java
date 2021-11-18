package Java.Thread;

// https://coding-factory.tistory.com/279

public class SingleThread2 implements Runnable {

    private int[] temp;

    public SingleThread2() {
        temp = new int[10];

        for (int start = 0; start < temp.length; start++) {
            temp[start] = start;
        }
    }

    @Override
    public void run() {
        for (int start : temp) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println("Name of Thread : " + Thread.currentThread().getName());
            System.out.println("temp value : " + start);
        }
    }

    public static void main (String[] args) {
        SingleThread2 st = new SingleThread2();
        Thread t = new Thread(st, "first");

        t.start();
    }
}
