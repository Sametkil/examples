package thread.synchronizedExample;

public class MyThread extends Thread{
    int[] array;
    static ArrayOperations op = new ArrayOperations();

    public MyThread(int[] array){
        super();
        this.array = array;
    }

    @Override
    public void run(){
        System.out.println(this.getName() + " is starting");
        System.out.println("Sum of the array is : "+ op.sum(this.array));
        System.out.println(this.getName() + " is finishing");
    }
}
