package com.taxcalculator.taxcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaxTablesTest {

    @Test
    public void calculateNetTax() {
        double taxPayable = TaxTables.calculateNetTax(698512);
        assertEquals(taxPayable,196450,92);
    }
}