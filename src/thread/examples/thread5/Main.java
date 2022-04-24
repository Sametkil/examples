package thread.examples.thread5;

import thread.examples.thread5.threads.KeywordRunnable;
import thread.examples.thread5.threads.NameThread;

public class Main {

    public static void main(String[] args){
        NameThread nameThread = new NameThread();
        Thread thread = new Thread(new KeywordRunnable());

        nameThread.start();
        thread.start();
    }
}
