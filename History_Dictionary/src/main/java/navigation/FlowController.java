package navigation;

import java.util.Stack;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


//import org.graalvm.compiler.phases.common.NodeCounterPhase.Stage;

public class FlowController {

	private Stage mainWindow;
	private final Stack<Parent> flowHistory;
	private Scene mainScene;
	private final ViewsProvider viewsProvider;
	
	private static final String NO_VIEW_ERROR = "No such view exists!";
	
	private static final FlowController self = new FlowController();
	
	public static FlowController getInstance()
	{
		return self;
	}
	
	
	
	private FlowController()
	{
		this.flowHistory = new Stack<>();	
		this.viewsProvider = new ViewsProvider();
	}
	
	public void navigateTo(String viewName)
	{
		Parent view = this.viewsProvider.getView(viewName);
		if(view == null)
		{	
			throw new RuntimeException(FlowController.NO_VIEW_ERROR);
		}
		this.flowHistory.add(view);
		this.mainScene.setRoot(view);
	}
	
	
	public void goBack()
	{
		this.flowHistory.pop();
		this.mainScene.setRoot(this.flowHistory.peek());
	}
	
	public void startApplication()
	{
		if (this.mainWindow == null)
		{	
			throw new RuntimeException("No window set");
		}
		
		Parent root = this.viewsProvider.getView(ViewsProvider.HISTORY_SCREEN);

		if (root == null)
		{	
			throw new RuntimeException(FlowController.NO_VIEW_ERROR);
		}

		
		this.flowHistory.add(root);
		
		this.mainScene = new Scene(root,600,400);
		this.mainWindow.setScene(this.mainScene);
		this.mainWindow.show();
	}
	
	public void setStage(Stage stage)
	{
		this.mainWindow = stage;
	}
}
