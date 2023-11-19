package threadMethod;

import static java.lang.System.out;

public class Main4 extends Thread {
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
        Main4 m1 = new Main4();
        Main4 m2 = new Main4();
        Main4 m3 = new Main4();

        out.println("m1 = " + m1.getName());
        out.println("m2 = " + m2.getName());
        out.println("m3 = " + m3.getName());

        out.println("m1 = " +m1.getId());
        out.println("m2 = " +m2.getId());
        out.println("m3 = " +m3.getId());

        m1.start();
        m2.start();
        m3.start();

        m1.setName("Yassine");
        out.println("m1 = " + m1.getName());
        m2.setName("Lambarki");
        out.println("m2 = " + m2.getName());
        m3.setName("KLx/CAPS/GLS/BNP-PARIBAS");
        out.println("m3 = " + m3.getName());
    }
}
