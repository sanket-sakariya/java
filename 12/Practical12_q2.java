public class Practical12_q2 implements Runnable {

    private String message;

    public Practical12_q2(String message) {
        this.message = message;
    }

    public void run() {
        System.out.println("Thread started: " + message);
        try {

            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Thread completed: " + message);
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Practical12_q2("Thread 1"));
        Thread thread2 = new Thread(new Practical12_q2("Thread 2"));

        thread1.start();
        thread2.start();

        try {

            thread1.join(); 
            thread2.join(); 
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread completed.");
    }
}