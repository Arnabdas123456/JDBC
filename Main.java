package mypackage;
import java.sql.*;
public class Main {

	public static void main(String[] args) {
		// Load The Driver
		//Connection
		Student s=new Student();
		s.createdatabase();
                s.createtable();
		s.createdata();
		
		

	}

}
