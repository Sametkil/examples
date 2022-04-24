package thread.synchronizedExampleTwo;

public class MyThread extends Thread{
    private int[] array;
    static ArrayOperations op = new ArrayOperations();

    public MyThread(int[] array){
        super();
        this.array = array;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " is starting");
        System.out.println("Multiply Result : "+ op.multMethod(array));
        System.out.println(Thread.currentThread().getName() + " is finishing");
    }
}
