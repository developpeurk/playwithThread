package thread;

import static java.lang.System.*;

public class Main extends Thread{

    public void run() {
        for (int i = 5; i <15 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                out.println(e.getMessage());
            }
            out.println(Thread.currentThread().getName() + " --> " +  i);
        }
    }
    public static void main(String[] args) {
        Main m1 = new Main();
        Main m2 = new Main();
        m1.start();
        m2.start();

    }
}
