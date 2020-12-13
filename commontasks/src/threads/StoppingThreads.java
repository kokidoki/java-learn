package threads;

public class StoppingThreads {

    public static void main(String[] args) throws InterruptedException {
        HelloTask helloTask = new HelloTask();
        Thread t1 = new Thread(helloTask);
        t1.start();
        Thread.sleep(5000l);
        helloTask.runTask = false;
    }

    public static class HelloTask implements Runnable {
        public volatile boolean runTask = true;

        @Override
        public void run() {
            while (this.runTask) {
                System.out.println("Hello World");
                try {
                    Thread.sleep(1000l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
