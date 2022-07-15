package java.com.individualtaxcalculator;

import com.individualtaxcalculator.Calculator;
import com.individualtaxcalculator.Individual;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
  Individual taxPayer;
  double primaryRebate = 15714.0;

  public void setUp() throws Exception {
    super.setUp();
    taxPayer = new Individual(600000.0,25000.0, 45312.0, 15381.0, 800000.0,
        162000.0, 90000.0, 12000.0);
  }

  public void testGetTaxableIncome() {
    double taxableIncome = Calculator.getTaxableIncome(taxPayer);
    assertEquals(taxableIncome,950512.0);
  }

  public void testGetTaxableExpenses() {
    double taxableExpenses = Calculator.getTaxableExpenses(taxPayer);
    assertEquals(taxableExpenses,252000.0);
  }

  public void testGetNettTaxableIncome() {
    double nettTaxableIncome = Calculator.getNettTaxableIncome(taxPayer);
    assertEquals(nettTaxableIncome,698512.0);
  }

  public void testTaxPayable() {
    double taxPayable = Calculator.taxPayable(taxPayer);
    assertEquals(taxPayable,196450.68);
  }

  public void testCalculateTax() {
    double tax = Calculator.calculateTax(taxPayer);
    assertEquals(tax,168736.68);
  }
}