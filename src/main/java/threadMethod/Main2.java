package threadMethod;

public class Main2 extends Thread {
    public void run() {
        for (int i = 2; i < 8; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Main2 m1 = new Main2();
        Main2 m2 = new Main2();
        Main2 m3 = new Main2();

        m1.start();
        m1.join(1300);
        m2.start();
        m3.start();
    }
}
