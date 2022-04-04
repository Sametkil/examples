package abstraction.thirdexample;

public class MathematicalOperationImplementation 
implements MathematicalOperation {

	@Override
	public int sum(int numberOne, int numberTwo) {
		return numberOne+numberTwo;
	}

	@Override
	public int difference(int numberOne, int numberTwo) {
		return numberOne-numberTwo;
	}

	@Override
	public int multiply(int numberOne, int numberTwo) {
		return numberOne*numberTwo;
	}

	@Override
	public int divide(int numberOne, int numberTwo) {
		return numberOne/numberTwo;
	}

}
