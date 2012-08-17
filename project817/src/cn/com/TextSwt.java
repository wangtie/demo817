package cn.com;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class TextSwt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display=new Display();
		Shell shell=new Shell(display);
		shell.setText("ÎÄ±¾Ê¾Àý");
		
		Text text1=new Text(shell,SWT.NONE|SWT.MULTI); 
		text1.setText("dandan");
		text1.setBounds(0, 0, 100, 50);
		
		Text text2=new Text(shell,SWT.LEFT|SWT.BORDER); 
		text2.setText("dandan");
		text2.setBounds(0, 60, 100, 50);
		
		Text text3=new Text(shell,SWT.RIGHT|SWT.WRAP); 
		text3.setText("dandan");
		text3.setBounds(0, 120, 100, 50);
		
		Text text4=new Text(shell,SWT.CENTER|SWT.V_SCROLL); 
		text4.setText("dandan");
		text4.setBounds(0, 180, 100, 50);
		
		Text text5=new Text(shell,SWT.PASSWORD|SWT.H_SCROLL); 
		text5.setText("dandan");
		text5.setBounds(0, 240, 100, 50);
		
		shell.open();
		while(!display.isDisposed()){
			if(!display.readAndDispatch()){
				display.sleep();
			}
		}
		display.dispose();

	}

}
