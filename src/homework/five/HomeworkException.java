
public class HomeworkException {

	public static void main(String[] args) {
		try {
			System.out.println("TryBlock");
			method1();
		} catch (NullPointerException npe) {
			System.out.println("CatchBlock");
		} finally {
			System.out.println("FinallyBlock");
		}
		System.out.println("Finish");
	}

	public static void method1() throws NullPointerException {
		method2();
		System.out.println("Method1");
	}

	public static void method2() throws NullPointerException {
		method3();
		System.out.println("Method2");
	}

	public static void method3() throws NullPointerException {
		method4();
		System.out.println("Method3");
	}

	public static void method4() throws NullPointerException {
		System.out.println("Method4");
		throw new NullPointerException();
	}

}
