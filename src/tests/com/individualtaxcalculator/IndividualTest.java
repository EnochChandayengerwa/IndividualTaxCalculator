package com.individualtaxcalculator;

import com.individualtaxcalculator.Individual;
import junit.framework.TestCase;

public class IndividualTest extends TestCase {
  Individual taxPayer;

  public void setUp() throws Exception {
    super.setUp();
    taxPayer = new Individual(600000.0,25000.0, 45312.0, 15381.0, 800000.0,
        162000.0, 90000.0, 12000.0);
  }

  public void testGetSalary() {
    double salary = taxPayer.getSalary();
    assertEquals(salary,600000.0);
  }

  public void testSetSalary() {
    taxPayer.setSalary(100000.0);
    assertEquals(taxPayer.getSalary(),100000.0);
  }

  public void testGetBonus() {
    double bonus = taxPayer.getBonus();
    assertEquals(bonus,25000.0);
  }

  public void testSetBonus() {
    taxPayer.setBonus(100000.0);
    assertEquals(taxPayer.getBonus(),100000.0);
  }

  public void testGetInterestReceived() {
    double interestReceived = taxPayer.getInterestReceived();
    assertEquals(interestReceived,45312.0);
  }

  public void testSetInterestReceived() {
    taxPayer.setInterestReceived(100000.0);
    assertEquals(taxPayer.getInterestReceived(),100000.0);
  }

  public void testGetDividends() {
    double dividends = taxPayer.getDividends();
    assertEquals(dividends,15381.0);
  }

  public void testSetDividends() {
    taxPayer.setDividends(100000.0);
    assertEquals(taxPayer.getDividends(),100000.0);
  }

  public void testGetCapitalGains() {
    double capitalGains = taxPayer.getCapitalGains();
    assertEquals(capitalGains,800000.0);
  }

  public void testSetCapitalGains() {
    taxPayer.setCapitalGains(100000.0);
    assertEquals(taxPayer.getCapitalGains(),100000.0);
  }

  public void testGetRetirementFunding() {
    double retirementFunding = taxPayer.getRetirementFunding();
    assertEquals(retirementFunding,162000.0);
  }

  public void testSetRetirementFunding() {
    taxPayer.setRetirementFunding(100000.0);
    assertEquals(taxPayer.getRetirementFunding(),100000.0);
  }

  public void testGetTravelAllowance() {
    double travelAllowance = taxPayer.getTravelAllowance();
    assertEquals(travelAllowance,90000.0);
  }

  public void testSetTravelAllowance() {
    taxPayer.setTravelAllowance(100000.0);
    assertEquals(taxPayer.getTravelAllowance(),100000.0);
  }

  public void testGetMedicalCredit() {
    double medicalCredit = taxPayer.getMedicalCredit();
    assertEquals(medicalCredit,12000.0);
  }

  public void testSetMedicalCredit() {
    taxPayer.setMedicalCredit(100000.0);
    assertEquals(taxPayer.getMedicalCredit(),100000.0);
  }
}