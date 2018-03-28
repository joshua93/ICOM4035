package menuClasses;

import java.util.ArrayList;

public class AlterListMenu extends Menu {
	private static AlterListMenu OLM = new AlterListMenu(); 
	private AlterListMenu() { 
		super(); 
		String title; 
		ArrayList<Option> options = new ArrayList<Option>();  
		title = "Operate on Lists"; 
		options.add(new Option("Add a new value to a list", new AddToListAction())); 
		options.add(new Option("Delete a position from a list", new DeleteFromListAction())); 
		options.add(new Option("Show content of a list", new ShowListAction())); 
		options.add(Option.EXIT); 

		super.InitializeMenu(title, options); 

	}
	
	public static AlterListMenu getAlterListMenu() { 
		return OLM; 
	}
}
