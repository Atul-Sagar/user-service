package com.example.sipcalculator.controller;


import com.example.sipcalculator.dto.SipRequest;
import com.example.sipcalculator.dto.SipResponse;
import com.example.sipcalculator.service.SipService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sip")
@SecurityRequirement(name="bearerAuth")
public class SipController {

    @Autowired
    private SipService sipService;

    @PostMapping("/calculate")
    public SipResponse calculate(@RequestBody SipRequest request){

        System.out.println("Investment: " + request.getMonthlyInvestments());
        System.out.println("Rate: " + request.getAnnualRate());
        System.out.println("Years: " + request.getYears());

        double maturityAmount = sipService.calculateSIP(
            request.getMonthlyInvestments(),
            request.getAnnualRate(),
            request.getYears()
        );

        double investedAmount = request.getMonthlyInvestments() * request.getYears() * 12;
        double wealthGained = maturityAmount - investedAmount;

        return  new SipResponse(investedAmount, maturityAmount, wealthGained);
    }

}
