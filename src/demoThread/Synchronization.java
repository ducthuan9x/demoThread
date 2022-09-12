package demoThread;

public class Synchronization {
    synchronized void count(int n){
        for (int i=0; i<5;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
