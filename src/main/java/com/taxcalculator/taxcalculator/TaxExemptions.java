package com.taxcalculator.taxcalculator;

public class TaxExemptions {

  private static double INTEREST_RECEIVED_EXEMPTION = 23800.00;
  private static double CAPITAL_GAINS_EXEMPTION = 40000.00;

  public static double getInterestReceivedExemption() {
    return INTEREST_RECEIVED_EXEMPTION;
  }

  public static void setInterestReceivedExemption(double interestReceivedExemption) {
    INTEREST_RECEIVED_EXEMPTION = interestReceivedExemption;
  }

  public static double getCapitalGainsExemption() {
    return CAPITAL_GAINS_EXEMPTION;
  }

  public static void setCapitalGainsExemption(double capitalGainsExemption) {
    CAPITAL_GAINS_EXEMPTION = capitalGainsExemption;
  }

}
