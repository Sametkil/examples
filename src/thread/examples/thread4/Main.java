package thread.examples.thread4;

import thread.examples.thread4.threads.NameRunnable;
import thread.examples.thread4.threads.SearchThread;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Thread name =  new Thread(new NameRunnable());
        SearchThread searchThread = new SearchThread();
        Thread surname = new Thread(new Runnable() {
            @Override
            public void run() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Soyad giriniz: ");
                String surname = scanner.nextLine();
                System.out.println("Surname girilmeden bu satır çalışmaz.");
                System.out.println(surname);
            }
        });

        name.start();
        searchThread.start();
        surname.start();
    }
}
