package com.individualtaxcalculator;

public class Calculator {

  private Individual taxPayer;
  private double medicalCredit = 12000;
  private double primaryRebate = 15714.00;

  private double[] exemptions = new double[]{0,0,23800,0,40000,0,0};
  private double[] rates = new double[]{1,1,1,0,0.4,0.275,1};
  private int indexS = 0, indexB = 1, indexI = 2, indexD = 3, indexC = 4, indexR = 5, indexT = 6;

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
//    this.medicalCredit = taxPayer.getMedicalCredit();
//    this.nettTaxableIncome = taxPayer.getNettTaxableIncome();
  }

  private double getTaxableSalary(){
    return (taxPayer.getSalary()-exemptions[indexS])*rates[indexS];
  }

  private double getTaxableBonus(){
    return (taxPayer.getBonus()-exemptions[indexB])*rates[indexB];
  }

  private double getTaxableInterestReceived(){
    return (taxPayer.getInterestReceived()-exemptions[indexI])*rates[indexI] ;
  }

  private double getTaxableDividends(){
    return (taxPayer.getDividends()-exemptions[indexD])*rates[indexD];
  }

  private double getTaxableCapitalGains(){
    return (taxPayer.getCapitalGains()-exemptions[indexC])*rates[indexC];
  }

  private double getTaxableRetirementFunding(){
    double max = (getTaxableSalary()+getTaxableBonus())*rates[indexR];
    if(taxPayer.getRetirementFunding()<max&&max<350000) {
      return taxPayer.getRetirementFunding();
    }else{
      if(max<350000){return max;}
      else{return 350000;}
    }
  }

  private double getTaxableTravelAllowance(){
    return (taxPayer.getTravelAllowance()-exemptions[indexT])*rates[indexT];
  }

  public double getTaxableIncome(){
    return getTaxableSalary()+getTaxableBonus()+getTaxableInterestReceived()+
        getTaxableDividends()+getTaxableCapitalGains();
  }

  public double getTaxableExpenses(){
    return getTaxableRetirementFunding()+getTaxableTravelAllowance();
  }

  public double getNettTaxableIncome(){
    return getTaxableIncome()-getTaxableExpenses();
  }


  public double taxPayable(){
    double taxPayable= 0;
    int i = 0;
    double nettTaxableIncome = getNettTaxableIncome();

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
