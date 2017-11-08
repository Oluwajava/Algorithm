package remita.payment;

/**
 * Created by Mayokun on 11/7/2017.
 */
public class CardPayment {

    public static void main(String[] args) {

        TransactionBuilder transactionBuilder = new TransactionBuilder.Builder("2222")
                .accountNumber("01234567")
                .bankCode("045")
                .build();


        AbstractPaymentProcessor vervePay = new VervePay();
        vervePay.processTransaction(transactionBuilder);


        System.out.println("\n");
        AbstractPaymentProcessor payU = new PayU();
        payU.processTransaction(transactionBuilder);



    }
}
