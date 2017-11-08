package remita.payment;

/**
 * Created by Mayokun on 11/7/2017.
 */
public class VervePay extends AbstractPaymentProcessor {

    public boolean doFinalizeWithProcessing = true;

    public VervePay() {

    }

    @Override
    boolean transactionInitialization(TransactionBuilder transactionBuilder) {
        System.out.println("VervePay Transaction Initialized");
        return false;
    }

    @Override
    boolean transactionFinalization() {
        System.out.println("VervePay Transaction Finalization not required next step called");
        return true;
    }

    @Override
    void transactionQuery() {
        System.out.println("VervePay Transaction Query called");
    }

    @Override
    PaymentConfiguration init() {
        PaymentConfiguration paymentConfiguration = new PaymentConfiguration();
        paymentConfiguration.setDoFinalizationWithProcessing(true);
        return paymentConfiguration;
    }
}
