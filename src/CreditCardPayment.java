public class CreditCardPayment extends Payment implements IPayment {
	
	private String cardNumber;
	
	public CreditCardPayment(Float amount, String cardNumber) {
		super(amount);
		this.cardNumber = cardNumber;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}


	
	public void DetailPayment() {
		System.out.println("Credit Card Payment");
		System.out.println("Card Number: " + getCardNumber());
		System.out.println("PVP: " + Sale.getPvp());
		System.out.println("Amount: " + getAmount());
		System.out.println("\n");
	}


}
