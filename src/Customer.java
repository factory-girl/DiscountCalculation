/**
 * A class which calculates whether a customer is eligible for a discount based
 * on their purchase history.
 * @author McKayla
 */
public class Customer {
	private double totalPurchases;
	private int discountCalculation;
	private int discount;
	
	/**
	 * A method that calculates the accumulation of purchases
	 * @param amount - cost of purchase
	 */
	public void makePurchase(double amount) {
		totalPurchases = totalPurchases + amount;
	}
	
	
	/**
	 * A method which calculates the discount amount if applicable.
	 * @return true if discount is applicable, false otherwise
	 */
	public boolean discountReached() {
		discountCalculation = ((int)totalPurchases/100);
		if (discountCalculation > 0) {
			discount = discountCalculation*10;
			return true;
		}
		else return false;
	}
	
	/**
	 * A method that calculates the amount of the purchase including the 
	 * discount if applicable.
	 * @return amount - cost of purchase
	 */
	public double getTotal() {
		if (discountReached() == false) {
			return totalPurchases;
		}
		else return totalPurchases - discount;
	}
}
