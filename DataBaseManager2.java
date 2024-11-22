package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseManager2 {
        public static void main(String []args) {
        	String Driver="com.mysql.jdbc.driver";
        	String url="jdbc:mysql://localhost:3306/test";
        	String user="root";
        	String password="root";
        	Connection con=null;
        	Statement stmt=null;
        	ResultSet rs=null;
        	/*String sqlddl="Create table student(sname varchar(50), brach varchar(30))";
        	*/
        	String sqldql="select *from student";
        	try
        	{
        		Class.forName(Driver);
        		con=DriverManager.getConnection(url,user,password);
        		stmt = con.createStatement();
				//stmt.execute(sqldql)
                rs= stmt.executeQuery(sqldql);
                while(rs.next()) {
                	String sname=rs.getString("sname");
                	String branch =rs.getString("branch");
                	System.out.println("sname"+sname+":Branch"+branch);
                }
        	}
        	catch(ClassNotFoundException ex) {
        		ex.printStackTrace();
        	}
        	catch(SQLException ex) {
        		ex.printStackTrace(); 
        	}
        	finally
        	{
        		try {
        			if(stmt!=null) {
        				stmt.close();
        				stmt=null;
        			}
        		}
        		catch(SQLException ex) {
        			ex.printStackTrace();
        		}
        		try {
        			if(con!=null) {
        				con.close();
        				con=null;
        			}
        		}
        		catch(SQLException ex){
        			ex.printStackTrace();
        		}
        }
        }
     }
