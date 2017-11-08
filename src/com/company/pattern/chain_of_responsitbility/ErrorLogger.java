package com.company.pattern.chain_of_responsitbility;

/**
 * Created by Mayokun on 10/31/2017.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: "+message);
    }
}
