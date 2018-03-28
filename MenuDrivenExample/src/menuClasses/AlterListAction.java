package menuClasses;

import dataManager.DMComponent;

public class AlterListAction implements Action {

	@Override
	public void execute(Object arg) {
		DMComponent dm = (DMComponent) arg; 
		dm.getMenuStack().push(AlterListMenu.getAlterListMenu()); 
	}
}
