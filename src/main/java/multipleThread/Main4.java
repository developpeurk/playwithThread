package multipleThread;

import static java.lang.System.out;

public class Main4 {
    public static void main(String[] args) {

        Thread t1 = new Thread() {
            @Override
            public void run() {
                out.println("Task One");
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                out.println("Task Second");
            }
        };

        Thread t3 = new Thread() {
            @Override
            public void run() {
                out.println("Task Third");
            }
        };

        t1.start();
        t2.start();
        t3.start();


    }
}
