package abstraction.secondexample;

import java.util.Scanner;

public class CustomerManager {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ekmek Sayisi:");
		int breadCount = scanner.nextInt();
		System.out.println("Nerden Aldin:");
		char marketType = scanner.next().charAt(0);
		BaseShopCalculatorManager bscm = null; 
		
		if(marketType=='m') {
			bscm = new MarketCalculatorManager();
		}else if (marketType =='s') {
			bscm = new SuperMarketCalculatorManager();
		}else {
			System.out.println("Bilinmeyen Market");
		}
		
		doTheShopping(bscm, breadCount);
	}
	
	public static void doTheShopping
	(BaseShopCalculatorManager bscm,int breadCount) {
		if(bscm instanceof SuperMarketCalculatorManager) {
			System.out.println
			( bscm.getClass().getSimpleName()+" ekmek alindi. Ucret :"+ bscm.breadBuy(breadCount));
		}else {
			System.out.println
			(bscm.getClass().getSimpleName()+" ekmek alindi. Ucret :"+ bscm.breadBuy(breadCount));
		}
		
	}
}
