package remita.payment;

/**
 * Created by Mayokun on 11/7/2017.
 */
public class TransactionBuilder {

    private final String RRR;
    private final String accountNumber;
    private final String bankCode;
    private final String cvv;
    private final String pin;
    private final String pan;
    private final String expiryMonth;
    private final String expiryYear;


    public static class Builder {
        private final String RRR;
        private String accountNumber = "";
        private String bankCode = "";
        private String cvv = "";
        private String pin = "";
        private String pan = "";
        private String expiryMonth = "";
        private String expiryYear = "";

        public Builder(String rrr) {
            this.RRR = rrr;
        }

        public Builder accountNumber(String val) {
            accountNumber = val;
            return this;
        }

        public Builder bankCode(String val) {
            bankCode = val;
            return this;
        }

        public Builder cvv(String val) {
            cvv = val;
            return this;
        }

        public Builder pin(String val) {
            pin = val;
            return this;
        }

        public Builder pan(String val) {
            pan = val;
            return this;
        }

        public Builder expiryMonth(String val) {
            expiryMonth = val;
            return this;
        }

        public Builder expiryYear(String val) {
            expiryYear = val;
            return this;
        }

        public TransactionBuilder build() {
            return new TransactionBuilder(this);
        }
    }

    private TransactionBuilder(Builder builder) {
        RRR = builder.RRR;
        accountNumber = builder.accountNumber;
        bankCode = builder.bankCode;
        cvv = builder.cvv;
        pin = builder.pin;
        pan = builder.pan;
        expiryMonth = builder.expiryMonth;
        expiryYear = builder.expiryYear;
    }


}
