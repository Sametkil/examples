package thread.scheduledExecutor;

import thread.scheduledExecutor.runnable.Task;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(2);
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        System.out.println("Baslangic zamani: " + new Date());

        scheduledExecutorService.schedule(task1,15, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(task2, 10, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
        try {
            scheduledExecutorService.awaitTermination(1,TimeUnit.DAYS);
        }catch (InterruptedException interruptedException){
            System.err.println(interruptedException.getMessage());
        }
    }
}
