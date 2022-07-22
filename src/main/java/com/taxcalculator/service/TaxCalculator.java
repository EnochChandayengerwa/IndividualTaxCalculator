package com.taxcalculator.service;

import com.taxcalculator.domain.TaxPayer;

public class TaxCalculator {

  static private double TAXABLE_INCOME;
  static private double TAXABLE_EXPENSES;
  static private double NETT_TAX_PAYABLE;
  private static int year = 2022;


  //  Calculate nett tax payable
  public static double calculateTax(TaxPayer taxPayer) {
    TAXABLE_INCOME = TaxableIncome.calculateTaxableIncome(taxPayer);
    TAXABLE_EXPENSES = TaxableExpenses.calculateTaxableExpenses(taxPayer);
    NETT_TAX_PAYABLE = TaxTables.calculateNetTax(TAXABLE_INCOME-TAXABLE_EXPENSES);
    NETT_TAX_PAYABLE -= (taxPayer.getMedicalCredit() + TaxRates.getPrimaryRebate(year));
    NETT_TAX_PAYABLE = NETT_TAX_PAYABLE<0?0: NETT_TAX_PAYABLE;

    return NETT_TAX_PAYABLE;

  }


}
