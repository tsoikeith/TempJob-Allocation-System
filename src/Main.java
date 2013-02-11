import java.awt.BorderLayout;
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
	private JLabel aboutUs_text3;
	private JLabel aboutUs_text2;
	private JLabel aboutUs_text1;
	private AbstractAction aboutUs_dispose_action;
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
	private JLabel aboutUs_text4;
	private JMenuItem openFileMenuItem;
	private JMenuItem newFileMenuItem;
	private JMenu jMenu3;
	private JMenuBar jMenuBar1;
	public Hotel_Manage_Panel hotel_management_panel;

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
						cutMenuItem.setText("Hotel Management");
						cutMenuItem.addMouseListener(new MouseAdapter() {
							public void mousePressed(MouseEvent evt) {
								cutMenuItemMousePressed(evt);
							}
						});
					}
					{
						copyMenuItem = new JMenuItem();
						jMenu4.add(copyMenuItem);
						copyMenuItem.setText("Staff Management");
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
				    .addComponent(getAboutUs_text1(), GroupLayout.Alignment.LEADING, 0, 336, Short.MAX_VALUE)
				    .addComponent(getAboutUs_text2(), GroupLayout.Alignment.LEADING, 0, 336, Short.MAX_VALUE)
				    .addComponent(getAboutUs_text3(), GroupLayout.Alignment.LEADING, 0, 336, Short.MAX_VALUE)
				    .addComponent(getAboutUs_text4(), GroupLayout.Alignment.LEADING, 0, 336, Short.MAX_VALUE)
				    .addGroup(GroupLayout.Alignment.LEADING, AboutUs_DialogLayout.createSequentialGroup()
				        .addGap(0, 275, Short.MAX_VALUE)
				        .addComponent(getAboutUs_dispose(), GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap());
			AboutUs_DialogLayout.setVerticalGroup(AboutUs_DialogLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(getAboutUs_text1(), GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(getAboutUs_text2(), GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(getAboutUs_text3(), GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(getAboutUs_text4(), GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
				.addGap(59)
				.addComponent(getAboutUs_dispose(), GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
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
	
	private JLabel getAboutUs_text1() {
		if(aboutUs_text1 == null) {
			aboutUs_text1 = new JLabel();
			aboutUs_text1.setText("The Job Allocation System is designed for allocating temp-");
		}
		return aboutUs_text1;
	}
	
	private JLabel getAboutUs_text2() {
		if(aboutUs_text2 == null) {
			aboutUs_text2 = new JLabel();
			aboutUs_text2.setText("orary worker for Hotels.This software is designed and own-");
		}
		return aboutUs_text2;
	}
	
	private JLabel getAboutUs_text3() {
		if(aboutUs_text3 == null) {
			aboutUs_text3 = new JLabel();
			aboutUs_text3.setText("ed by Keith(tsoikeith1125@gmail.com) and Moon(moon-");
		}
		return aboutUs_text3;
	}
	
	private JLabel getAboutUs_text4() {
		if(aboutUs_text4 == null) {
			aboutUs_text4 = new JLabel();
			aboutUs_text4.setText("ctp@gmail.com). All rights reserved.");
		}
		return aboutUs_text4;
	}

	private void cutMenuItemMousePressed(MouseEvent evt) {
		System.out.println("cutMenuItem.mousePressed, event="+evt);
		//TODO add your code for cutMenuItem.mousePressed
		hotel_management_panel = new Hotel_Manage_Panel();
		hotel_management_panel.doLayout();
	}

}
