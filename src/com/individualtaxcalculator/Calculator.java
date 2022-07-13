package com.individualtaxcalculator;

public class Calculator {

//  private final Individual taxPayer;
  private static final double INTEREST_RECEIVED_EXEMPTION = 23800.00;


  private static final double[][] taxTable = new double[][]{
      {0,216200,0.18},
      {216200,337800,0.26},
      {337800,467500, 0.31},
      {467500,613600,0.36},
      {613600,782200,0.39},
      {782200,1656600,0.41},
      {1656600,1000000000,0.45}};

 // public Calculator(Individual taxPayer){
 //   this.taxPayer = taxPayer;
//    this.medicalCredit = taxPayer.getMedicalCredit();
//    this.nettTaxableIncome = taxPayer.getNettTaxableIncome();
 // }


  public static double getTaxableIncome(Individual taxPayer){
    double Salary = taxPayer.getSalary();
    double bonus = taxPayer.getBonus();
    double taxableInterestReceived = taxPayer.getInterestReceived() - INTEREST_RECEIVED_EXEMPTION;
    taxableInterestReceived = taxableInterestReceived <0?0: taxableInterestReceived;
    double taxableCapitalGains = taxPayer.getCapitalGains() - 40000.00;
    taxableCapitalGains = taxableCapitalGains <0?0: taxableCapitalGains;
    double taxableTotalCapitalGains = taxableCapitalGains * 0.4;
    return Salary + bonus + taxableInterestReceived + taxableTotalCapitalGains;
  }
  public static double getTaxableExpenses(Individual taxPayer){
    double RetirementFunding = taxPayer.getRetirementFunding();
    double Salary = taxPayer.getSalary();
    double bonus = taxPayer.getBonus();
    double maxTaxableRetirementFunding = (Salary+bonus) * 0.275;
    if (RetirementFunding < maxTaxableRetirementFunding && maxTaxableRetirementFunding<350000){
      RetirementFunding = RetirementFunding;
    }
    else{
      if (maxTaxableRetirementFunding < 350000) {
        RetirementFunding=maxTaxableRetirementFunding;
      }
      else{
        RetirementFunding=350000;
      }
    }
    double TravellingExpenses = taxPayer.getTravelAllowance();
    return RetirementFunding + TravellingExpenses;
  }

  public static double getNettTaxableIncome(Individual taxPayer){
    return getTaxableIncome(taxPayer)-getTaxableExpenses(taxPayer);
  }

  public static double taxPayable(Individual taxPayer){
    double taxPayable= 0;
    int i = 0;
    double nettTaxableIncome = getNettTaxableIncome(taxPayer);

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

  public static void calculateTax(Individual taxPayer){
    double medicalCredit = 12000;
    double primaryRebate = 15714.00;
    double taxPayableAnnually = taxPayable(taxPayer)- primaryRebate - medicalCredit;
    System.out.println("------------------------------------------");
    System.out.println("Nett Tax Payable (Annual) - R"+Math.round(taxPayableAnnually*100.0)/100.0);
    System.out.println("Nett Tax Payable (Monthly) - R"+Math.round((taxPayableAnnually/12)*100.0)/100.0);
    System.out.println("Average Tax Rate - "+Math.round((taxPayableAnnually/getNettTaxableIncome(taxPayer)*100)*100.0)/100.0+"%");
    System.out.println("------------------------------------------");

  }
}
