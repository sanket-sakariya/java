public class Practical12_q3 {

    private static Integer sum = 0;
    private static final Object lock = new Object(); 

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new AddOneTask());
            thread.start();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final sum: " + sum);
    }

    private static class AddOneTask implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                sum++;
            }
        }
    }
}
