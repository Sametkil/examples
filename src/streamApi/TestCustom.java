package streamApi;

@FunctionalInterface
interface Matematics {
	void operation(int a, int b);
}

public class TestCustom {
	public static void main(String[] args) {
		Matematics sum = 
				(a, b) -> System.out.println("Sum: " + (a + b));
		sum.operation(10, 6);
		Matematics minus = 
				(int a, int b) -> System.out.println("Minus: " + (a - b));
		minus.operation(10, 6);
		Matematics multiply = 
				(int a, int b) -> System.out.println("Multiply: " + (a * b));
		multiply.operation(10, 6);
	}
}
