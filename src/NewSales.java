import java.util.ArrayList;

public class NewSales {
	public static void main(String[] args) {

		ArrayList<Sale> arraySale = new ArrayList<Sale>();

		Sale s1 = new Sale("01", "producto 1", 1000.0f);
		// pago en cash pvp = 1000, importe recibido = 1500
		CashPayment p1 = new CashPayment(1500f);
		s1.setPayment(p1);
		arraySale.add(s1);

		Sale s2 = new Sale("02", "producto 2", 3000.0f);
		// pago en credirCard card Number = 1234567 pvp = 3000
		CreditCardPayment p2 = new CreditCardPayment(3000f, "1234567");
		s2.setPayment(p2);
		arraySale.add(s2);

		Sale s3 = new Sale("03", "producto 3", 4400.0f);
		// pago en cash pvp = 4400, importe recibido = 5300
		CashPayment p3 = new CashPayment(5300f);
		s3.setPayment(p3);
		arraySale.add(s3);

	}
}