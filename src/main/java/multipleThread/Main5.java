package multipleThread;

import static java.lang.System.out;

public class Main5 {
    public static void main(String[] args) {

//        Thread t1 = new Thread(() -> out.println("Task One"));
//
//        Thread t2 = new Thread(() -> out.println("Task Second"));
//
//        Thread t3 = new Thread(() -> out.println("Task Third"));


//        Runnable t1 = new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        }

    Runnable t1 = () -> out.println("Task1");
    Runnable t2 = () -> out.println("Task2");
    Runnable t3 = () -> out.println("Task3");

    Thread s1 = new Thread(t1);
    Thread s2 = new Thread(t2);
    Thread s3 = new Thread(t3);

    s1.start();
    s2.start();
    s3.start();

    }
}
