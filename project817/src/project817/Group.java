package project817;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

public class Group extends ViewPart {
	public static final String ID="project817.group";
	
	private Text txtGfdjeasgcbashgfiu;

	public Group() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		txtGfdjeasgcbashgfiu = new Text(parent, SWT.BORDER);
		txtGfdjeasgcbashgfiu.setText("gfdjeasgcbashgfiu");
		// TODO Auto-generated method stub

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
