package project817;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
//		layout.setEditorAreaVisible(false);
		IFolderLayout layout2 =layout.createFolder("d1", IPageLayout.LEFT,0.3f, layout.getEditorArea());
		layout2.addView(Navigation.ID);
		layout2.addView(Target.ID);
		layout2.addView(Group.ID);
		
		
//		IFolderLayout layout3 =layout.createFolder("d2", IPageLayout.TOP,0.6f, layout.getEditorArea());
//		layout3.addView(Change.ID);
//		layout3.addView(ECCMonitor.ID);
//		
//		IFolderLayout layout4 =layout.createFolder("d3", IPageLayout.BOTTOM,0.6f, layout.getEditorArea());
//		layout4.addView(AboutDemo.ID);
//		layout4.addView(CheckDemo.ID);
	}
}
