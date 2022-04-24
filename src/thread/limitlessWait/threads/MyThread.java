package thread.limitlessWait.threads;


import thread.limitlessWait.util.DateUtil;

public class MyThread extends Thread{
    private final Object lock;

    public MyThread(Object lock){
        this.lock = lock;
    }

    @Override
    public void run(){
        while (true){
            if(DateUtil.afterFromNowDate("2022/04/24 13:16:00")){
                synchronized (lock){
                    lock.notify();
                }
                break;
            }
        }

    }
}
