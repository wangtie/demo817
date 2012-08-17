package cn.com;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class HelloAction extends Action {
	private Shell shell;
	
	public HelloAction(Shell shell){
		super("&Click me!",Action.AS_CHECK_BOX);
		this.shell=shell;
	}
	
	@Override
	public void run() {
		MessageDialog.openInformation(shell, "information", "hello action");
	}

}
