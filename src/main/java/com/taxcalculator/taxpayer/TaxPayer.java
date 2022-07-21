package com.taxcalculator.taxpayer;

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

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

  public double getInterestReceived() {
    return interestReceived;
  }

  public void setInterestReceived(double interestReceived) {
    this.interestReceived = interestReceived;
  }

  public double getDividends() {
    return dividends;
  }

  public void setDividends(double dividends) {
    this.dividends = dividends;
  }

  public double getCapitalGains() {
    return capitalGains;
  }

  public void setCapitalGains(double capitalGains) {
    this.capitalGains = capitalGains;
  }

  public double getRetirementFunding() {
    return retirementFunding;
  }

  public void setRetirementFunding(double retirementFunding) {
    this.retirementFunding = retirementFunding;
  }

  public double getTravelAllowance() {
    return travelAllowance;
  }

  public void setTravelAllowance(double travelAllowance) {
    this.travelAllowance = travelAllowance;
  }

  public double getMedicalCredit() {
    return medicalCredit;
  }

  public void setMedicalCredit(double medicalCredit) {
    this.medicalCredit = medicalCredit;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public int getTaxReferenceNum() {
    return taxReferenceNum;
  }

  public void setTaxReferenceNum(int taxReferenceNum) {
    this.taxReferenceNum = taxReferenceNum;
  }
}
