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


        Individual i = new Individual(salary,bonus, interestReceived, dividends, capitalGains,
            retirementFunding, travelAllowance, medicalCredit);
        System.out.println(i.getNettTaxableIncome());
    }
}
