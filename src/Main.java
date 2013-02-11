import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class Main extends javax.swing.JFrame {

	private JMenuItem helpMenuItem;
	private JMenu jMenu5;
	private AbstractAction aboutUs_dispose_action;
	private JTextArea aboutUs_text;
	private JButton aboutUs_dispose;
	private JDialog AboutUs_Dialog;
	private AbstractAction aboutUs_click;
	private JMenuItem jMenuItem1;
	private JMenuItem deleteMenuItem;
	private JSeparator jSeparator1;
	private JMenuItem pasteMenuItem;
	private JMenuItem copyMenuItem;
	private JMenuItem cutMenuItem;
	private JMenu jMenu4;
	private JMenuItem exitMenuItem;
	private JSeparator jSeparator2;
	private JMenuItem closeFileMenuItem;
	private JMenuItem saveAsMenuItem;
	private JMenuItem saveMenuItem;
	private JMenuItem openFileMenuItem;
	private JMenuItem newFileMenuItem;
	private JMenu jMenu3;
	private JMenuBar jMenuBar1;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Main inst = new Main();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public Main() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setSize(800, 500);
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
					jMenu3 = new JMenu();
					jMenuBar1.add(jMenu3);
					jMenu3.setText("File");
					{
						newFileMenuItem = new JMenuItem();
						jMenu3.add(newFileMenuItem);
						newFileMenuItem.setText("New");
					}
					{
						openFileMenuItem = new JMenuItem();
						jMenu3.add(openFileMenuItem);
						openFileMenuItem.setText("Open");
					}
					{
						saveMenuItem = new JMenuItem();
						jMenu3.add(saveMenuItem);
						saveMenuItem.setText("Save");
					}
					{
						saveAsMenuItem = new JMenuItem();
						jMenu3.add(saveAsMenuItem);
						saveAsMenuItem.setText("Save As ...");
					}
					{
						closeFileMenuItem = new JMenuItem();
						jMenu3.add(closeFileMenuItem);
						closeFileMenuItem.setText("Close");
					}
					{
						jSeparator2 = new JSeparator();
						jMenu3.add(jSeparator2);
					}
					{
						exitMenuItem = new JMenuItem();
						jMenu3.add(exitMenuItem);
						exitMenuItem.setText("Exit");
					}
				}
				{
					jMenu4 = new JMenu();
					jMenuBar1.add(jMenu4);
					jMenu4.setText("Edit");
					{
						cutMenuItem = new JMenuItem();
						jMenu4.add(cutMenuItem);
						cutMenuItem.setText("Cut");
					}
					{
						copyMenuItem = new JMenuItem();
						jMenu4.add(copyMenuItem);
						copyMenuItem.setText("Copy");
					}
					{
						pasteMenuItem = new JMenuItem();
						jMenu4.add(pasteMenuItem);
						pasteMenuItem.setText("Paste");
					}
					{
						jSeparator1 = new JSeparator();
						jMenu4.add(jSeparator1);
					}
					{
						deleteMenuItem = new JMenuItem();
						jMenu4.add(deleteMenuItem);
						deleteMenuItem.setText("Delete");
					}
				}
				{
					jMenu5 = new JMenu();
					jMenuBar1.add(jMenu5);
					jMenu5.setText("Help");
					{
						helpMenuItem = new JMenuItem();
						jMenu5.add(helpMenuItem);
						helpMenuItem.setText("Help");
					}
					{
						jMenuItem1 = new JMenuItem();
						jMenu5.add(jMenuItem1);
						jMenuItem1.setText("jMenuItem1");
						jMenuItem1.setAction(getAboutUs_click());
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void helpMenuItemMouseClicked(MouseEvent evt) {
		System.out.println("helpMenuItem.mouseClicked, event="+evt);
		//TODO add your code for helpMenuItem.mouseClicked
	}
	
	private AbstractAction getAboutUs_click() {
		if(aboutUs_click == null) {
			aboutUs_click = new AbstractAction("About", null) {
				public void actionPerformed(ActionEvent evt) {
					getAboutUs_Dialog().pack();
					getAboutUs_Dialog().setLocationRelativeTo(null);
					getAboutUs_Dialog().setVisible(true);
				}
			};
		}
		return aboutUs_click;
	}
	
	private JDialog getAboutUs_Dialog() {
		if(AboutUs_Dialog == null) {
			AboutUs_Dialog = new JDialog(this);
			GroupLayout AboutUs_DialogLayout = new GroupLayout((JComponent)AboutUs_Dialog.getContentPane());
			AboutUs_Dialog.getContentPane().setLayout(AboutUs_DialogLayout);
			AboutUs_Dialog.setSize(376, 236);
			AboutUs_DialogLayout.setHorizontalGroup(AboutUs_DialogLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(AboutUs_DialogLayout.createParallelGroup()
				    .addComponent(getAboutUs_text(), GroupLayout.Alignment.LEADING, 0, 336, Short.MAX_VALUE)
				    .addGroup(GroupLayout.Alignment.LEADING, AboutUs_DialogLayout.createSequentialGroup()
				        .addGap(0, 276, Short.MAX_VALUE)
				        .addComponent(getAboutUs_dispose(), GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap());
			AboutUs_DialogLayout.setVerticalGroup(AboutUs_DialogLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(getAboutUs_text(), 0, 139, Short.MAX_VALUE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, 1, GroupLayout.PREFERRED_SIZE)
				.addComponent(getAboutUs_dispose(), GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addContainerGap());
		}
		return AboutUs_Dialog;
	}
	
	private JButton getAboutUs_dispose() {
		if(aboutUs_dispose == null) {
			aboutUs_dispose = new JButton();
			aboutUs_dispose.setText("OK");
			aboutUs_dispose.setAction(getAboutUs_dispose_action());
		}
		return aboutUs_dispose;
	}
	
	private JTextArea getAboutUs_text() {
		if(aboutUs_text == null) {
			aboutUs_text = new JTextArea();
			aboutUs_text.setText("Testing");
		}
		return aboutUs_text;
	}
	
	private AbstractAction getAboutUs_dispose_action() {
		if(aboutUs_dispose_action == null) {
			aboutUs_dispose_action = new AbstractAction("OK", null) {
				public void actionPerformed(ActionEvent evt) {
					getAboutUs_Dialog().dispose();
				}
			};
		}
		return aboutUs_dispose_action;
	}

}
