package com.taxcalculator.taxcalculator;

import com.taxcalculator.database.DatabaseManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TaxCalculatorDatabaseManager {
  private static Connection connection = DatabaseManager.getConnection();


  public static double getInterestReceivedExemption(int year) {
    ResultSet rs = null;
    try{
      String query = "select \"interestReceivedExemption\" from public.\"TaxExemptions\"" +
          " where \"year\" = "+year+";";
      Statement statement = connection.createStatement();

      rs = statement.executeQuery(query);

      if(rs.next()){return rs.getDouble(1);}
      else return 0;


    }catch (Exception e){
      e.printStackTrace();
      return 0;
    }
  }

  public static double getCapitalGainsExemption(int year) {
    ResultSet rs = null;
    try{
      String query = "select \"capitalGainsExemption\" from public.\"TaxExemptions\"" +
          " where \"year\" = "+year+";";
      Statement statement = connection.createStatement();

      rs = statement.executeQuery(query);

      if(rs.next()){return rs.getDouble(1);}
      else return 0;

    }catch (Exception e){
      e.printStackTrace();
      return 0;
    }
  }

  public static double getCapitalGainsRate(int year) {
    ResultSet rs = null;
    try{
      String query = "select \"capitalGainsRate\" from public.\"TaxRates\"" +
          " where \"year\" = "+year+";";
      Statement statement = connection.createStatement();

      rs = statement.executeQuery(query);

      if(rs.next()){return rs.getDouble(1);}
      else return 0;

    }catch (Exception e){
      e.printStackTrace();
      return 0;
    }
  }

  public static double getRetirementFundingRate(int year) {
    ResultSet rs = null;
    try{
      String query = "select \"retirementFundingRate\" from public.\"TaxRates\"" +
          " where \"year\" = "+year+";";
      Statement statement = connection.createStatement();

      rs = statement.executeQuery(query);

      if(rs.next()){return rs.getDouble(1);}
      else return 0;

    }catch (Exception e){
      e.printStackTrace();
      return 0;
    }
  }

  public static double getPrimaryRebate(int year) {
    ResultSet rs = null;
    try{
      String query = "select \"primaryRebate\" from public.\"TaxRates\"" +
          " where \"year\" = "+year+";";
      Statement statement = connection.createStatement();

      rs = statement.executeQuery(query);

      if(rs.next()){return rs.getDouble(1);}
      else return 0;

    }catch (Exception e){
      e.printStackTrace();
      return 0;
    }
  }

  public static double getRetirementFundingMax(int year) {
    ResultSet rs = null;
    try{
      String query = "select \"retirementFundingMax\" from public.\"TaxRates\"" +
          " where \"year\" = "+year+";";
      Statement statement = connection.createStatement();

      rs = statement.executeQuery(query);

      if(rs.next()){return rs.getDouble(1);}
      else return 0;

    }catch (Exception e){
      e.printStackTrace();
      return 0;
    }
  }

  public static double[][] getTaxTables(int year) {
    ResultSet rs = null;
    try{
      String query = "select * from public.\"TaxTable\" where \"year\"="+year+"" +
          " order by \"percentage\" desc";
      Statement statement = connection.createStatement();

      rs = statement.executeQuery(query);

      int count =6;
      double[][] brackets = new double[7][3];
      while(rs.next()){
        brackets[count][0] = rs.getDouble(2);
        brackets[count][1] = rs.getDouble(3);
        brackets[count][2] = rs.getDouble(4);
        count--;
      }
      return brackets;

    }catch (Exception e){
      e.printStackTrace();
      return null;
    }
  }
}
