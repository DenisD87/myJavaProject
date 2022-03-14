package school.lesson4.payment;

public class PaymentMainApp {
    public static void main(String[] args) {
        Payment firstPayment = new Payment();
        firstPayment.setProducts("товар1", 5);
        firstPayment.setProducts("товар2", 10);
        firstPayment.setProducts("товар3", 15);

        firstPayment.printCheck();

        Payment secondPayment = new Payment();
        secondPayment.setProducts("товар1", 100);
        secondPayment.setProducts("товар2", 200);
        secondPayment.setProducts("товар3", 300);
        secondPayment.setProducts("товар4", 400);
        secondPayment.setProducts("товар5", 500);

        secondPayment.printCheck();

        Payment thirdPayment = new Payment();
        thirdPayment.setProducts("товар1", 1);
        thirdPayment.setProducts("товар2", 2);
        thirdPayment.setProducts("товар3", 3);
        thirdPayment.setProducts("товар4", 10);

        thirdPayment.printCheck();
    }
}
