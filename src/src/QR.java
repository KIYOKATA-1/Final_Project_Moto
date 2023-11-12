public class QR implements paymentAdapter{

    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата через QR" + amount + " $");
    }
}
