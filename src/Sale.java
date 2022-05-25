public class Sale extends Payment{

	private String id;
	private String product;
	public Payment payment;
	private static Float pvp;
	Sale (String id, String product, Float pvp) {
		super(amount);
		setId(id);
		setProduct(product);
		setPvp(pvp);
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}

	public static float getPvp() {
		return pvp;
	}
	public void setPvp(float pvp) {
		Sale.pvp = pvp;
	}

	public void setPayment(CashPayment p) {
		payment = p;
		p.DetailPayment();
	}

	public void setPayment(CreditCardPayment p) {
		p.DetailPayment();
	}




}