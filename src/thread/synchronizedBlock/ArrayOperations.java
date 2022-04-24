package thread.synchronizedBlock;

public class ArrayOperations {
    int sum = 0;

    int sum(int [] array){
        for(int value : array){
            sum += value;
            System.out.println("Sum : "+sum+" Thread name : "+ Thread.currentThread().getName());
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                System.out.println("Main thread interrupted");
            }
        }
        return sum;
    }
}
