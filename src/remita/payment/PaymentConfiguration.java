package remita.payment;

/**
 * Created by Mayokun on 11/7/2017.
 */
public class PaymentConfiguration {

    private boolean doFinalizationWithProcessing;

    public boolean isDoFinalizationWithProcessing() {
        return doFinalizationWithProcessing;
    }

    public void setDoFinalizationWithProcessing(boolean doFinalizationWithProcessing) {
        this.doFinalizationWithProcessing = doFinalizationWithProcessing;
    }
}
