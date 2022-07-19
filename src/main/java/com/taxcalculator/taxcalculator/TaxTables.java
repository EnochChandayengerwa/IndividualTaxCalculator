package com.taxcalculator.taxcalculator;

public class TaxTables {

  private static final double[][] taxTable = new double[][]{
      {0,216200,0.18},
      {216201,337800,0.26},
      {337801,467500, 0.31},
      {467501,613600,0.36},
      {613601,782200,0.39},
      {782201,1656600,0.41},
      {1656601,1000000000,0.45}};

  public static double calculateNetTax(double nettTaxableIncome) {
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
