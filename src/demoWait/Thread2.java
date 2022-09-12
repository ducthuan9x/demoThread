package demoWait;

public class Thread2 extends Thread{
    Sharedata sharedata;

    public Thread2(Sharedata sharedata) {
        this.sharedata = sharedata;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (sharedata){

                sharedata.notifyAll();
                try {
                    sharedata.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                int resul= sharedata.rad* sharedata.rad;
                System.out.println(resul);


            }


        }
    }
}
