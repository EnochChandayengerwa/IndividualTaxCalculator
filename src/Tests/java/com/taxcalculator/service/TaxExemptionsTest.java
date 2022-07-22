package com.taxcalculator.taxcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaxExemptionsTest {

    @Test
    public void getInterestReceivedExemption() {
        double Exemption = TaxExemptions.getInterestReceivedExemption(2022);
        assertEquals(Exemption,23800,0);
    }

    @Test
    public void getCapitalGainsExemption() {
        double Exemption = TaxExemptions.getCapitalGainsExemption(2022);
        assertEquals(Exemption,40000,0);
    }
}