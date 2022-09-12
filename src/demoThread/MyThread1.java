package demoThread;

public class MyThread1 extends Thread {
    private Synchronization synchronization;

    public MyThread1( Synchronization synchronization) {
        this.synchronization = synchronization;
    }
    public void run(){
        synchronization.count(5);
    }
}
