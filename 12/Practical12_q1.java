public class Practical12_q1 extends Thread {
    private int count;

    public Practical12_q1(int count) {
        this.count = count;
    }

    public void run() {
        for (int i = 1; i <= count; i++) {
            System.out.println("Count: " + i);
            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }

    public static void main(String[] args) {

        Practical12_q1 thread = new Practical12_q1(5);
        thread.start();
    }
}