package com.seleniumtraining;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class Lecture4_DbConnect
{
	private static Connection con = null;
	private static Connection conn = null;

	public static void setDbConnection() throws SQLException, ClassNotFoundException, AddressException, MessagingException
	{
		try{
		Class.forName(Lecture4_TestDBConfig.driver);
		con =	DriverManager.getConnection(Lecture4_TestDBConfig.dbConnectionUrl, Lecture4_TestDBConfig.dbUserName, Lecture4_TestDBConfig.dbPassword);
		
		if(!con.isClosed())
			System.out.println("Successfully connected to SQL server");
			
	}catch(Exception e){
		System.err.println("Exception: " + e.getMessage());

		//monitoringMail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject+" - (Script failed with Error, Datamart database used for reports, connection not established)", TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);			
		}
		
		
	}
	
	public static void setMysqlDbConnection() throws SQLException, ClassNotFoundException, AddressException, MessagingException
    {
    try
    {
        
        Class.forName (Lecture4_TestDBConfig.mysqldriver).newInstance ();
        conn = DriverManager.getConnection (Lecture4_TestDBConfig.mysqlurl, Lecture4_TestDBConfig.mysqluserName, Lecture4_TestDBConfig.mysqlpassword);
        if(!conn.isClosed())
			System.out.println("Successfully connected to MySQL server");
			
	
    }
    catch (Exception e)
    {
        System.err.println ("Cannot connect to database server");
       
       // monitoringMail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject+" - (Script failed with Error, Datamart database used for reports, connection not established)", TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
    }
   

}
	public static List<String> getQuery(String query) throws SQLException{
		
		//String Query="select top 10* from ev_call";
		Statement St = con.createStatement();
		ResultSet rs = St.executeQuery(query);
		List<String> values = new ArrayList<String>();
		while(rs.next()){
		
			values.add(rs.getString(1));
			
		}
		return values;
	}
	
	public static List<String> getMysqlQuery(String query) throws SQLException{
		
		Statement St = conn.createStatement();
		ResultSet rs = St.executeQuery(query);
		List<String> values1 = new ArrayList<String>();
		while(rs.next()){
			
			values1.add(rs.getString(1));
			
		}
		return values1;
	}
	
	public static Connection getConnection()
	{
		return con;
			}
}
