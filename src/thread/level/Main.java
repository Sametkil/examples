package thread.level;

import thread.first.MyThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Process : "+ Runtime.getRuntime().availableProcessors());

        MyThread[] threads = new MyThread[15];
        System.out.println("Threads creating..");
        for(int i=0; i<threads.length;i++){
            threads[i]= new MyThread("child"+(i+1));
        }

        threads[0].setPriority(Thread.MIN_PRIORITY);
        threads[1].setPriority(Thread.MIN_PRIORITY);
        threads[2].setPriority(Thread.MIN_PRIORITY);
        threads[3].setPriority(Thread.MIN_PRIORITY);
        threads[4].setPriority(Thread.MIN_PRIORITY);
        threads[5].setPriority(Thread.MIN_PRIORITY);
        threads[6].setPriority(Thread.MIN_PRIORITY);
        threads[7].setPriority(Thread.MAX_PRIORITY);
        threads[10].setPriority(Thread.MAX_PRIORITY);
        threads[12].setPriority(Thread.MAX_PRIORITY);
        threads[13].setPriority(Thread.MAX_PRIORITY);
        threads[14].setPriority(Thread.MAX_PRIORITY);
        threads[8].setPriority(Thread.MAX_PRIORITY);

        System.out.println("Threads starting..");
        for(int i=0;i<threads.length;i++){
            threads[i].start();
        }
        System.out.println("Threads joining..");
        for(int i=0; i<threads.length;i++){
            threads[i].join();
        }
    }
}
