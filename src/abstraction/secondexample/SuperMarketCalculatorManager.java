package abstraction.secondexample;

public class SuperMarketCalculatorManager 
extends BaseShopCalculatorManager{

	//ekmek supermarkette 2.5TL
	@Override
	public double breadBuy(int breadCount) {
		return 2.5*breadCount;
	}

}
