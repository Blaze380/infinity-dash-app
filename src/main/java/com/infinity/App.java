package com.infinity;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;

/**
 * Hello worlda!
 *
 */
public class App {
    public static void main(String[] args) {
        final Splash splash = new Splash("C:\\Users\\BLAZEH\\Pictures\\PicS From me\\IMG-20221114-WA0047.jpg");
        splash.setVisible(true);
        try {
            Thread.sleep(20000);
        } catch (Exception e) {
        }
        splash.dispose();
    }
}

class Splash extends JWindow {
    Splash(String imgSrc) {
        JLabel label = new JLabel(new ImageIcon(imgSrc));
        getContentPane().add(label);
        pack();
        setLocationRelativeTo(null);
        setSize(200, 200);
    }
}