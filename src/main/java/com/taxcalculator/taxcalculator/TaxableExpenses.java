package com.taxcalculator.taxcalculator;

import com.taxcalculator.taxpayer.TaxPayer;

public class TaxableExpenses {

//  Get taxable expenses
  public static double calculateTaxableExpenses(TaxPayer taxPayer) {
    return getTaxableRetirementFunding(taxPayer) + getTaxableTravellingExpenses(taxPayer);
  }

//  Get taxable retirement funding
  public static double getTaxableRetirementFunding(TaxPayer taxPayer){
    double RetirementFunding = taxPayer.getRetirementFunding();
    double salary = taxPayer.getSalary();
    double bonus = taxPayer.getBonus();
    double maxTaxableRetirementFunding = (salary+bonus) * TaxRates.getRetirementFundingRate();
    if (RetirementFunding < maxTaxableRetirementFunding && maxTaxableRetirementFunding<TaxRates.getRetirementFundingMax()){
      RetirementFunding = RetirementFunding;
    }
    else{
      if (maxTaxableRetirementFunding < TaxRates.getRetirementFundingMax()) {
        RetirementFunding=maxTaxableRetirementFunding;
      }
      else{
        RetirementFunding=TaxRates.getRetirementFundingMax();
      }
    }
    return RetirementFunding;
  }

//  Get taxable travelling expenses
  public static double getTaxableTravellingExpenses(TaxPayer taxPayer){
    double TravellingExpenses = taxPayer.getTravelAllowance();
    return TravellingExpenses;
  }
}
