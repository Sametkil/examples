package thread.synchronizedExampleTwo;

public class ArrayOperations {
    int mult=1;

    synchronized int multMethod (int[] array){
        for(int value : array){
            mult*=value;
            System.out.println("Mult : "+ mult + " Thread Name: "
                    +Thread.currentThread().getName());
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                System.out.println("Main thread interrupted");
            }
        }
        return mult;
    }
}
