package thread.synchronizedExample;

public class ArrayOperations {
    int sum = 0;

    synchronized int sum(int [] array){
        //int[] array = {1, 23, 45, 9 , 52, 78};
        for(int value : array){
            sum += value;
            System.out.println("Sum : "+sum+" Thread name : "+
                    Thread.currentThread().getName());
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                System.out.println("Main thread interrupted");
            }
        }
        return sum;
    }
}
