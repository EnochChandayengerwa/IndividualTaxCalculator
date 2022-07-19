package com.taxcalculator.ui;

import com.taxcalculator.taxcalculator.TaxCalculator;
import com.taxcalculator.taxcalculator.TaxableExpenses;
import com.taxcalculator.taxcalculator.TaxableIncome;
import com.taxcalculator.taxpayer.TaxPayer;
import com.taxcalculator.taxpayer.TaxPayerRepository;
import java.util.Scanner;

public class TaxPayerMenu {

  private static TaxPayer TAXPAYER;
  private static double NETT_TAX_PAYABLE;
  private static double NET_TAXABLE_INCOME;

//    Display welcome message
  public static void DisplayWelcome() {
    System.out.println("------------------------------------------");
    System.out.println("Welcome to the Tax Calculator");
    System.out.println("------------------------------------------");
  }

//    Print 2 options - create new taxpayer or select existing
  public static void SelectTaxPayer() {
    Scanner sc= new Scanner(System.in);
    System.out.println("1) Create new tax payer \n2) Select existing tax payer");
    int option = sc.nextInt();

    switch (option){
      case 1:
        TAXPAYER = new TaxPayer(TaxPayerInput.getFullName(),
            TaxPayerInput.getID(), TaxPayerInput.getTaxReferenceNum(),
            TaxPayerInput.getSalary(),TaxPayerInput.getBonus(),
            TaxPayerInput.getInterestReceived(), TaxPayerInput.getDividends(),
            TaxPayerInput.getCapitalGains(), TaxPayerInput.getRetirementFunding(),
            TaxPayerInput.getTravelAllowance(), TaxPayerInput.getMedicalCredit());
        break;
      case 2:
        TAXPAYER = TaxPayerRepository.getExistingTaxPayer();
        break;
    }
  }

//    Call tax calculator with taxPayer as input to calculate tax
  public static void CalculateTax() {
    NETT_TAX_PAYABLE = TaxCalculator.calculateTax(TAXPAYER);
    NET_TAXABLE_INCOME = TaxableIncome.calculateTaxableIncome(TAXPAYER)- TaxableExpenses.calculateTaxableExpenses(TAXPAYER);
  }

//    Call tax calculator with taxPayer as input to output tax
  public static void OutputTax() {
    TaxPayerOutput.DisplayOutput(NETT_TAX_PAYABLE, NET_TAXABLE_INCOME);
  }
}
