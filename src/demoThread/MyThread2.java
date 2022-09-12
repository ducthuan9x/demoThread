package demoThread;

public class MyThread2 extends Thread{
    private Synchronization synchronization;

    public MyThread2(Synchronization synchronization) {
        this.synchronization = synchronization;
    }
    public void run(){
        synchronization.count(500);
    }
}
