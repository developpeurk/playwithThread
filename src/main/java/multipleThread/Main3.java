package multipleThread;

class A extends Thread {
    @Override
    public void run() {
        System.out.println("First Task");
    }
}

class B extends Thread {
    @Override
    public void run() {
        System.out.println("Second Task");
    }
}

class C extends Thread {
    @Override
    public void run() {
        System.out.println("Third Task");
    }
}
public class Main3 {
    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();
        C t3 = new C();

        t1.start();
        t2.start();
        t3.start();

    }


}
