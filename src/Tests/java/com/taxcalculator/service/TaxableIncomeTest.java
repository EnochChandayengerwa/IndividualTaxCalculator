package com.taxcalculator.taxcalculator;

import com.taxcalculator.taxpayer.TaxPayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaxableIncomeTest {
    TaxPayer taxPayer;
    @Before
    public void setUp(){
        taxPayer = new TaxPayer("Sekapa Kekana","19-09-2000",
                1760967,
                600000,
                25000,
                45312,
                15381,
                800000,
                162000,
                90000,
                12000);
    }

    @Test
    public void calculateTaxableIncome() {
        double taxableIncome = TaxableIncome.calculateTaxableIncome(taxPayer);
        assertEquals(taxableIncome,950512,0);
    }

    @Test
    public void getTaxableSalary() {
        double taxableSalary = TaxableIncome.getTaxableSalary(taxPayer);
        assertEquals(taxableSalary,600000,0);
    }

    @Test
    public void getTaxableBonus() {
        double taxableBonus = TaxableIncome.getTaxableBonus(taxPayer);
        assertEquals(taxableBonus,25000,0);
    }

    @Test
    public void getTaxableInterestReceived() {
        double taxableInterest = TaxableIncome.getTaxableInterestReceived(taxPayer);
        assertEquals(taxableInterest,21512,0);
    }

    @Test
    public void getTaxableCapitalGains() {
        double taxableCapitalG = TaxableIncome.getTaxableCapitalGains(taxPayer);
        assertEquals(taxableCapitalG,304000,0);
    }
}