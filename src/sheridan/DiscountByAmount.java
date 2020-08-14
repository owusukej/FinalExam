
package sheridan;

/**
 *
 * @author Jimmy Kessie
 */

public class DiscountByAmount extends Discount{

	public DiscountByAmount(double a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	// Mujda F. overriding and discounting by the amount
	@Override
	public double applyDiscount(double price) {
		// TODO Auto-generated method stub
		double new_price = price-this.amount;
		if(new_price < 0)
			return 0;
		else
			return new_price;
	}

}
