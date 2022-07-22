package com.taxcalculator.service;

import com.taxcalculator.domain.TaxPayer;

public class TaxableIncome {
  private static int year = 2022;

  //  Calculate taxable income
  public static double calculateTaxableIncome(TaxPayer taxPayer) {
    double salary = getTaxableSalary(taxPayer);
    double bonus = getTaxableBonus(taxPayer);
    double interestReceived = getTaxableInterestReceived(taxPayer);
    double taxableCapitalGains = getTaxableCapitalGains(taxPayer);

    return salary + bonus + interestReceived + taxableCapitalGains;
  }

//  Get taxable salary
  public static double getTaxableSalary(TaxPayer taxPayer){
    return taxPayer.getSalary();
  }

//  Get taxable bonus
  public static double getTaxableBonus(TaxPayer taxPayer){
    return taxPayer.getBonus();
  }

//  Get taxable interest received
  public static double getTaxableInterestReceived(TaxPayer taxPayer){
    double interestReceived =
        taxPayer.getInterestReceived() - TaxExemptions.getInterestReceivedExemption(year);
    interestReceived = interestReceived <0?0: interestReceived;
    return interestReceived;
  }

//  Get taxable capital gains
  public static double getTaxableCapitalGains(TaxPayer taxPayer){
    double taxableCapitalGains =
        taxPayer.getCapitalGains() - TaxExemptions.getCapitalGainsExemption(year);
    taxableCapitalGains = taxableCapitalGains <TaxExemptions.getCapitalGainsExemption(year)?0:
        taxableCapitalGains;
    double totalCapitalGains = taxableCapitalGains * TaxRates.getCapitalGainsRate(year);

    return totalCapitalGains;
  }
}
