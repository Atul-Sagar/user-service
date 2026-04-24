package com.example.sipcalculator.service;

import org.springframework.stereotype.Service;

@Service
public class SipService {

    public double calculateSIP(double monthlyInvestment, double annualRate, int years){

        double r = annualRate / 12 / 100;
        int n = years * 12;

        return monthlyInvestment *
                ((Math.pow(1 + r, n) - 1) / r) *
                (1 + r);
    }

}
