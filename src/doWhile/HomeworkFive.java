package doWhile;

public class HomeworkFive {

	public static void main(String[] args) {
		int number=400;
        
        while (number > 1) {
            int i = 2, count = 0;
            while (i <= number/2) { // number/2 olmasý daha mantýklý
                if (number % i == 0) {
                    count++;
                    break; 
          // burada break sadece ait olduð döngüyü kýrar.Continue de ayný þekilde!! en üstteki while devam eder.        
                }
                i++;
            }
            if (count == 0) {
            	
                System.out.println(number + " is prime number");
            }
            number--;
        }

	}

}
