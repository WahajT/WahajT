package softwaredictionary.dictionary.model.user;

import java.sql.ResultSet;
import java.sql.SQLException;

import data_access_layer.Database_access;

public class UserStateModel {
private Database_access obj=new Database_access(); 

public void getHistory() throws SQLException
{  
	ResultSet result;
	String date;
	String word;

	result=obj.getHistory();
	date=result.getString(1);
	word=result.getString(2);
	System.out.println(date);
	System.out.println(word);
}
	
}
