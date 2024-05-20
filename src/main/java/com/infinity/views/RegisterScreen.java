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
public class RegisterScreen extends JFrame {
	final private UserRepository userRepository;

	public RegisterScreen() {
		initComponents();
		Connection connection = Database.getQuery("resources/database/application.db");
		userRepository = new UserRepository(connection);

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

		var user = new User(name.getText(), email.getText(), new String(password.getPassword()), phoneNumber.getText());
		System.out.println(user.getPassword());
		if (user.getName() == null || user.getName().equals("") || user.getEmail() == null || user.getEmail().equals("")
				|| user.getPassword() == null || user.getPassword().equals("")
				|| user.getPhoneNumber() == null || user.getPhoneNumber().equals("")
				|| new String(confirmPassword.getPassword()) == null
				|| new String(confirmPassword.getPassword()).equals("")) {
			new DialogScreen("Preencha os Campos!");
			return;
		}
		if (!new String(confirmPassword.getPassword()).equals(user.getPassword())) {
			new DialogScreen("A Senha não combina com a confirmação!");
			return;
		}

		userRepository.saveUser(user);
		new DashboardHomeScreen("Niurah", ABORT);
		dispose();
		System.out.println("Saved!");

	}

	private void loginMouseClicked() {
		new LoginScreen();
		dispose();
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
		data = new JPanel();
		label4 = new JLabel();
		label6 = new JLabel();
		nameContainer = new JPanel();
		label5 = new JLabel();
		name = new JTextField();
		phoneContainer = new JPanel();
		label10 = new JLabel();
		phoneNumber = new JTextField();
		label7 = new JLabel();
		emailContainer = new JPanel();
		label11 = new JLabel();
		email = new JTextField();
		passwordContainer = new JPanel();
		label12 = new JLabel();
		password = new JPasswordField();
		confirmPasswordContainer = new JPanel();
		label13 = new JLabel();
		confirmPassword = new JPasswordField();
		submitContainer = new JPanel();
		createAccount = new JButton();
		createAccountContainer = new JPanel();
		label9 = new JLabel();
		label8 = new JLabel();
		login = new JButton();

		//======== this ========
		setBackground(Color.white);
		setVisible(true);
		setResizable(false);
		setPreferredSize(new Dimension(400, 550));
		setForeground(new Color(0x0f87bf));
		setIconImage(new ImageIcon(getClass().getResource("/images/title_logo_blue.png")).getImage());
		setTitle("Infinite dash");
		var contentPane = getContentPane();
		contentPane.setLayout(null);

		//======== loginScreen ========
		{
			loginScreen.setPreferredSize(new Dimension(400, 550));
			loginScreen.setBackground(Color.white);
			loginScreen.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
			EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax. swing
			. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ),
			java. awt. Color. red) ,loginScreen. getBorder( )) ); loginScreen. addPropertyChangeListener (new java. beans. PropertyChangeListener( )
			{ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName () ))
			throw new RuntimeException( ); }} );
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
						label2.setText("Criar Conta");
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

					//======== data ========
					{
						data.setOpaque(false);
						data.setLayout(new GridBagLayout());
						((GridBagLayout)data.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
						((GridBagLayout)data.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0};
						((GridBagLayout)data.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0E-4};
						((GridBagLayout)data.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

						//---- label4 ----
						label4.setText("        ");
						label4.setFont(new Font("Segoe UI", Font.BOLD, 16));
						label4.setForeground(new Color(0x0f87bf));
						data.add(label4, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.BOTH,
							new Insets(0, 0, 0, 0), 0, 0));

						//---- label6 ----
						label6.setText("        ");
						label6.setFont(new Font("Segoe UI", Font.BOLD, 16));
						label6.setForeground(new Color(0x0f87bf));
						data.add(label6, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.BOTH,
							new Insets(0, 0, 0, 0), 0, 0));

						//======== nameContainer ========
						{
							nameContainer.setOpaque(false);
							nameContainer.setLayout(new FlowLayout());

							//---- label5 ----
							label5.setText("Nome:");
							label5.setFont(new Font("Segoe UI", Font.BOLD, 16));
							label5.setForeground(new Color(0x0f87bf));
							nameContainer.add(label5);

							//---- name ----
							name.setPreferredSize(new Dimension(80, 26));
							name.setBorder(new MatteBorder(0, 0, 3, 0, new Color(0x0f87bf)));
							name.setBackground(Color.white);
							name.setSelectionColor(new Color(0x0f87bf));
							name.setSelectedTextColor(Color.white);
							name.setForeground(new Color(0x0f87bf));
							nameContainer.add(name);
						}
						data.add(nameContainer, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.BOTH,
							new Insets(0, 0, 0, 0), 0, 0));

						//======== phoneContainer ========
						{
							phoneContainer.setOpaque(false);
							phoneContainer.setLayout(new FlowLayout());

							//---- label10 ----
							label10.setText("Celular:");
							label10.setFont(new Font("Segoe UI", Font.BOLD, 16));
							label10.setForeground(new Color(0x0f87bf));
							phoneContainer.add(label10);

							//---- phoneNumber ----
							phoneNumber.setPreferredSize(new Dimension(100, 26));
							phoneNumber.setBorder(new MatteBorder(0, 0, 3, 0, new Color(0x0f87bf)));
							phoneNumber.setBackground(Color.white);
							phoneNumber.setSelectionColor(new Color(0x0f87bf));
							phoneNumber.setSelectedTextColor(Color.white);
							phoneNumber.setForeground(new Color(0x0f87bf));
							phoneContainer.add(phoneNumber);
						}
						data.add(phoneContainer, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.BOTH,
							new Insets(0, 0, 0, 0), 0, 0));

						//---- label7 ----
						label7.setText("        ");
						label7.setFont(new Font("Segoe UI", Font.BOLD, 16));
						label7.setForeground(new Color(0x0f87bf));
						data.add(label7, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.BOTH,
							new Insets(0, 0, 0, 0), 0, 0));

						//======== emailContainer ========
						{
							emailContainer.setOpaque(false);
							emailContainer.setLayout(new FlowLayout());

							//---- label11 ----
							label11.setText("Email:");
							label11.setFont(new Font("Segoe UI", Font.BOLD, 16));
							label11.setForeground(new Color(0x0f87bf));
							emailContainer.add(label11);

							//---- email ----
							email.setPreferredSize(new Dimension(200, 26));
							email.setBorder(new MatteBorder(0, 0, 3, 0, new Color(0x0f87bf)));
							email.setBackground(Color.white);
							email.setSelectionColor(new Color(0x0f87bf));
							email.setSelectedTextColor(Color.white);
							email.setForeground(new Color(0x0f87bf));
							emailContainer.add(email);
						}
						data.add(emailContainer, new GridBagConstraints(2, 2, 2, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.BOTH,
							new Insets(0, 0, 0, 0), 0, 0));

						//======== passwordContainer ========
						{
							passwordContainer.setOpaque(false);
							passwordContainer.setLayout(new FlowLayout());

							//---- label12 ----
							label12.setText("Senha:");
							label12.setFont(new Font("Segoe UI", Font.BOLD, 16));
							label12.setForeground(new Color(0x0f87bf));
							passwordContainer.add(label12);

							//---- password ----
							password.setForeground(new Color(0x0f87bf));
							password.setBorder(new MatteBorder(0, 0, 3, 0, new Color(0x0f87bf)));
							password.setBackground(Color.white);
							password.setSelectionColor(new Color(0x0f87bf));
							password.setSelectedTextColor(Color.white);
							password.setPreferredSize(new Dimension(80, 26));
							passwordContainer.add(password);
						}
						data.add(passwordContainer, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.BOTH,
							new Insets(0, 0, 0, 0), 0, 0));

						//======== confirmPasswordContainer ========
						{
							confirmPasswordContainer.setOpaque(false);
							confirmPasswordContainer.setLayout(new FlowLayout(FlowLayout.LEFT));

							//---- label13 ----
							label13.setText("ConfirmSenha:");
							label13.setFont(new Font("Segoe UI", Font.BOLD, 16));
							label13.setForeground(new Color(0x0f87bf));
							confirmPasswordContainer.add(label13);

							//---- confirmPassword ----
							confirmPassword.setForeground(new Color(0x0f87bf));
							confirmPassword.setBorder(new MatteBorder(0, 0, 3, 0, new Color(0x0f87bf)));
							confirmPassword.setBackground(Color.white);
							confirmPassword.setSelectionColor(new Color(0x0f87bf));
							confirmPassword.setSelectedTextColor(Color.white);
							confirmPassword.setPreferredSize(new Dimension(80, 26));
							confirmPasswordContainer.add(confirmPassword);
						}
						data.add(confirmPasswordContainer, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.BOTH,
							new Insets(0, 0, 0, 0), 0, 0));
					}
					credentialsContainer.add(data);

					//======== submitContainer ========
					{
						submitContainer.setOpaque(false);
						submitContainer.setLayout(new FlowLayout());

						//---- createAccount ----
						createAccount.setText("Criar Conta");
						createAccount.setBackground(new Color(0x0f87bf));
						createAccount.setForeground(Color.white);
						createAccount.setPreferredSize(new Dimension(130, 35));
						createAccount.setFont(new Font("Segoe UI", Font.BOLD, 16));
						createAccount.setBorder(null);
						createAccount.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								createAccountMouseClicked();
							}
						});
						submitContainer.add(createAccount);
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
					label8.setText("Tem conta?");
					label8.setFont(new Font("Segoe UI", Font.PLAIN, 14));
					label8.setForeground(Color.black);
					createAccountContainer.add(label8, new GridBagConstraints(8, 1, 3, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 0, 5), 0, 0));

					//---- login ----
					login.setText("Entrar");
					login.setBackground(Color.white);
					login.setForeground(new Color(0x0f87bf));
					login.setPreferredSize(new Dimension(50, 35));
					login.setFont(new Font("Segoe UI", Font.PLAIN, 16));
					login.setBorder(null);
					login.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							loginMouseClicked();
						}
					});
					createAccountContainer.add(login, new GridBagConstraints(11, 1, 1, 1, 0.0, 0.0,
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
	private JPanel data;
	private JLabel label4;
	private JLabel label6;
	private JPanel nameContainer;
	private JLabel label5;
	private JTextField name;
	private JPanel phoneContainer;
	private JLabel label10;
	private JTextField phoneNumber;
	private JLabel label7;
	private JPanel emailContainer;
	private JLabel label11;
	private JTextField email;
	private JPanel passwordContainer;
	private JLabel label12;
	private JPasswordField password;
	private JPanel confirmPasswordContainer;
	private JLabel label13;
	private JPasswordField confirmPassword;
	private JPanel submitContainer;
	private JButton createAccount;
	private JPanel createAccountContainer;
	private JLabel label9;
	private JLabel label8;
	private JButton login;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
