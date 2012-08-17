package cn.com;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class ComboSwt {
	private static Label label;
	
	private static Combo combo;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display=new Display();
		Shell shell=new Shell(display);
		shell.setText("下拉框示例");
		
		combo=new Combo(shell, SWT.NONE);
		combo.setBounds(0, 0, 200, 50);
		
		label=new Label(shell, SWT.WRAP);
		label.setBounds(0, 55, 100, 50);
		
		Button but1=new Button(shell, SWT.PUSH);
		but1.setBounds(0, 110, 50, 30);
		but1.setText("设值");
		but1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				combo.removeAll();
				for(int i=0;i<=3;i++){
					combo.add("第"+i+"项");
				}
				combo.select(0);
			}
		});
		Button but2=new Button(shell, SWT.PUSH);
		but2.setText("取值");
		but2.setBounds(60, 110, 50, 30);
		but2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				label.setText("你选择的是"+combo.getText());
			}
		});
		shell.open();
		shell.pack();
		while(!display.isDisposed()){
			if(!display.readAndDispatch()){
				display.sleep();
			}
		}
		display.dispose();

	}

}
