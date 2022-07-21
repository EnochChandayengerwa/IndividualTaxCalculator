package com.taxcalculator.taxcalculator;

public class TaxRates {

  private static double CAPITAL_GAINS_RATE;
  private static double RETIREMENT_FUNDING_RATE;
  private static double RETIREMENT_FUNDING_MAX;
  private static double PRIMARY_REBATE;

  public static double getCapitalGainsRate(int year) {
    return TaxCalculatorDatabaseManager.getCapitalGainsRate(year);
  }

  public static double getRetirementFundingRate(int year) {
    return TaxCalculatorDatabaseManager.getRetirementFundingRate(year);
  }

  public static double getRetirementFundingMax(int year) {
    return TaxCalculatorDatabaseManager.getRetirementFundingMax(year);
  }

  public static double getPrimaryRebate(int year) {
    return TaxCalculatorDatabaseManager.getPrimaryRebate(year);
  }
}
