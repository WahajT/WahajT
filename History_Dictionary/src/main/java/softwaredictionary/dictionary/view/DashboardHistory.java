package softwaredictionary.dictionary.view;



import navigation.DashBoardController;

import java.sql.SQLException;

//import JavaScreen.Nav;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
//import softwaredictionary.dictionary.model.user.UserStateModel;
public class DashboardHistory extends Pane{
	private DashBoardController obj= new DashBoardController();
	private Label UserLogin;
	private Button loginButton;
	private TextField username;
	private TableView table1;
	private TableColumn timeCol;
	private TableColumn  searchCol;
	
	private DashBoardController controller;
	
	
	public DashboardHistory()
	{
		initialize();
	}
	
	private void initialize() {
		
		this.table1 = new TableView();
		table1.setEditable(true);
		
		this.timeCol = new TableColumn("Time");
		this.searchCol = new TableColumn("Search");
		
		table1.getColumns().addAll(this.timeCol,this.searchCol);
		this.table1.relocate(200, 100);
		this.getChildren().add(this.table1);
		try {
			obj.getHistory();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

		
	
	
}
