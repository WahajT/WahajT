package SoftwareConstruction.History_Dictionary;

import navigation.DashBoardController;

import navigation.FlowController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
private FlowController flowController;
  
	@Override
		public void start(Stage stage) {
	    	this.flowController= FlowController.getInstance();
			stage.setTitle("Dictionary");
			this.flowController.setStage(stage);
			this.flowController.startApplication();		
		}
    	
    

    public static void main(String[] args) {
        launch();
    }

}