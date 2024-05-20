package com.infinity.views;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Mon May 20 02:20:45 IDT 2024
 */

/**
 * @author BLAZEH
 */
public class DialogScreen extends JDialog {
	public DialogScreen(String text) {
		initComponents(text);
		try {
			Image img = ImageIO.read(getClass().getResource("/images/title_logo_blue.png"));
			this.setIconImage(img);
		} catch (IOException e) {
			System.out.println("error!\n" + e);
			e.printStackTrace();
		}
		setVisible(true);
	}

	private void okButtonMouseClicked() {
		this.dispose();
	}

	private void initComponents(String text) {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Blaze Ogl
		dialogPane = new JPanel();
		contentPanel = new JPanel();
		label1 = new JLabel();
		buttonBar = new JPanel();
		okButton = new JButton();

		//======== this ========
		setPreferredSize(new Dimension(390, 230));
		setForeground(new Color(0x0f87bf));
		setTitle("Infinite Dash");
		setAlwaysOnTop(true);
		setResizable(false);
		setType(Window.Type.POPUP);
		var contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== dialogPane ========
		{
			dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
			dialogPane.setBackground(Color.white);
			dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new
			javax . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax
			. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java
			. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt
			. Color .red ) ,dialogPane. getBorder () ) ); dialogPane. addPropertyChangeListener( new java. beans .
			PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "bord\u0065r" .
			equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
			dialogPane.setLayout(new BorderLayout());

			//======== contentPanel ========
			{
				contentPanel.setOpaque(false);
				contentPanel.setLayout(new FlowLayout());

				//---- label1 ----
				label1.setText(text);
				label1.setForeground(new Color(0x0f87bf));
				label1.setFont(new Font("Segoe UI", Font.BOLD, 14));
				contentPanel.add(label1);
			}
			dialogPane.add(contentPanel, BorderLayout.CENTER);

			//======== buttonBar ========
			{
				buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
				buttonBar.setOpaque(false);
				buttonBar.setBackground(new Color(0x0f87bf));
				buttonBar.setLayout(new FlowLayout());

				//---- okButton ----
				okButton.setText("OK");
				okButton.setBackground(new Color(0x0f87bf));
				okButton.setForeground(Color.white);
				okButton.setBorder(null);
				okButton.setFont(new Font("Segoe UI", Font.BOLD, 16));
				okButton.setPreferredSize(new Dimension(100, 22));
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						okButtonMouseClicked();
					}
				});
				buttonBar.add(okButton);
			}
			dialogPane.add(buttonBar, BorderLayout.SOUTH);
		}
		contentPane.add(dialogPane, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(null);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Blaze Ogl
	private JPanel dialogPane;
	private JPanel contentPanel;
	private JLabel label1;
	private JPanel buttonBar;
	private JButton okButton;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
