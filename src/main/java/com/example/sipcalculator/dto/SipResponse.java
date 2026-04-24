package com.example.sipcalculator.dto;

public class SipResponse {

    private double investedAmount;
    private double maturityAmount;
    private double wealthGained;

    public SipResponse(
            double investedAmount,
            double maturityAmount,
            double wealthGained
    ){
        this.investedAmount = investedAmount;
        this.maturityAmount = maturityAmount;
        this.wealthGained = wealthGained;
    }

    public double getInvestedAmount() {
        return investedAmount;
    }

    public void setInvestedAmount(double investedAmount) {
        this.investedAmount = investedAmount;
    }

    public double getMaturityAmount() {
        return maturityAmount;
    }

    public void setMaturityAmount(double maturityAmount) {
        this.maturityAmount = maturityAmount;
    }

    public double getWealthGained() {
        return wealthGained;
    }

    public void setWealthGained(double wealthGained) {
        this.wealthGained = wealthGained;
    }
}
