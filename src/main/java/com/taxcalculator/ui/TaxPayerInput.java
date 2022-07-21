package com.taxcalculator.ui;

import java.util.Scanner;

public class TaxPayerInput {

//  Get full name
  public static String getFullName() {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter your full name - ");
    return sc.nextLine();
  }

//  Get ID
  public static String getDateOfBirth() {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter your date of birth (dd/mm/yyyy)- ");
    return sc.nextLine();
  }

//  Get tax reference number
  public static int getTaxReferenceNum() {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter your tax reference number - ");
    return sc.nextInt();
  }

//  Get salary
  public static double getSalary() {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter salary - R");
    return sc.nextDouble();
  }

//  Get bonus
  public static double getBonus(){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter bonus - R");
    return sc.nextDouble();
  }

//  Get interest received
  public static double getInterestReceived() {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter interest received - R");
    return sc.nextDouble();
  }

//  Get dividends
  public static double getDividends() {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter dividends - R");
    return sc.nextDouble();
  }

//  Get capital gains
  public static double getCapitalGains() {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter capital gains - R");
    return sc.nextDouble();
  }

//  Get retirement funding
  public static double getRetirementFunding() {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter retirement funding - R");
    return sc.nextDouble();
  }

//  Get travel allowance
  public static double getTravelAllowance() {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter travel allowance - R");
    return sc.nextDouble();
  }

//  Get medical credit
  public static double getMedicalCredit() {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter medical credit - R");
    return sc.nextDouble();
  }
}
