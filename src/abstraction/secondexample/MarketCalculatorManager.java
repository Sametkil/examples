package abstraction.secondexample;

public class MarketCalculatorManager 
extends BaseShopCalculatorManager{

	//Ekmek markette 2TL
	@Override
	public double breadBuy(int breadCount) {
		return 2*breadCount;
	}

}
