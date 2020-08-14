
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
	
	
	// Mujda F. it has constructor
	public Discount(double a)
	{
		amount = a;
	}
	
	// Mujda F. abstact method because we need to apply discount based on object that is by amount or percentage
	public abstract double applyDiscount(double price);
	
	
	
}
