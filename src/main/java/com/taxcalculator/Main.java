package com.taxcalculator;
import com.taxcalculator.ui.TaxPayerMenu;

public class Main {

  public static void main(String[] args) {
    TaxPayerMenu.DisplayWelcome();
    TaxPayerMenu.SelectTaxPayer();
    TaxPayerMenu.CalculateTax();
    TaxPayerMenu.OutputTax();
  }
}
