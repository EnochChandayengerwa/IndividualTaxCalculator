package com.individualtaxcalculator;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter salary - R");
        double salary = sc.nextDouble();
        System.out.print("Enter bonus - R");
        double bonus = sc.nextDouble();
        System.out.print("Enter interestReceived - R");
        double interestReceived = sc.nextDouble();
        System.out.print("Enter dividends - R");
        double dividends = sc.nextDouble();
        System.out.print("Enter capital gains - R");
        double capitalGains = sc.nextDouble();
        System.out.print("Enter retirementFunding - R");
        double retirementFunding = sc.nextDouble();
        System.out.print("Enter travelAllowance - R");
        double travelAllowance = sc.nextDouble();
        System.out.print("Enter medicalCredit - R");
        double medicalCredit = sc.nextDouble();


        Individual taxPayer = new Individual(salary,bonus, interestReceived, dividends,
            capitalGains,
            retirementFunding, travelAllowance, medicalCredit);

        System.out.println(taxPayer.getTaxableIncome());
        System.out.println(taxPayer.getTaxableExpenses());
        Calculator taxCalculator = new Calculator(taxPayer);
        double netTaxPayable = taxCalculator.calculateTax();

        System.out.println("------------------------------------------");
        System.out.println("Nett Tax Payable (Annual) - R"+Math.round(netTaxPayable*100.0)/100.0);
        System.out.println("Nett Tax Payable (Monthly) - R"+Math.round((netTaxPayable/12)*100.0)/100.0);
        System.out.println("Average Tax Rate - "+Math.round((netTaxPayable/taxPayer.getNettTaxableIncome()*100)*100.0)/100.0+"%");
        System.out.println("------------------------------------------");
    }
}
