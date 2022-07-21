package com.taxcalculator.taxpayer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaxPayerTest {
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
    public void getSalary() {
        assertEquals(taxPayer.getSalary(),600000,0);
    }

    @Test
    public void setSalary() {
        taxPayer.setSalary(2000);
        assertEquals(taxPayer.getSalary(),2000,0);
    }

    @Test
    public void getBonus() {
        assertEquals(taxPayer.getBonus(),25000,0);
    }

    @Test
    public void getInterestReceived() {
        assertEquals(taxPayer.getInterestReceived(),45312,0);
    }

    @Test
    public void getDividends() {
        assertEquals(taxPayer.getDividends(),15381,0);
    }

    @Test
    public void getCapitalGains() {
        assertEquals(taxPayer.getCapitalGains(),800000,0);
    }

    @Test
    public void getRetirementFunding() {
        assertEquals(taxPayer.getRetirementFunding(),162000,0);
    }

    @Test
    public void getTravelAllowance() {
        assertEquals(taxPayer.getTravelAllowance(),90000,0);
    }

    @Test
    public void getMedicalCredit() {
        assertEquals(taxPayer.getMedicalCredit(),12000,0);
    }

    @Test
    public void getFullName() {
        assertEquals(taxPayer.getFullName(),"Sekapa Kekana");
    }

    @Test
    public void getDateOfBirth() {
        assertEquals(taxPayer.getDateOfBirth(),"19-09-2000");
    }

    @Test
    public void getTaxReferenceNum() {
        assertEquals(taxPayer.getTaxReferenceNum(),1760967);
    }

}