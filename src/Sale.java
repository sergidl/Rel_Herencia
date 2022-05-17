public class Sale extends Payment {

	private String id;
	private String product;
	private static Float pvp;
	Sale (String id, String product, Float pvp) {
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
		p.DetailPayment();
	}

	public void setPayment(CreditCardPayment p) {
		p.DetailPayment();
	}



}