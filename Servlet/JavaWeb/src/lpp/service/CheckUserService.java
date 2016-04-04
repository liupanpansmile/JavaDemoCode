package lpp.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import lpp.dao.UserDao;
import lpp.dao.UserDaoImpl;
import lpp.entity.User;
import lpp.utlils.DBHelper;

public class CheckUserService {
	private UserDao userDao = new UserDaoImpl();
	
	public boolean checkUser(User user) {
		Connection connection = null ;
		ResultSet resultSet = null;
		try {
			connection = DBHelper.getConnection();
			connection.setAutoCommit(false);
			System.out.println("Get Connection OK");
			resultSet = userDao.get(connection, user);
			if (resultSet.next()) {
				return true;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} finally {
			if(connection != null){
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}	
			}
			
		}
		return false;
	}

}
