package lpp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MySqlConnectorTest {

	public static void main(String[] args) {

		
		// 驱动程序名
        String driver = "com.mysql.jdbc.Driver" ;
        String url = "jdbc:mysql://127.0.0.1:33060/test";

        // MySQL配置时的用户名
        String user = "root"; 

        // MySQL配置时的密码
        String password = "lpp";
        Connection conn =null ;
        try { 
         Class.forName(driver);
         conn = DriverManager.getConnection(url, user, password);
         PreparedStatement ps = conn.prepareStatement("SELECT * FROM user WHERE username=? AND password=?") ;
         ps.setString(1, "lpp");
         ps.setString(2, "lpp");
         
         ResultSet resultSet = ps.executeQuery() ;
         while(resultSet.next()){
        	 String username = resultSet.getString(1) ;
        	 String pwd= resultSet.getString(2) ;
        	 System.out.println("username:" + username + " pwd: " + pwd);
        	 
         }
        }catch(ClassNotFoundException ex){
        	System.out.println(ex.getMessage());
        }catch (Exception e) {
        	System.out.println(e.getMessage());
		}finally {
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
        
        System.out.println("OK");
	}

}
