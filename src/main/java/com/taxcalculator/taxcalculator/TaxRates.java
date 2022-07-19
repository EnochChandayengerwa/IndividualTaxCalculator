package com.taxcalculator.taxcalculator;

public class TaxRates {

  private static double CAPITAL_GAINS_RATE = 0.4;
  private static double RETIREMENT_FUNDING_RATE = 0.275;
  private static double RETIREMENT_FUNDING_MAX = 350000.00;
  private static double PRIMARY_REBATE = 15714.00;

  public static double getCapitalGainsRate() {
    return CAPITAL_GAINS_RATE;
  }

  public static void setCapitalGainsRate(double capitalGainsRate) {
    CAPITAL_GAINS_RATE = capitalGainsRate;
  }

  public static double getRetirementFundingRate() {
    return RETIREMENT_FUNDING_RATE;
  }

  public static void setRetirementFundingRate(double retirementFundingRate) {
    RETIREMENT_FUNDING_RATE = retirementFundingRate;
  }

  public static double getRetirementFundingMax() {
    return RETIREMENT_FUNDING_MAX;
  }

  public static void setRetirementFundingMax(double retirementFundingMax) {
    RETIREMENT_FUNDING_MAX = retirementFundingMax;
  }

  public static double getPrimaryRebate() {
    return PRIMARY_REBATE;
  }

  public static void setPrimaryRebate(double primaryRebate) {
    PRIMARY_REBATE = primaryRebate;
  }
}
