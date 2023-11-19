package threadPool;

import static java.lang.System.out;

public class ThreadPool implements Runnable{
    private String name;

    public ThreadPool(String name) {
        super();
        this.name = name;
    }

    @Override
    public void run() {
        out.println(Thread.currentThread().getName() + " Start name=" + name);
        processname();
        out.println(Thread.currentThread().getName() + " Full" );

    }

    private void processname() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
