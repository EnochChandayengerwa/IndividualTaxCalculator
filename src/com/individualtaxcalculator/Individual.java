package com.individualtaxcalculator;

public class Individual {
  private double salary;
  private double bonus;
  private  double interestReceived;
  private  double dividends;
  private  double capitalGains;
  private double retirementFunding;
  private double travelAllowance;
//  private double medicalCredit;

//  private double[] exemptions = new double[]{0,0,23800,0,40000,0,0};
//  private double[] rates = new double[]{1,1,1,0,0.4,0.275,1};
//  private int indexS = 0, indexB = 1, indexI = 2, indexD = 3, indexC = 4, indexR = 5, indexT = 6;

  public Individual(double salary, double bonus, double interestReceived, double dividends,
                    double capitalGains, double retirementFunding, double travelAllowance
                    /*,double medicalCredit*/){
    this.salary = salary;
    this.bonus = bonus;
    this.interestReceived = interestReceived;
    this.dividends = dividends;
    this.capitalGains = capitalGains;
    this.retirementFunding = retirementFunding;
    this.travelAllowance = travelAllowance;
//    this.medicalCredit = medicalCredit;
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

//  public double getMedicalCredit() {
//    return medicalCredit;
//  }
//
//  public void setMedicalCredit(double medicalCredit) {
//    this.medicalCredit = medicalCredit;
//  }

//  private double getTaxableSalary(){
//    return (salary-exemptions[indexS])*rates[indexS];
//  }
//
//  private double getTaxableBonus(){
//    return (bonus-exemptions[indexB])*rates[indexB];
//  }
//
//  private double getTaxableInterestReceived(){
//    return (interestReceived-exemptions[indexI])*rates[indexI] ;
//  }
//
//  private double getTaxableDividends(){
//    return (dividends-exemptions[indexD])*rates[indexD];
//  }
//
//  private double getTaxableCapitalGains(){
//    return (capitalGains-exemptions[indexC])*rates[indexC];
//  }
//
//  private double getTaxableRetirementFunding(){
//    double max = (getTaxableSalary()+getTaxableBonus())*rates[indexR];
//    if(retirementFunding<max&&max<350000) {
//      return retirementFunding;
//    }else{
//      if(max<350000){return max;}
//      else{return 350000;}
//    }
//  }
//
//  private double getTaxableTravelAllowance(){
//    return (travelAllowance-exemptions[indexT])*rates[indexT];
//  }
//
//  public double getMedicalCredit(){
//    return medicalCredit;
//  }
//
//  public double getTaxableIncome(){
//    return getTaxableSalary()+getTaxableBonus()+getTaxableInterestReceived()+
//        getTaxableDividends()+getTaxableCapitalGains();
//  }
//
//  public double getTaxableExpenses(){
//    return getTaxableRetirementFunding()+getTaxableTravelAllowance();
//  }
//
//  public double getNettTaxableIncome(){
//    return getTaxableIncome()-getTaxableExpenses();
//  }
}
