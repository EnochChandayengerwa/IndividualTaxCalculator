package com.individualtaxcalculator;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Variables
        double salary, bonus, interestReceived, dividends, capitalGains, retirementFunding,
            travelAllowance, medicalCredit;

//        Get User Input
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter salary - R");
        salary = sc.nextDouble();
        System.out.print("Enter bonus - R");
        bonus = sc.nextDouble();
        System.out.print("Enter interest received - R");
        interestReceived = sc.nextDouble();
        System.out.print("Enter dividends - R");
        dividends = sc.nextDouble();
        System.out.print("Enter capital gains - R");
        capitalGains = sc.nextDouble();
        System.out.print("Enter retirement funding - R");
        retirementFunding = sc.nextDouble();
        System.out.print("Enter travel allowance - R");
        travelAllowance = sc.nextDouble();
        System.out.print("Enter medical credit - R");
        medicalCredit = sc.nextDouble();

//        Create Tax Payer
        Individual taxPayer = new Individual(salary,bonus, interestReceived, dividends, capitalGains,
            retirementFunding, travelAllowance, medicalCredit);

//        Calculate Tax
        double nettTaxableIncome = Calculator.getNettTaxableIncome(taxPayer);
        double taxPayableAnnually = Calculator.calculateTax(taxPayer);

//        Display Output
        System.out.println("------------------------------------------");
        System.out.println("Nett Tax Payable (Annual) - R"+Math.round(taxPayableAnnually*100.0)/100.0);
        System.out.println("Nett Tax Payable (Monthly) - R"+Math.round((taxPayableAnnually/12)*100.0)/100.0);
        System.out.println("Average Tax Rate - "+Math.round((taxPayableAnnually/nettTaxableIncome*100)*100.0)/100.0+"%");
        System.out.println("------------------------------------------");
    }
}
