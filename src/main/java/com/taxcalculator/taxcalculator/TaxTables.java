package com.taxcalculator.taxcalculator;

public class TaxTables {

  private static int year = 2022;

  public static double calculateNetTax(double nettTaxableIncome) {
    double[][] taxTable = TaxCalculatorDatabaseManager.getTaxTables(year);
    double taxPayable= 0;
    int i = 0;

    while(nettTaxableIncome>0){
      double taxableIncome = taxTable[i][1] - taxTable[i][0];
      if(nettTaxableIncome>taxableIncome){
        taxPayable += (taxableIncome*taxTable[i][2]);
      }
      else if(nettTaxableIncome<taxableIncome){
        taxableIncome = nettTaxableIncome;
        taxPayable += (taxableIncome*taxTable[i][2]);
      }
      nettTaxableIncome -= taxableIncome;
      i++;
    }
    return taxPayable;
  }
}
