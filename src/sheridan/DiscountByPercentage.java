
package sheridan;

/**
 *
 * @author Jimmy Kessie
 */

public class DiscountByPercentage extends Discount{

	public DiscountByPercentage(double a) {
		super(a);
	}

	// Mujda F. overriding and discounting by the percentage
	@Override
	public double applyDiscount(double price) {
		double amountToSub = (100.0/price)*this.amount;
		return price - amountToSub;
	}

}
