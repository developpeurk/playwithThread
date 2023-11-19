package threadMethod;

public class Main extends Thread {
    public void run() {
        for (int i = 2; i < 8; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Main m1 = new Main();
        Main m2 = new Main();
        Main m3 = new Main();

        m1.start();
        m1.join();
        m2.start();
        m3.start();
    }
}
