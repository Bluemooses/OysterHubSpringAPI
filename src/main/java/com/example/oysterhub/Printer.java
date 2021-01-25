package com.example.oysterhub;

public class Printer {
    //create class Printer with toner level, number of pages printed, duplex printer ? : !
    private int tonerLevel;
    private int pagesPrinter;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel >-1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        else{
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinter = 0;
    }
    public int addToner(int tonerAmount){
        if(tonerLevel>0 &&  tonerAmount <= 100) {
            if(this.tonerLevel +  tonerAmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }
        else{
            return -1;
        }
    }
}
