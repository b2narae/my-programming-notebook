package Java.Thread;

// refer to : https://coding-factory.tistory.com/279

public class SingleThread1 extends Thread {
    private int[] temp;

    public SingleThread1 (String threadName) {
        super(threadName);
        temp = new int[10];

        for (int start = 0; start < temp.length; start++) {
            temp[start] = start;
        }
    }

    public void run() {
        for (int start : temp) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println("Name of Thread : " + currentThread().getName());
            System.out.println("temp value : " + start);
        }
    }

    public static void main (String[] args) {
        SingleThread1 st = new SingleThread1("first");
        st.start();
    }
}
