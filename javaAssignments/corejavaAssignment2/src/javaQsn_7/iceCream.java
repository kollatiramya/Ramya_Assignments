package javaQsn_7;

public class iceCream extends dessertItems {
	float quantity;
	public iceCream(float q)
	{
		quantity=q;
	}

	@Override
	public float getcost() {
		float cost = quantity*60f;
		float taxamount=(5f/100f)*cost;
		float totalcost=cost+taxamount;
		return totalcost;
	}

}