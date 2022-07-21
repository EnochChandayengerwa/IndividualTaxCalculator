package com.taxcalculator.ui;

import com.taxcalculator.taxcalculator.TaxCalculator;
import com.taxcalculator.taxcalculator.TaxableExpenses;
import com.taxcalculator.taxcalculator.TaxableIncome;
import com.taxcalculator.taxpayer.TaxPayer;
import com.taxcalculator.taxpayer.TaxPayerDatabaseManager;

import java.util.ArrayList;
import java.util.Scanner;

public class TaxPayerMenu {

  private static TaxPayer taxPayer;
  private static double nettTaxPayable;
  private static double nettTaxableIncome;

//    Display welcome message
  public static void DisplayWelcome() {
    System.out.println("-------Welcome to the Tax Calculator------");
    System.out.println("------------------------------------------");
  }

//    Print 2 options - create new taxpayer or select existing
  public static void SelectTaxPayer() {
    Scanner sc= new Scanner(System.in);
    System.out.println("1) Create new tax payer \n2) Select existing tax payer");
    int option = sc.nextInt();

    switch (option){
      case 1:
        taxPayer = new TaxPayer(TaxPayerInput.getFullName(),
            TaxPayerInput.getDateOfBirth(), TaxPayerInput.getTaxReferenceNum(),
            TaxPayerInput.getSalary(),TaxPayerInput.getBonus(),
            TaxPayerInput.getInterestReceived(), TaxPayerInput.getDividends(),
            TaxPayerInput.getCapitalGains(), TaxPayerInput.getRetirementFunding(),
            TaxPayerInput.getTravelAllowance(), TaxPayerInput.getMedicalCredit());
        TaxPayerDatabaseManager.addTaxPayer(taxPayer);
        break;
      case 2:
        int ref = getTaxPayer();
        taxPayer = TaxPayerDatabaseManager.getTaxPayer(ref);
        if(changeDetails()){
//          TaxPayerDatabaseManager.updateTaxPayer(taxPayer);
          TaxPayerDatabaseManager.updateTaxPayerFinances(taxPayer);
        }
        break;
    }
  }

//  Change taxpayer details for existing taxpayers
  private static boolean changeDetails() {
    System.out.println("--Would you like to update your finances--");
    System.out.println("1) Yes");
    System.out.println("2) No");
    Scanner sc= new Scanner(System.in);
    int option = sc.nextInt();
    if(option==1){
      return true;
    }else {
      return false;
    }
  }

//    Display and get existing taxpayers
  private static int getTaxPayer() {
    System.out.println("-------------Select TaxPayer--------------");
    ArrayList references = TaxPayerDatabaseManager.getAllTaxPayers();
    Scanner sc= new Scanner(System.in);
    int option = sc.nextInt();
    return (int) references.get(option-1);
  }

//    Call tax calculator with taxPayer as input to calculate tax
  public static void CalculateTax() {
    nettTaxPayable = TaxCalculator.calculateTax(taxPayer);
    nettTaxableIncome = TaxableIncome.calculateTaxableIncome(taxPayer)- TaxableExpenses.calculateTaxableExpenses(taxPayer);
  }

//    Call tax calculator with taxPayer as input to output tax
  public static void OutputTax() {
    TaxPayerOutput.DisplayOutput(nettTaxPayable, nettTaxableIncome);
  }
}
