package navigation;

import java.util.HashMap;

import javafx.scene.Parent;
import softwaredictionary.dictionary.view.DashboardHistory;

public class ViewsProvider {

	private HashMap<String, Parent> views;
	public static final String HISTORY_SCREEN = "HOME";

	public ViewsProvider() {
		this.views = new HashMap<>();
this.views.put(ViewsProvider.HISTORY_SCREEN,new DashboardHistory() );
		
	}

	public Parent getView(String viewName) {
		return this.views.getOrDefault(viewName, null);

	}
}
