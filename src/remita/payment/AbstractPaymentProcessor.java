package remita.payment;

/**
 * Created by Mayokun on 11/7/2017.
 */
public abstract class AbstractPaymentProcessor {

    AbstractPaymentProcessor() {
        this.paymentConfiguration = init();
    }

    private PaymentConfiguration paymentConfiguration;

    final void processTransaction(TransactionBuilder transactionBuilder) {
        if (transactionInitialization(transactionBuilder)) {
            if(this.paymentConfiguration.isDoFinalizationWithProcessing()) {
                finalization();
            }
        } else {
            System.out.println("Transaction Initialization Failed");
        }
    }

    final void finalization() {
        if(!this.paymentConfiguration.isDoFinalizationWithProcessing()) {
            transactionQuery();
            transactionFinalization();
        }
    }

    abstract PaymentConfiguration init();

    abstract boolean transactionInitialization(TransactionBuilder transactionBuilder);

    abstract boolean transactionFinalization();

    abstract void transactionQuery();

}
