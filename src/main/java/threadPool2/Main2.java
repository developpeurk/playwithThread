package threadPool2;

import static java.lang.System.*;
import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.NORM_PRIORITY;

public class Main2 implements Runnable{
    public static void main(String[] args) {
        Main2 tg = new Main2();
        tg.func();
    }

    private void func() {
        //Create a parent ThreadGroup
        ThreadGroup pGroup = new ThreadGroup("Parent ThreadGroup");
        //set maximum priority as 8 for parent
        pGroup.setMaxPriority(MAX_PRIORITY - 2);

        // create a child ThreadGroup for parent ThreadGroup
        ThreadGroup cGroup = new ThreadGroup(pGroup, "Child ThreadGroup");
        //set maximum priority as 5 for child
        cGroup.setMaxPriority(NORM_PRIORITY);

        //Create a thread with priority as MAX
        Thread t1 = new Thread(pGroup, this);
        t1.setPriority(MAX_PRIORITY);
        out.println("Starting " + t1.getName() + "...");
        t1.start();

        //Create another thread with priority as MAX
        Thread t2 = new Thread(cGroup, this);
        t2.setPriority(MAX_PRIORITY);
        out.println("Starting " + t2.getName() + "...");
        t2.start();

        // display the number of active threads with actual priority
        out.println("Active threads in \"" + pGroup.getName()
        + "\" =" + pGroup.activeCount());

        // block until the other threads finished
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            i++;
        }
        out.println(Thread.currentThread().getName() +
                "[priority = " + Thread.currentThread().getPriority() +
                "] Finished executing" );
    }
}
