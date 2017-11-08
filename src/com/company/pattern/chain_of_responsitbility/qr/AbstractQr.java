package com.company.pattern.chain_of_responsitbility.qr;

/**
 * Created by Mayokun on 10/31/2017.
 */
public abstract class AbstractQr {

    public static int MASTER_PASS = 1;
    public static int M_VISA = 2;
    public static int REMITA = 3;
    public static int NAIRA_BOX = 4;

    protected int level;

    protected AbstractQr nextQrParser;

    public void setNextQrParser(AbstractQr nextQrParser) {
        this.nextQrParser = nextQrParser;
    }

    abstract void logMessage();

    abstract protected void write(String message);

    abstract boolean canProcess();
}
