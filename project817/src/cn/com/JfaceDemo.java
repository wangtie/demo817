package cn.com;

import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class JfaceDemo extends Window{

	public JfaceDemo(Shell shell) {
		super(shell);
		// TODO Auto-generated constructor stub
	}
	
//	@Override
//	protected Control createContents(Composite parent) {
//		Text text=new Text(parent, SWT.NULL);
//		parent.setSize(500, 300);
//		text.setText("Hello World!");
////		text.pack();
//		return parent;
//	}
	
//	@Override
//	protected Control createContents(final Composite parent) {
//		Button button=new Button(parent, SWT.NONE);
//		button.setText("Click to me");
//		button.addSelectionListener(new SelectionAdapter() {
//			public void widgetSelected(SelectionEvent e) {				
//				InputDialog dialog=new InputDialog(parent.getShell(), 
//						"InputDialog Title", "Please input dialog message here:", 
//						"initialValue", null);
//				if(dialog.open()==Window.OK){
//					System.out.println(dialog.getValue());
//				}
//			}
//		});
//		return parent;
//	}
	
	@Override
	protected Control createContents(Composite parent) {
		HelloAction action=new HelloAction(parent.getShell());
		ActionContributionItem item=new ActionContributionItem(action);
		item.fill(parent);
		return parent;
	}
	
	@Override
	protected void configureShell(Shell shell) {
		shell.setText("µÚÒ»¸öjface");
		FillLayout layout=new FillLayout();
		shell.setLayout(layout);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JfaceDemo demo=new JfaceDemo(null);
		demo.setBlockOnOpen(true);
		demo.setShellStyle(SWT.DIALOG_TRIM);
		demo.open();
		Display.getCurrent().dispose();

	}

}
