package com.company.pattern.chain_of_responsitbility.qr;

/**
 * Created by Mayokun on 10/31/2017.
 */
public class MasterPass extends AbstractQr {

    @Override
    void logMessage() {
        if (canProcess()) {
            write("This can be procesed by Master Card");
        } else {
            nextQrParser.logMessage();
        }
    }

    @Override
    protected void write(String message) {
        System.out.println("MasterPass::"+message);
    }

    @Override
    boolean canProcess() {
        return false;
    }
}
