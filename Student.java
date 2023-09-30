package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Student
{
	public void createdatabase() {

	try {
		String url="jdbc:mysql://localhost:3306";
		String username="root";
		String password="Your sql password";
		
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection conn = DriverManager.getConnection(url,username,password);
		
		//create a statement
		Statement st =conn.createStatement();
		
		String query ="create database codingwalla";
		
		//Execute statement
		
        st.execute(query);
		
		System.out.println("Database Created Sucessfully");
		
		//connection close
		
		conn.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	}
	public void createtable(){
		try {
			String url="jdbc:mysql://localhost:3306/codingwalla";
			String username="root";
			String password="Your sql password";
			
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection(url,username,password);
			
			//create a statement
			Statement st =conn.createStatement();
			
			String query ="create table student(SID int(3), SNAME varchar(200), SEMAIL varchar(100))";
			
			//Execute statement
			
	        st.execute(query);
			
			System.out.println("Table Created Sucessfully");
			
			//connection close
			
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public void createdata() {
		try {
			String url="jdbc:mysql://localhost:3306/";
			String Db="codingwalla";
			String username="root";
			String password="Your sql password";
			
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection(url+Db,username,password);
			String query="INSERT into student (SID, SNAME, SEMAIL) VALUES(?,?,?)";
			
			//create a statement
			PreparedStatement st =conn.prepareStatement(query);
		    st.setInt(1,5);
		    st.setString(2, "irin");
		    st.setString(3, "irin@gamail.com");
		    
			
			//Execute statement
			
	       st.executeUpdate();
			
			System.out.println("data inserted Sucessfully");
			//connection close
			
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

