package com.taxcalculator.taxcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaxRatesTest {

    @Test
    public void getCapitalGainsRate() {
        double rate= TaxRates.getCapitalGainsRate(2022);
        assertEquals(rate,0,4);
    }

    @Test
    public void getRetirementFundingRate() {
        double rate= TaxRates.getRetirementFundingRate(2022);
        assertEquals(rate,0,275);
    }

    @Test
    public void getRetirementFundingMax() {
        double max= TaxRates.getRetirementFundingMax(2022);
        assertEquals(max,350000,0);
    }

    @Test
    public void getPrimaryRebate() {
        double rebate= TaxRates.getPrimaryRebate(2022);
        assertEquals(rebate,15714,0);
    }
}