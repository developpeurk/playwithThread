package priority;

public class Main extends Thread {

    @Override
    public void run() {
        System.out.println("Thread name = " + Thread.currentThread().getName());
        System.out.println("Priority = " + Thread.currentThread().getPriority());
    }
    public static int MIN_PRIORITY  = 1;
    public static int NORM_PRIORITY = 5;
    public static int MAX_PRIORITY = 10;

    public static void main(String[] args) {


        Main m1 = new Main();
        Main m2 = new Main();

       m1.setPriority(MIN_PRIORITY);
        m2.setPriority(MAX_PRIORITY);

        m1.start();
        m2.start();

    }
}
