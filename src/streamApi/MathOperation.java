package streamApi;


@FunctionalInterface
public interface MathOperation {
    double operate(double a, double b);

    //default metod olusturmak
    default void run(){
    	System.out.println("Running....");
    }
}
