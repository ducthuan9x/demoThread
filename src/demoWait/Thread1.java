package demoWait;

import java.util.Random;

public class Thread1 extends Thread {
    Sharedata sharedata;

    public Thread1(Sharedata sharedata) {
        this.sharedata = sharedata;
    }

    @Override
    public void run() {


        Random random = new Random();
        for (int i = 0; i < 8; i++) {

            synchronized (sharedata) {
                int rad = random.nextInt(10);
                sharedata.rad=rad;
                System.out.println(rad);

                sharedata.notifyAll();

                try {
                    sharedata.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
