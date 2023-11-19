package multipleThread;


import static java.lang.System.out;

public class Main2 implements Runnable{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Main2());
        Thread t2 = new Thread(new Main2());
        Thread t3 = new Thread(new Main2());


        t1.start();
        t2.start();
        t3.start();
    }

    public void run() {

        out.println("First Task");
    }
}
