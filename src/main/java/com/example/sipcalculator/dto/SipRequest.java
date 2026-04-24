package com.example.sipcalculator.dto;

public class SipRequest {

    private double monthlyInvestments;
    private double annualRate;
    private int years;

    public double getMonthlyInvestments() {
        return monthlyInvestments;
    }

    public void setMonthlyInvestments(double monthlyInvestments) {
        this.monthlyInvestments = monthlyInvestments;
    }

    public double getAnnualRate() {
        return annualRate;
    }

    public void setAnnualRate(double annualRate) {
        this.annualRate = annualRate;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
