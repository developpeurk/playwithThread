package threadMethod;

import static java.lang.System.*;

public class Main3 extends Thread {
    public void run() {
        for (int i = 2; i < 8; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            out.println(i);
        }
    }
    public static void main(String[] args) {
        Main3 m1 = new Main3();
        Main3 m2 = new Main3();
        Main3 m3 = new Main3();

        out.println("m1 = " + m1.getName());
        out.println("m2 = " + m2.getName());
        out.println("m3 = " + m3.getName());

        out.println("m1 = " +m1.getId());
        out.println("m2 = " +m2.getId());
        out.println("m3 = " +m3.getId());

        m1.start();
        m2.start();
        m3.start();
    }
}
