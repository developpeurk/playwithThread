package shutdown;

import static java.lang.System.out;

class Yassine extends Thread{
    @Override
    public void run() {
        out.println("Shutdown your task completed");
    }
}
public class Main{
    public static void main(String[] args) {
        Runtime m = Runtime.getRuntime();
        m.addShutdownHook(new Yassine());
        out.println("Now your class main in sleep mode press ctrl+c to exit");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
