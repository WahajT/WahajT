package navigation;
import java.sql.SQLException;

import javafx.scene.Parent;


import javafx.scene.Scene;
import javafx.stage.Stage;
import softwaredictionary.dictionary.model.user.UserStateModel;
import softwaredictionary.dictionary.view.DashboardHistory;


public class DashBoardController   {
	private UserStateModel obj=new UserStateModel();
	
	public void getHistory() throws SQLException
	{
		obj.getHistory();
	}
	
}