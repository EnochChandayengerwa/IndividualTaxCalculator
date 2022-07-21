package com.taxcalculator.taxcalculator;

import com.taxcalculator.taxpayer.TaxPayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaxableExpensesTest {
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
    public void calculateTaxableExpenses() {
        double taxableExpenses = TaxableExpenses.calculateTaxableExpenses(taxPayer);
        assertEquals(taxableExpenses,252000,0);
    }

    @Test
    public void getTaxableRetirementFunding() {
        double taxableRetirement = TaxableExpenses.getTaxableRetirementFunding(taxPayer);
        assertEquals(taxableRetirement,162000,0);

    }

    @Test
    public void getTaxableTravellingExpenses() {
        double taxableTravellingEx = TaxableExpenses.getTaxableTravellingExpenses(taxPayer);
        assertEquals(taxableTravellingEx,90000,0);
    }
}