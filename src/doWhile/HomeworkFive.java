package doWhile;

public class HomeworkFive {

	public static void main(String[] args) {
		int number=400;
        
        while (number > 1) {
            int i = 2, count = 0;
            while (i <= number/2) { // number/2 olmas� daha mant�kl�
                if (number % i == 0) {
                    count++;
                    break; 
          // burada break sadece ait oldu� d�ng�y� k�rar.Continue de ayn� �ekilde!! en �stteki while devam eder.        
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
