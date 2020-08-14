
package sheridan;

/**
 *
 * @author Jimmy Kessie
 */


public abstract class Discount {
	
	protected double amount;
	
	enum Type{
		AMOUNT,
		PERCENTAGE
	}
	
	
	// it has a constructor
	public Discount(double a)
	{
		amount = a;
	}
	
	// we need to apply the discount based on object that is by amount and by the percentage
	public abstract double applyDiscount(double price);
	
	
	
}
