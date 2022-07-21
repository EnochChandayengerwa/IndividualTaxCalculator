package com.taxcalculator.taxpayer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaxPayerDatabaseManagerTest {
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
    public void addTaxPayer() {
        try
        {
            TaxPayerDatabaseManager.addTaxPayer(taxPayer);
            return; // indicates success
        }
        catch (Exception ex) {
            assertTrue(false);
        }
    }

    @Test
    public void addTaxPayerFinances() {
        try
        {
            TaxPayerDatabaseManager.addTaxPayerFinances(taxPayer);
            return; // indicates success
        }
        catch (Exception ex) {
            assertTrue(false);
        }
    }

    @Test
    public void updateTaxPayer() {
        try
        {
            TaxPayerDatabaseManager.updateTaxPayer(taxPayer);
            return; // indicates success
        }
        catch (Exception ex) {
            assertTrue(false);
        }
    }

    @Test
    public void updateTaxPayerFinances() {
        try
        {
            TaxPayerDatabaseManager.updateTaxPayerFinances(taxPayer);
            return; // indicates success
        }
        catch (Exception ex) {
            assertTrue(false);
        }
    }

    @Test
    public void getTaxPayer() {
        try
        {
            TaxPayerDatabaseManager.getTaxPayer(taxPayer.getTaxReferenceNum());
            return; // indicates success
        }
        catch (Exception ex) {
            assertTrue(false);
        }
    }

    @Test
    public void getAllTaxPayers() {
        try
        {
            TaxPayerDatabaseManager.getAllTaxPayers();
            return; // indicates success
        }
        catch (Exception ex) {
            assertTrue(false);
        }
    }
}