package threadPool2;

import static java.lang.System.*;

public class Main implements Runnable {
    public static void main(String[] args) {
        Main tg = new Main();
        tg.func();
    }


    public void func() {
        //create a parent ThreadGroup
        ThreadGroup pGroup = new ThreadGroup("Parent ThreadGroup");

        //create a child ThreadGroup for parent ThreadGroup
        ThreadGroup cGroup = new ThreadGroup(pGroup, "Child ThreadGroup");

        // create a thead
        Thread t1= new Thread(pGroup,this);
        out.println("Starting " + t1.getName() + "...");
        t1.start();

        // create another thread
        Thread t2 = new Thread(cGroup, this);
        out.println("Starting " + t2.getName() + "...");
        t2.start();

        //display the number of active threads
        out.println("Active threads in \""  + pGroup.getName()
        +"\"=" + pGroup.activeCount());

        // block until the other threads finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    @Override
    public void run() {

        for (int i = 0; i < 1000 ; i++) {
            i++;

        }
        out.println(Thread.currentThread().getName() + " finished executing");

    }
}
