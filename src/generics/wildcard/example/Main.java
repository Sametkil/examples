package generics.wildcard.example;

public class Main {
    public static void main(String[] args) {
        NumericOperation<Double> doubleNumericOperation =
                new NumericOperation<>(10.0);
        NumericOperation<Float> floatNumericOperation =
                new NumericOperation<>(-10.0f);
        System.out.println(
                doubleNumericOperation.absEqual(floatNumericOperation));
    }
}
