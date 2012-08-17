package project817;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TreeItem;

public class Target extends ViewPart {
	public static final String ID="project817.view3";

	public Target() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		
		Tree tree = new Tree(parent, SWT.BORDER);
		
		TreeItem trtmAsd = new TreeItem(tree, SWT.NONE);
		trtmAsd.setText("asd");
		
		TreeItem trtmAsd_1 = new TreeItem(tree, SWT.NONE);
		trtmAsd_1.setText("asd");
		
		TreeItem trtmAsd_2 = new TreeItem(trtmAsd_1, SWT.NONE);
		trtmAsd_2.setText("asd");
		
		TreeItem trtmAsd_3 = new TreeItem(trtmAsd_2, SWT.NONE);
		trtmAsd_3.setText("asd");
		trtmAsd_2.setExpanded(true);
		
		TreeItem trtmAsd_4 = new TreeItem(trtmAsd_1, SWT.NONE);
		trtmAsd_4.setText("asd");
		trtmAsd_1.setExpanded(true);
		// TODO Auto-generated method stub

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
