package person;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBcollection {
      public static Connection getConnection()
      {
    	  String driver="com.mysql.jdbc.driver";
    	  String url="jdbc:mysql://localhost:3306/test";
      	String user="root";
      	String password="root";
      	Connection con=null;
      	
      	try {
      		Class.forName(driver);
      		con=DriverManager.getConnection(url,user,password);
      		
      	}
      }
}
