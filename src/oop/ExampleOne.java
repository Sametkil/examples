package oop;

public class ExampleOne {
 
	public static void main(String[] args) {
		CustomMath cm = new CustomMath();
		cm.sum(10, 10);
		int sum = cm.test4*2;
		CustomMath.diff(10, 5);
		Math.random();
		//statikse ExampleOne.test();
	}
	
	public void test() {
		Math.sqrt(10);	
		CustomMath.diff(10, 5);
		test2();
		int result =CustomMath.test3*2;
		
		int sum = (int) (Math.PI*3);
	}
	
	public void test2() {
	}

}
