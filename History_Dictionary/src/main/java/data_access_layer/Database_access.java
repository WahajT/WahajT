package data_access_layer;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import softwaredictionary.dictionary.model.user.DBConnection;

public class Database_access {
private DBConnection obj=new DBConnection();

public ResultSet getHistory() throws SQLException
{
	String word="Select * from history";
	Statement Stat= obj.conn.createStatement();
	ResultSet getResults=Stat.executeQuery(word);
	return getResults;
}

}
