public class Payment {
	protected static Float amount;
		
	public Payment(Float amount) {
		setAmount(amount);
	}
	

	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		Payment.amount = amount;
	}

}
