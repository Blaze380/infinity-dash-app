package com.infinity.views;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import com.infinity.database.Database;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Sun May 19 03:19:19 IDT 2024
 */

import com.infinity.database.models.User;
import com.infinity.database.repositories.UserRepository;

/**
 * @author BLAZEH
 */
public class LoginScreen extends JFrame {
	public LoginScreen() {
		initComponents();

		try {
			Image img = ImageIO.read(getClass().getResource("/images/title_logo_blue.png"));
			this.setIconImage(img);
		} catch (IOException e) {
			System.out.println("error!\n" + e);
			e.printStackTrace();
		}
		this.setVisible(true);
	}

	private void createAccountMouseClicked() {
		new RegisterScreen();
		dispose();
	}

	private void submitMouseClicked() {
		Connection connection = Database.getQuery("resources/database/application.db");
		final UserRepository userRepository = new UserRepository(connection);
		final String email = this.email.getText();
		final String password = new String(this.password.getPassword());
		var user = new User();
		user.setEmail(email);
		user.setPassword(password);
		boolean exists = userRepository.existsByNameAndPassword(user);
		if (!exists) {
			new DialogScreen("Email e/ou senha incorrectos!");
			return;
		} else {
			new DashboardHomeScreen("Niurah", ABORT);
			dispose();
			System.out.println("Naice");
		}

	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Blaze Ogl
		loginScreen = new JPanel();
		container = new JPanel();
		logoContainer = new JPanel();
		logoImg = new JPanel();
		label1 = new JLabel();
		logoText = new JPanel();
		label2 = new JLabel();
		credentialsContainer = new JPanel();
		emailContainer = new JPanel();
		label4 = new JLabel();
		label5 = new JLabel();
		email = new JTextField();
		passwordContainer = new JPanel();
		label6 = new JLabel();
		label7 = new JLabel();
		password = new JPasswordField();
		submitContainer = new JPanel();
		submit = new JButton();
		createAccountContainer = new JPanel();
		label9 = new JLabel();
		label8 = new JLabel();
		createAccount = new JButton();

		//======== this ========
		setBackground(Color.white);
		setVisible(true);
		setResizable(false);
		setPreferredSize(new Dimension(400, 550));
		setForeground(new Color(0x0f87bf));
		setTitle("Infinite Dash");
		setIconImage(new ImageIcon(getClass().getResource("/images/title_logo_blue.png")).getImage());
		var contentPane = getContentPane();
		contentPane.setLayout(null);

		//======== loginScreen ========
		{
			loginScreen.setPreferredSize(new Dimension(400, 550));
			loginScreen.setBackground(Color.white);
			loginScreen.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
			. EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border. TitledBorder. CENTER, javax
			. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .awt .Font .BOLD ,
			12 ), java. awt. Color. red) ,loginScreen. getBorder( )) ); loginScreen. addPropertyChangeListener (new java. beans
			. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er" .equals (e .
			getPropertyName () )) throw new RuntimeException( ); }} );
			loginScreen.setLayout(new CardLayout());

			//======== container ========
			{
				container.setOpaque(false);
				container.setBackground(Color.white);
				container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));

				//======== logoContainer ========
				{
					logoContainer.setOpaque(false);
					logoContainer.setLayout(new BoxLayout(logoContainer, BoxLayout.PAGE_AXIS));

					//======== logoImg ========
					{
						logoImg.setOpaque(false);
						logoImg.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0));

						//---- label1 ----
						label1.setText(" ");
						label1.setIcon(new ImageIcon(getClass().getResource("/images/logo_blue.png")));
						logoImg.add(label1);
					}
					logoContainer.add(logoImg);

					//======== logoText ========
					{
						logoText.setOpaque(false);
						logoText.setLayout(new FlowLayout());

						//---- label2 ----
						label2.setText("Iniciar Sess\u00e3o");
						label2.setForeground(new Color(0x0f87bf));
						label2.setFont(new Font("Segoe UI", Font.BOLD, 20));
						logoText.add(label2);
					}
					logoContainer.add(logoText);
				}
				container.add(logoContainer);

				//======== credentialsContainer ========
				{
					credentialsContainer.setOpaque(false);
					credentialsContainer.setLayout(new BoxLayout(credentialsContainer, BoxLayout.PAGE_AXIS));

					//======== emailContainer ========
					{
						emailContainer.setOpaque(false);
						emailContainer.setLayout(new GridBagLayout());
						((GridBagLayout)emailContainer.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
						((GridBagLayout)emailContainer.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0};
						((GridBagLayout)emailContainer.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0E-4};
						((GridBagLayout)emailContainer.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

						//---- label4 ----
						label4.setText("              ");
						label4.setFont(new Font("Segoe UI", Font.BOLD, 16));
						label4.setForeground(new Color(0x0f87bf));
						emailContainer.add(label4, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.BOTH,
							new Insets(0, 0, 0, 0), 0, 0));

						//---- label5 ----
						label5.setText("Email:");
						label5.setFont(new Font("Segoe UI", Font.BOLD, 16));
						label5.setForeground(new Color(0x0f87bf));
						emailContainer.add(label5, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.BOTH,
							new Insets(0, 0, 0, 0), 0, 0));

						//---- email ----
						email.setPreferredSize(new Dimension(270, 26));
						email.setBorder(new MatteBorder(0, 0, 3, 0, new Color(0x0f87bf)));
						email.setBackground(Color.white);
						email.setSelectionColor(new Color(0x0f87bf));
						email.setSelectedTextColor(Color.white);
						email.setForeground(new Color(0x0f87bf));
						emailContainer.add(email, new GridBagConstraints(3, 2, 12, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.BOTH,
							new Insets(0, 0, 0, 0), 0, 0));
					}
					credentialsContainer.add(emailContainer);

					//======== passwordContainer ========
					{
						passwordContainer.setOpaque(false);
						passwordContainer.setLayout(new GridBagLayout());
						((GridBagLayout)passwordContainer.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
						((GridBagLayout)passwordContainer.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0};
						((GridBagLayout)passwordContainer.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0E-4};
						((GridBagLayout)passwordContainer.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

						//---- label6 ----
						label6.setText("              ");
						label6.setFont(new Font("Segoe UI", Font.BOLD, 16));
						label6.setForeground(new Color(0x0f87bf));
						passwordContainer.add(label6, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.BOTH,
							new Insets(0, 0, 0, 0), 0, 0));

						//---- label7 ----
						label7.setText("Password:");
						label7.setFont(new Font("Segoe UI", Font.BOLD, 16));
						label7.setForeground(new Color(0x0f87bf));
						passwordContainer.add(label7, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.BOTH,
							new Insets(0, 0, 0, 0), 0, 0));

						//---- password ----
						password.setForeground(new Color(0x0f87bf));
						password.setBorder(new MatteBorder(0, 0, 3, 0, new Color(0x0f87bf)));
						password.setBackground(Color.white);
						password.setSelectionColor(new Color(0x0f87bf));
						password.setSelectedTextColor(Color.white);
						password.setPreferredSize(new Dimension(270, 26));
						passwordContainer.add(password, new GridBagConstraints(3, 2, 12, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.BOTH,
							new Insets(0, 0, 0, 0), 0, 0));
					}
					credentialsContainer.add(passwordContainer);

					//======== submitContainer ========
					{
						submitContainer.setOpaque(false);
						submitContainer.setLayout(new FlowLayout());

						//---- submit ----
						submit.setText("Entrar");
						submit.setBackground(new Color(0x0f87bf));
						submit.setForeground(Color.white);
						submit.setPreferredSize(new Dimension(130, 35));
						submit.setFont(new Font("Segoe UI", Font.BOLD, 16));
						submit.setBorder(null);
						submit.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								submitMouseClicked();
							}
						});
						submitContainer.add(submit);
					}
					credentialsContainer.add(submitContainer);
				}
				container.add(credentialsContainer);

				//======== createAccountContainer ========
				{
					createAccountContainer.setOpaque(false);
					createAccountContainer.setLayout(new GridBagLayout());
					((GridBagLayout)createAccountContainer.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
					((GridBagLayout)createAccountContainer.getLayout()).rowHeights = new int[] {0, 0, 0};
					((GridBagLayout)createAccountContainer.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
					((GridBagLayout)createAccountContainer.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

					//---- label9 ----
					label9.setText("                                ");
					label9.setFont(new Font("Segoe UI", Font.BOLD, 16));
					label9.setForeground(new Color(0x0f87bf));
					createAccountContainer.add(label9, new GridBagConstraints(5, 1, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 0, 5), 0, 0));

					//---- label8 ----
					label8.setText("N\u00e3o possui conta?");
					label8.setFont(new Font("Segoe UI", Font.PLAIN, 14));
					label8.setForeground(Color.black);
					createAccountContainer.add(label8, new GridBagConstraints(8, 1, 3, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 0, 5), 0, 0));

					//---- createAccount ----
					createAccount.setText("Criar Conta");
					createAccount.setBackground(Color.white);
					createAccount.setForeground(new Color(0x0f87bf));
					createAccount.setPreferredSize(new Dimension(90, 35));
					createAccount.setFont(new Font("Segoe UI", Font.PLAIN, 16));
					createAccount.setBorder(null);
					createAccount.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							createAccountMouseClicked();
						}
					});
					createAccountContainer.add(createAccount, new GridBagConstraints(11, 1, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 0, 5), 0, 0));
				}
				container.add(createAccountContainer);
			}
			loginScreen.add(container, "loginScreen");
		}
		contentPane.add(loginScreen);
		loginScreen.setBounds(0, 0, 398, 524);

		{
			// compute preferred size
			Dimension preferredSize = new Dimension();
			for(int i = 0; i < contentPane.getComponentCount(); i++) {
				Rectangle bounds = contentPane.getComponent(i).getBounds();
				preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
				preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
			}
			Insets insets = contentPane.getInsets();
			preferredSize.width += insets.right;
			preferredSize.height += insets.bottom;
			contentPane.setMinimumSize(preferredSize);
			contentPane.setPreferredSize(preferredSize);
		}
		pack();
		setLocationRelativeTo(null);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Blaze Ogl
	private JPanel loginScreen;
	private JPanel container;
	private JPanel logoContainer;
	private JPanel logoImg;
	private JLabel label1;
	private JPanel logoText;
	private JLabel label2;
	private JPanel credentialsContainer;
	private JPanel emailContainer;
	private JLabel label4;
	private JLabel label5;
	private JTextField email;
	private JPanel passwordContainer;
	private JLabel label6;
	private JLabel label7;
	private JPasswordField password;
	private JPanel submitContainer;
	private JButton submit;
	private JPanel createAccountContainer;
	private JLabel label9;
	private JLabel label8;
	private JButton createAccount;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
