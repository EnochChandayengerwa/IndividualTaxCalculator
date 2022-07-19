package com.taxcalculator.ui;

public class TaxPayerOutput {

//  Display user output
  public static void DisplayOutput(double nettTaxPayable, double nettTaxableIncome) {
    System.out.println("------------------------------------------");
    System.out.println("Nett Tax Payable (Annual) - R"+getNettTaxPayableAnnual(nettTaxPayable));
    System.out.println("Nett Tax Payable (Monthly) - R"+getNettTaxPayableMonthly(nettTaxPayable));
    System.out.println("Average Tax Rate - "+getNettTaxPayableRate(nettTaxPayable,
        nettTaxableIncome)+"%");
    System.out.println("------------------------------------------");
  }

//  Get annual amount
  public static double getNettTaxPayableAnnual(double nettTaxPayable){
    return  Math.round(nettTaxPayable*100.0)/100.0;
  }

//  Get monthly amount
  public static double getNettTaxPayableMonthly(double nettTaxPayable){
    return Math.round((nettTaxPayable/12)*100.0)/100.0;
  }

//  Get tax rate
  public static double getNettTaxPayableRate(double nettTaxPayable, double nettTaxableIncome){
    return Math.round((nettTaxPayable/ nettTaxableIncome *100)*100.0)/100.0;
  }
}
