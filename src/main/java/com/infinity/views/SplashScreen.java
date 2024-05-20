/*
 * Created by JFormDesigner on Tue May 07 00:43:47 IDT 2024
 */

package com.infinity.views;

import java.awt.*;
import javax.swing.*;
//import org.jdesktop.swingx.*;

/**
 * @author BLAZEH
 */
public class SplashScreen extends JWindow {
	public SplashScreen(Window owner) {
		super(owner);
		initComponents();
		this.setVisible(true);
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Blaze Ogl
		label1 = new JLabel();

		//======== this ========
		setForeground(new Color(0x6666ff));
		setBackground(new Color(0x33ff33));
		var contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		//---- label1 ----
		label1.setText("a");
		label1.setIcon(new ImageIcon(getClass().getResource("/images/splash.jpg")));
		label1.setMaximumSize(new Dimension(480, 144));
		label1.setMinimumSize(new Dimension(480, 144));
		label1.setPreferredSize(new Dimension(480, 260));
		label1.setBackground(new Color(0x0fa7f3));
		label1.setOpaque(true);
		label1.setForeground(Color.green);
		contentPane.add(label1);
		pack();
		setLocationRelativeTo(null);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Blaze Ogl
	private JLabel label1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
