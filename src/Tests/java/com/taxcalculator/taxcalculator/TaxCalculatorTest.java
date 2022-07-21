package com.taxcalculator.taxcalculator;

import com.taxcalculator.taxpayer.TaxPayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaxCalculatorTest {
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
    public void calculateTax() {
        double netTax = TaxCalculator.calculateTax(taxPayer);
        assertEquals(netTax,168736,92);
    }
}