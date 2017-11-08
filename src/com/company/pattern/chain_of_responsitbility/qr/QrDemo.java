package com.company.pattern.chain_of_responsitbility.qr;

/**
 * Created by Mayokun on 10/31/2017.
 */
public class QrDemo {

    private static AbstractQr getChainOfQrParsers() {

        AbstractQr masterPass = new MasterPass();
        AbstractQr mvisa = new MVisa();
        AbstractQr remita = new Remita();

        masterPass.setNextQrParser(mvisa);
        mvisa.setNextQrParser(remita);

        return masterPass;
    }

    public static void main(String[] args) {
        AbstractQr qrParser = getChainOfQrParsers();

        qrParser.logMessage();
    }
}
