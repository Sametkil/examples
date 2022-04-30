package generics.wildcard.example;

public class NumericOperation <T extends Number> {
    private T number;

    public NumericOperation(T number){
        this.number = number;
    }

    public boolean absEqual(NumericOperation<?> numberTwo){
        return Math.abs(this.number.doubleValue())
                == Math.abs(numberTwo.number.doubleValue());
    }
}
