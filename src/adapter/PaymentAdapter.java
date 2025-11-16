package adapter;

public class PaymentAdapter implements PaymentProcessor{
    private final LegacyPaymentSystem legacySystem;

    public PaymentAdapter(LegacyPaymentSystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public void processPayment(double amount) {
        legacySystem.makeTransaction(amount);
    }
}
