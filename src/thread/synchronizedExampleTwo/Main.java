package thread.synchronizedExampleTwo;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,10};

        MyThread thread1 = new MyThread(array);
        MyThread thread2 = new MyThread(array);

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Main thread is finishing..");
    }
}
