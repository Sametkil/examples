package thread.limitlessWait;


import thread.limitlessWait.threads.MyThread;

public class Main {

    public static void main(String[] args) {
        Object lock = new Object();
        MyThread myThread = new MyThread(lock);
        myThread.start();
        synchronized (lock){
            try {
                for(int i = 0 ; i < 100 ; i++){
                    System.out.println(i);
                    if(i == 50) lock.wait();
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Main thread basarili bir sekilde sonlandi.");

    }
}
