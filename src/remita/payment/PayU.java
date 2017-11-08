package remita.payment;

/**
 * Created by Mayokun on 11/7/2017.
 */
public class PayU extends AbstractPaymentProcessor {

    @Override
    PaymentConfiguration init() {
        return null;
    }

    @Override
    boolean transactionInitialization(TransactionBuilder transactionBuilder) {
        System.out.println("PayU Transaction Intialization Called");
        return true;
    }

    @Override
    boolean transactionFinalization() {
        System.out.println("Payu requires Transaction Finalization");
        return true;
    }

    @Override
    void transactionQuery() {
        System.out.println("Transacion Query Called");
    }
}
