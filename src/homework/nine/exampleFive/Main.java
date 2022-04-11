package homework.nine.exampleFive;

public class Main {

	public static void main(String[] args) {
		Baseball baseball = new Baseball("aaaa");
		Football football = new Football("bbbb");
		System.out.println("Football:");
		football.toss();
		football.bounce();
		System.out.println("Baseball:");
		baseball.toss();
		baseball.bounce();
		
	}

}
