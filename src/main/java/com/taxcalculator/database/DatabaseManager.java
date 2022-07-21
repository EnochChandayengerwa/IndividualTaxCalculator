package com.taxcalculator.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseManager {

  public static Connection getConnection(){
    Connection c = null;
    try {
      c = DriverManager
          .getConnection("jdbc:postgresql://localhost:5432/TaxDomain",
              "postgres", "8808");
    } catch (Exception e) {
      e.printStackTrace();
      System.err.println(e.getClass().getName()+": "+e.getMessage());
      System.exit(0);
    }
//    System.out.println("Opened database successfully");
    return c;
  }
}
