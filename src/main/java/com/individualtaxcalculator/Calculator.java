package com.individualtaxcalculator;
public class Calculator {

  private static final double INTEREST_RECEIVED_EXEMPTION = 23800.00;
  private static final double CAPITAL_GAINS_EXEMPTION = 40000.00;
  private static final double CAPITAL_GAINS_RATE = 0.4;
  private static final double RETIREMENT_FUNDING_RATE = 0.275;
  private static final double RETIREMENT_FUNDING_MAX = 350000.00;
  private static final double PRIMARY_REBATE = 15714.00;

  private static final double[][] taxTable = new double[][]{
      {0,216200,0.18},
      {216201,337800,0.26},
      {337801,467500, 0.31},
      {467501,613600,0.36},
      {613601,782200,0.39},
      {782201,1656600,0.41},
      {1656601,1000000000,0.45}};

  public static double getTaxableIncome(Individual taxPayer){
    double salary = taxPayer.getSalary();
    double bonus = taxPayer.getBonus();
    double interestReceived = taxPayer.getInterestReceived() - INTEREST_RECEIVED_EXEMPTION;
    interestReceived = interestReceived <0?0: interestReceived;
    double taxableCapitalGains = taxPayer.getCapitalGains() - CAPITAL_GAINS_EXEMPTION;
    taxableCapitalGains = taxableCapitalGains <CAPITAL_GAINS_EXEMPTION?0: taxableCapitalGains;
    double totalCapitalGains = taxableCapitalGains * CAPITAL_GAINS_RATE;
    return salary + bonus + interestReceived + totalCapitalGains;
  }

  public static double getTaxableExpenses(Individual taxPayer){
    double RetirementFunding = taxPayer.getRetirementFunding();
    double salary = taxPayer.getSalary();
    double bonus = taxPayer.getBonus();
    double maxTaxableRetirementFunding = (salary+bonus) * RETIREMENT_FUNDING_RATE;
    if (RetirementFunding < maxTaxableRetirementFunding && maxTaxableRetirementFunding<RETIREMENT_FUNDING_MAX){
      RetirementFunding = RetirementFunding;
    }
    else{
      if (maxTaxableRetirementFunding < RETIREMENT_FUNDING_MAX) {
        RetirementFunding=maxTaxableRetirementFunding;
      }
      else{
        RetirementFunding=RETIREMENT_FUNDING_MAX;
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

  public static double calculateTax(Individual taxPayer){
    double medicalCredit = taxPayer.getMedicalCredit();
    double taxPayableAnnually = taxPayable(taxPayer)- PRIMARY_REBATE - medicalCredit;
    taxPayableAnnually = taxPayableAnnually<0?0: taxPayableAnnually;
    return taxPayableAnnually;

  }
}
