package com.infinity;

import com.infinity.views.SplashScreen;

import java.sql.SQLException;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.infinity.database.Database;
import com.infinity.views.LoginScreen;

/**
 * Hello worlda!
 *
 */
public class App {
    public static void main(String[] args) {
        initDatabase();
        var splash = new SplashScreen(null);
        animate(3000);
        splash.dispose();
        new LoginScreen();
    }

    static void initDatabase() {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            Database.createTables(Database.getQuery("resources/database/application.db").createStatement());
        } catch (UnsupportedLookAndFeelException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void animate(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {
        }

    }
}
