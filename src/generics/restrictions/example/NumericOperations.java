package generics.restrictions.example;

public class NumericOperations <T extends Number,K extends Number> {
    private T firstNumber;
    private K secondNumber;

    public int sum(){
        return firstNumber.intValue()+secondNumber.intValue();
    }

    public T getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(T firstNumber) {
        this.firstNumber = firstNumber;
    }

    public K getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(K secondNumber) {
        this.secondNumber = secondNumber;
    }
}
