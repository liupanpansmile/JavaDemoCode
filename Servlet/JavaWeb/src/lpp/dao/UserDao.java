package lpp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


import lpp.entity.User;

public interface UserDao {
	public ResultSet get(Connection con,User user) throws SQLException;
}
