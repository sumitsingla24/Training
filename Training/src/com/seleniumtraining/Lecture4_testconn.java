package com.seleniumtraining;

import java.sql.SQLException;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class Lecture4_testconn {

	public static void main(String[] args) throws AddressException, ClassNotFoundException, SQLException, MessagingException {

		Lecture4_DbConnect.setMysqlDbConnection();
		List<String> query = Lecture4_DbConnect.getMysqlQuery("select emp_id from employee");
		
		for (int i=0; i<query.size(); i++){
			System.out.println(query.get(i));
		}
		
	}

}
