package softwaredictionary.dictionary.model.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	String dbURL = "jdbc:mysql://localhost:3306/History";
	String userName = "root";
	String passWord = "";

	public Connection conn = null;
	{
		try {

			conn = DriverManager.getConnection(dbURL, userName, passWord);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
