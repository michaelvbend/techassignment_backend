package com.example.emiCalculator.model;

public class Loan {
    private double p;
    private double r;
    private double n;

    public Loan(double p, double r, double n) {
        this.p = p;
        this.r = r;
        this.n = n;
    }

    public double calculateEmi() {
        double rPerMonth = (this.r / 12) / 100;
        double pInTotal = this.p * 12;
        double emi = (this.n * rPerMonth * Math.pow(1 + rPerMonth,pInTotal)) / (Math.pow(1 + rPerMonth, pInTotal) - 1);

        return emi;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "p=" + p +
                ", r=" + r +
                ", n=" + n +
                '}';
    }

    public boolean isPValid(){
        return this.p > 0 && this.p <= 30;
    }

    public boolean isRValid(){
        return this.r > 0 && this.r <= 100;
    }

    public boolean isNValid(){
        return this.n > 0;
    }

    public boolean isLoanValid() {
        return this.isPValid() && this.isRValid() && this.isNValid();
    }
}
