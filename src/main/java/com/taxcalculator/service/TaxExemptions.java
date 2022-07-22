package com.taxcalculator.service;

public class TaxExemptions {

  private static double INTEREST_RECEIVED_EXEMPTION;
  private static double CAPITAL_GAINS_EXEMPTION;

  public static double getInterestReceivedExemption(int year) {
    return TaxCalculatorDatabaseManager.getInterestReceivedExemption(year);
  }

  public static double getCapitalGainsExemption(int year) {
    return TaxCalculatorDatabaseManager.getCapitalGainsExemption(year);
  }
}
