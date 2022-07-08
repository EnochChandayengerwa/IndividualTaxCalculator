package com.individualtaxcalculator;

public class Calculator {

  private Individual taxPayer;
  private double medicalCredit;
  private double primaryRebate = 15714.00;
  private double nettTaxableIncome;
  private double[][] taxTable = new double[][]{
      {0,216200,0.18},
      {216201,337800,0.26},
      {337801,467500, 0.31},
      {467501,613600,0.36},
      {613601,782200,0.39},
      {782201,1656600,0.41},
      {1656601,1000000000,0.45}};

  public Calculator(Individual taxPayer){
    this.taxPayer = taxPayer;
    this.medicalCredit = taxPayer.getMedicalCredit();
    this.nettTaxableIncome = taxPayer.getNettTaxableIncome();
  }

  public double taxPayable(){
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

  public double calculateTax(){
    return taxPayable()-primaryRebate-medicalCredit;
  }
}
