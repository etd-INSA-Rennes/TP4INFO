/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robotG.resource.robot.ui;

/**
 * The root preference page
 */
public class RobotPreferencePage extends org.eclipse.jface.preference.PreferencePage implements org.eclipse.ui.IWorkbenchPreferencePage {
	
	public void init(org.eclipse.ui.IWorkbench workbench) {
		setPreferenceStore(robotG.resource.robot.ui.RobotUIPlugin.getDefault().getPreferenceStore());
		setDescription("Robot Text Editor Preferences");
	}
	
	@Override	
	protected org.eclipse.swt.widgets.Control createContents(org.eclipse.swt.widgets.Composite parent) {
		org.eclipse.swt.widgets.Composite settingComposite = new org.eclipse.swt.widgets.Composite(parent, org.eclipse.swt.SWT.NONE);
		org.eclipse.swt.layout.GridLayout layout = new org.eclipse.swt.layout.GridLayout();
		org.eclipse.swt.layout.GridData gd;
		layout.numColumns= 1;
		layout.marginHeight= 0;
		layout.marginWidth= 0;
		gd = new org.eclipse.swt.layout.GridData(org.eclipse.swt.layout.GridData.BEGINNING);
		settingComposite.setLayout(layout);
		settingComposite.setLayoutData(gd);
		org.eclipse.swt.widgets.Link link = new org.eclipse.swt.widgets.Link(settingComposite, org.eclipse.swt.SWT.NONE);
		link.setText("Go to <A href=\"http://www.emftext.org\">www.emftext.org</A> for more information.");
		link.setSize(140, 40);
		link.addSelectionListener(new org.eclipse.swt.events.SelectionListener() {
			public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
				if (e.text.startsWith("http")) org.eclipse.swt.program.Program.launch(e.text);
			}
			public void widgetDefaultSelected(org.eclipse.swt.events.SelectionEvent e) {}
		});
		return settingComposite;
	}
	
}
