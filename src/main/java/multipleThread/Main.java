package multipleThread;


import static java.lang.System.*;

public class Main extends Thread{
    public static void main(String[] args) {
        Main t1 = new Main();
        Main t2 = new Main();
        Main t3 = new Main();

        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        out.println("First Task");
    }
}
