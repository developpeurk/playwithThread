package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable threadPool = new ThreadPool("--->" + i);
            executor.execute(threadPool);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
            try {
                Thread.sleep(1000); // Sleep to avoid CPU intensive loop
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Your tasks are finished");
    }
}
