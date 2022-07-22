package com.taxcalculator.domain;

public class TaxPayer {

//  Personal Variables
  private String fullName;
  private int taxReferenceNum;
  private String dateOfBirth;

//  Financial Variables
  private double salary, bonus, interestReceived, dividends,
      capitalGains, retirementFunding, travelAllowance,
      medicalCredit;

//  Constructor (initialise variables)
  public TaxPayer(String fullName, String dateOfBirth, int taxReferenceNum, double salary, double bonus,
                  double interestReceived, double dividends,
                  double capitalGains, double retirementFunding, double travelAllowance,
                  double medicalCredit) {
    this.fullName = fullName;
    this.dateOfBirth = dateOfBirth;
    this.taxReferenceNum = taxReferenceNum;
    this.salary = salary;
    this.bonus = bonus;
    this.interestReceived = interestReceived;
    this.dividends = dividends;
    this.capitalGains = capitalGains;
    this.retirementFunding = retirementFunding;
    this.travelAllowance = travelAllowance;
    this.medicalCredit = medicalCredit;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public double getBonus() {
    return bonus;
  }

  public double getInterestReceived() {
    return interestReceived;
  }

  public double getDividends() {
    return dividends;
  }

  public double getCapitalGains() {
    return capitalGains;
  }

  public double getRetirementFunding() {
    return retirementFunding;
  }

  public double getTravelAllowance() {
    return travelAllowance;
  }

  public double getMedicalCredit() {
    return medicalCredit;
  }

  public String getFullName() {
    return fullName;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public int getTaxReferenceNum() {
    return taxReferenceNum;
  }

}
