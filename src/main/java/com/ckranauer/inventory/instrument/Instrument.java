package com.ckranauer.inventory.instrument;

public class Instrument {

    protected String serialNumber;
    protected double price;
    protected InstrumentSpec instrumentSpec;

    public Instrument(String serialNumber, double price, InstrumentSpec instrumentSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.instrumentSpec = instrumentSpec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public InstrumentSpec getSpec(){
        return instrumentSpec;
    }
}
