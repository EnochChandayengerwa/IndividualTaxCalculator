package com.individualtaxcalculator;

public class Individual {

  private double salary;
  private double bonus;
  private double interestReceived;
  private double dividends;
  private double capitalGains;
  private double retirementFunding;
  private double travelAllowance;
  private double medicalCredit;

  public Individual(double salary, double bonus, double interestReceived, double dividends,
                    double capitalGains, double retirementFunding, double travelAllowance,
                    double medicalCredit) {
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
}