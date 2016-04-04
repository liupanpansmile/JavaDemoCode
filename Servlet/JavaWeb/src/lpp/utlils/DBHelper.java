package lpp.utlils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {
	public static final String url = "jdbc:mysql://127.0.0.1:33060/test";
	public static final String name = "com.mysql.jdbc.Driver";
	public static final String user = "root";
	public static final String password = "lpp";


	static {
		try {
			Class.forName(name);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(url, user, password);// 获取连接
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
