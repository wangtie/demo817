package cn.com;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ButtonSwt{
	public static void main(String[] args) {
		Display display=new Display();
		Shell shell=new Shell(display);
		shell.setText("°´Å¥Ê¾Àý");
//		GridLayout grid=new GridLayout();
		shell.setLayout(null);
		
		Button but1=new Button(shell, SWT.PUSH|SWT.LEFT);
		but1.setText("PUSH");
		but1.setBounds(0, 0, 70, 20);
		
		Button but2=new Button(shell, SWT.RADIO|SWT.CENTER);
		but2.setText("RADIO");
		but2.setBounds(0, 30, 70, 20);
		
		Button but6=new Button(shell, SWT.RADIO|SWT.CENTER);
		but6.setText("RADIO");
		but6.setBounds(80, 30, 70, 20);
		
		Button but3=new Button(shell, SWT.CHECK|SWT.RIGHT);
		but3.setText("CHECK");
		but3.setBounds(0, 60, 70, 20);
		
		Button but4=new Button(shell, SWT.ARROW|SWT.BORDER);
		but4.setText("ARROW");
		but4.setBounds(0, 90, 70, 20);
		
		Button but5=new Button(shell, SWT.NONE|SWT.FLAT);
		but5.setText("NONE");
		but5.setBounds(0, 120, 70, 20);
		
		shell.open();
		shell.pack();
		shell.setLocation(Display.getCurrent().getClientArea().width/2-shell.getShell().getSize().x/2,
				Display.getCurrent().getClientArea().height/2-shell.getShell().getSize().y/2);
		while(!display.isDisposed()){
			if(!display.readAndDispatch()){
				display.sleep();
			}
		}
		display.dispose();
		
	}

}
