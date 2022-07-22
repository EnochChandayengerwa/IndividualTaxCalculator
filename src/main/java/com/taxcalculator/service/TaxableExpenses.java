package com.taxcalculator.service;

import com.taxcalculator.domain.TaxPayer;

public class TaxableExpenses {
  private static int year = 2022;

//  Get taxable expenses
  public static double calculateTaxableExpenses(TaxPayer taxPayer) {
    return getTaxableRetirementFunding(taxPayer) + getTaxableTravellingExpenses(taxPayer);
  }

//  Get taxable retirement funding
  public static double getTaxableRetirementFunding(TaxPayer taxPayer){
    double RetirementFunding = taxPayer.getRetirementFunding();
    double salary = taxPayer.getSalary();
    double bonus = taxPayer.getBonus();
    double maxTaxableRetirementFunding = (salary+bonus) * TaxRates.getRetirementFundingRate(year);
    if (RetirementFunding < maxTaxableRetirementFunding && maxTaxableRetirementFunding<TaxRates.getRetirementFundingMax(year)){
      RetirementFunding = RetirementFunding;
    }
    else{
      if (maxTaxableRetirementFunding < TaxRates.getRetirementFundingMax(year)) {
        RetirementFunding=maxTaxableRetirementFunding;
      }
      else{
        RetirementFunding=TaxRates.getRetirementFundingMax(year);
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
