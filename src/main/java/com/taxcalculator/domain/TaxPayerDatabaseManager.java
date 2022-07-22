package com.taxcalculator.domain;

import com.taxcalculator.database.DatabaseManager;
import com.taxcalculator.ui.TaxPayerInput;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TaxPayerDatabaseManager {
  private static Connection connection = DatabaseManager.getConnection();

  public static void addTaxPayer(TaxPayer taxPayer) {
    try{
      String query = "insert into public.\"TaxPayer\" values(" +
          "'"+taxPayer.getTaxReferenceNum()+"',"+
          "'"+taxPayer.getFullName()+"',"+
          "'"+taxPayer.getDateOfBirth()+"')";

      Statement statement = connection.createStatement();
      statement.executeUpdate(query);
    }catch (Exception e){
      e.printStackTrace();
    }
    addTaxPayerFinances(taxPayer);
  }

  public static void addTaxPayerFinances(TaxPayer taxPayer) {
    try{
      String query = "insert into public.\"TaxPayerFinances\" values(" +
          "'"+taxPayer.getTaxReferenceNum()+"',"+
          "'"+taxPayer.getSalary()+"',"+
          "'"+taxPayer.getBonus()+"',"+
          "'"+taxPayer.getInterestReceived()+"',"+
          "'"+taxPayer.getDividends()+"',"+
          "'"+taxPayer.getCapitalGains()+"',"+
          "'"+taxPayer.getRetirementFunding()+"',"+
          "'"+taxPayer.getTravelAllowance()+"',"+
          "'"+taxPayer.getMedicalCredit()+"')";

      Statement statement = connection.createStatement();
      statement.executeUpdate(query);
    }catch (Exception e){
      e.printStackTrace();
    }
  }

  public static void updateTaxPayer(TaxPayer taxPayer){
    try {
      String query = "update public.\"TaxPayer\" set " +
          "\"fullName\" = " + "'"+TaxPayerInput.getFullName()+"', " +
          "\"dateOfBirth\" = '"+TaxPayerInput.getDateOfBirth()+"'" +
          "where \"taxReferenceNum\" = "+taxPayer.getTaxReferenceNum()+";";

      Statement statement = connection.createStatement();
      statement.executeUpdate(query);
    }catch (Exception e){
      e.printStackTrace();
    }
  }

  public static void updateTaxPayerFinances(TaxPayer taxPayer){
    try {
      String query = "update public.\"TaxPayerFinances\" set " +
          "\"salary\"='"+ TaxPayerInput.getSalary()+"', "+
          "\"bonus\"='"+ TaxPayerInput.getBonus()+"',  "+
          "\"interestReceived\"='"+ TaxPayerInput.getInterestReceived()+"',  "+
          "\"dividends\"='"+ TaxPayerInput.getDividends()+"', "+
          "\"capitalGains\"='"+ TaxPayerInput.getCapitalGains()+"', "+
          "\"retirementFunding\"='"+ TaxPayerInput.getRetirementFunding()+"', "+
          "\"travelAllowance\"='"+ TaxPayerInput.getTravelAllowance()+"', "+
          "\"medicalCredit\"='"+ TaxPayerInput.getMedicalCredit()+"' "+
          "where \"taxReferenceNum\"= "+taxPayer.getTaxReferenceNum()+";";
      Statement statement = connection.createStatement();
      statement.executeUpdate(query);
    }catch (Exception e){
      e.printStackTrace();
    }
  }

  public static TaxPayer getTaxPayer(int taxReferenceNum){
    ResultSet rs1 = null;
    ResultSet rs2 = null;
    try{
      String query1 = "select * from public.\"TaxPayer\" " +
          "where \"taxReferenceNum\" = '"+taxReferenceNum+"'";
      Statement statement1 = connection.createStatement();

      String query2 = "select * from public.\"TaxPayerFinances\" " +
          "where \"taxReferenceNum\" = '"+taxReferenceNum+"'";
      Statement statement2 = connection.createStatement();

      rs1 = statement1.executeQuery(query1);
      rs2 = statement2.executeQuery(query2);

      String fullName=null, dateOfBirth=null;
      double salary=0, bonus=0, interestReceived=0, dividends=0, capitalGains=0,
      retirementFunding=0, travelAllowance=0, medicalCredit=0;

      if(rs1.next()){
        fullName = rs1.getString(2);
        dateOfBirth = rs1.getString(3);
      }
      if(rs2.next()){
        salary = rs2.getDouble(2);
        bonus = rs2.getDouble(3);
        interestReceived = rs2.getDouble(4);
        dividends = rs2.getDouble(5);
        capitalGains =rs2.getDouble(6);
        retirementFunding =rs2.getDouble(7);
        travelAllowance =rs2.getDouble(8);
        medicalCredit =rs2.getDouble(9);
      }

      TaxPayer taxPayer = new TaxPayer(fullName, dateOfBirth,
          taxReferenceNum, salary, bonus, interestReceived, dividends,
        capitalGains, retirementFunding, travelAllowance,
        medicalCredit);
      return taxPayer;

    }catch (Exception e){
      e.printStackTrace();
      return null;
    }
  }

  public static ArrayList getAllTaxPayers() {
    ResultSet rs = null;
    try{
      String query = "select * from public.\"TaxPayer\"";
      Statement statement = connection.createStatement();

      rs = statement.executeQuery(query);

      int count =1;
      ArrayList references = new ArrayList<>();
      while(rs.next()){
        System.out.println(count+") "+rs.getString(2));
        references.add(rs.getInt(1));
        count++;
      }
      return references;

    }catch (Exception e){
      e.printStackTrace();
      return null;
    }
  }
}
