package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;

public class DeleteExistingListAction implements Action {

	@Override
	public void execute(Object arg) {
		DMComponent dm = (DMComponent) arg; 
		IOComponent io = IOComponent.getComponent(); 
		io.output("\nDeleting an existing list of Integer values of the system:\n"); 
		String listName = io.getInput("\nEnter name of the list: "); 
		dm.deleteList(listName); 
		
	}

}
