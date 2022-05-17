public class CashPayment extends Payment implements IPayment {
	public CashPayment(Float amount) {
		super(amount);
		toReturn();
	}

	public void DetailPayment() {
		System.out.println("Cash Payment");
		System.out.println("PVP: " + Sale.getPvp());
		System.out.println("Amount: " + getAmount());
		System.out.println("ToReturn: " + toReturn());
		System.out.println("\n");
	}

	public Float toReturn() {
		
		return (getAmount() - Sale.getPvp());
	}

}
