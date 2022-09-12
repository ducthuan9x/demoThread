package demoThread;

public class Main {
    public static void main(String[] args) {
        Synchronization synchronization=new Synchronization();
        MyThread1 myThread1=new MyThread1(synchronization);
        MyThread2 myThread2 = new MyThread2(synchronization);
        myThread1.start();
        myThread2.start();
    }
}
