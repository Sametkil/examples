package generics.restrictions.example;


public class Main {
    public static void main(String[] args) {
        NumericOperations<Integer,Integer> integerNumericOperation =
                new NumericOperations<>();
        integerNumericOperation.setFirstNumber(10);
        integerNumericOperation.setSecondNumber(150);
        System.out.println("Sum : " +integerNumericOperation.sum());

        NumericOperations<Double,Double> doubleNumericOperation =
                new NumericOperations<>();
        doubleNumericOperation.setFirstNumber(10.6);
        doubleNumericOperation.setSecondNumber(150.6);
        System.out.println("Sum : " +doubleNumericOperation.sum());

        NumericOperations<Double,Integer> numericOperation =
                new NumericOperations<>();
        numericOperation.setFirstNumber(10.6);
        numericOperation.setSecondNumber(150);
        System.out.println("Sum : " +numericOperation.sum());
    }
}
