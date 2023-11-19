package daemon;

import static java.lang.System.*;

public class Main extends Thread {
    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()) {
            out.println("Daemon Thread");
            out.println("Daemon name= " + Thread.currentThread().getName());
        }else {
            out.println("user thread");
        }
    }

    public static void main(String[] args) {
        Main m1 = new Main();
        Main m2 = new Main();
        Main m3 = new Main();

        m1.setDaemon(true);
        m1.start();
        //m1.setDaemon(true); // illegal thread state exception
        m2.start();
        m3.start();

        try {
            m1.join();
            m2.join();
            m3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
