package org.train;

public class NumberToConvert {
    private double number;

    public NumberToConvert(double number) {
        this.number = number;
    }
    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    static double KgToGr(double kg) {
        return kg*1000;
    }

    static double GrToKg(double gr) {
        return gr/1000;
    }
}
