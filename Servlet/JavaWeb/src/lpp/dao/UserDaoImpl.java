package lpp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import lpp.entity.User;

public class UserDaoImpl implements UserDao {

	@Override
	public ResultSet get(Connection con, User user) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps =null ;
	
		ps =  (PreparedStatement) con.prepareStatement("SELECT * from user WHERE username=? and password=?") ;	
		ps.setString(1, user.getUsername());
		ps.setString(2, user.getPassword());
		return ps.executeQuery() ;
		
	}

}
