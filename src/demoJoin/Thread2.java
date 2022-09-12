package demoJoin;

public class Thread2 extends Thread{
    Thread1 thread1;

    public Thread2() {
    }

    public Thread2(Thread1 thread1) {
        this.thread1 = thread1;
    }

    @Override
    public void run() {
        try {
            System.out.println("bắt đầu nối t1");
            thread1.join(); // nối t1 vào t2
            System.out.println("thread1 đã xong, bắt đầu t2");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("thread2 " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
