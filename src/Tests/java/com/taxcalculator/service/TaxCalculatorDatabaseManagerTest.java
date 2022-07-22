package com.taxcalculator.taxcalculator;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaxCalculatorDatabaseManagerTest {

    @Test
    public void getInterestReceivedExemption() {
        double InterestExemption = TaxCalculatorDatabaseManager.getInterestReceivedExemption(2022);
        assertEquals(InterestExemption,23800,0);
    }

    @Test
    public void getCapitalGainsExemption() {
        double CapitalExemption = TaxCalculatorDatabaseManager.getCapitalGainsExemption(2022);
        assertEquals(CapitalExemption,40000,0);

    }

    @Test
    public void getCapitalGainsRate() {
        double rate = TaxCalculatorDatabaseManager.getCapitalGainsRate(2022);
        assertEquals(rate,0,4);
    }

    @Test
    public void getRetirementFundingRate() {
        double RetirementRate = TaxCalculatorDatabaseManager.getRetirementFundingRate(2022);
        assertEquals(RetirementRate,0,275);
    }

    @Test
    public void getPrimaryRebate() {
        double rebate = TaxCalculatorDatabaseManager.getPrimaryRebate(2022);
        assertEquals(rebate,15714,0);
    }

    @Test
    public void getRetirementFundingMax() {
        double max = TaxCalculatorDatabaseManager.getRetirementFundingMax(2022);
        assertEquals(max,350000,0);
    }

    //@Ignore
    //public void getTaxTables() {
        //double[][] taxTable = TaxCalculatorDatabaseManager.getTaxTables(2022);
        //assertArrayEquals();
    //}
}