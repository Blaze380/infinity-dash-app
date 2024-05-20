package com.infinity.views;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Mon May 20 14:56:21 IDT 2024
 */

/**
 * @author BLAZEH
 */
public class DashboardHomeScreen extends JFrame {
	private int userId;

	public DashboardHomeScreen(String userName, int userId) {
		this.userId = userId;
		initComponents(userName.toUpperCase());
		setVisible(true);
	}

	private void productTableMouseClicked(MouseEvent e) {
		System.out.println("madibahhhh");
	}

	private void categoryTableMouseClicked(MouseEvent e) {
		System.out.println(e.getButton());
		System.out.println("madibahhhh");
	}

	private void scrollPane1MouseClicked() {
		// TODO add your code here
	}

	private void initComponents(String name) {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Blaze Ogl
		container = new JPanel();
		headerContainer = new JPanel();
		logoContainer = new JPanel();
		label1 = new JLabel();
		hSpacer = new JPanel();
		userStatusContainer = new JPanel();
		label2 = new JLabel();
		userName = new JLabel();
		separator4 = new JSeparator();
		bodyContainer = new JPanel();
		welcomeContainer = new JPanel();
		label3 = new JLabel();
		dasboardHomeContainer = new JPanel();
		statisticsContainer = new JPanel();
		label7 = new JLabel();
		dataResumeContainer = new JPanel();
		totalProductsContainer = new JPanel();
		panel2 = new JPanel();
		label4 = new JLabel();
		separator1 = new JSeparator();
		panel1 = new JPanel();
		totalProducts = new JLabel();
		hSpacer2 = new JPanel();
		totalCategoriesContainer = new JPanel();
		panel3 = new JPanel();
		label5 = new JLabel();
		separator2 = new JSeparator();
		panel4 = new JPanel();
		totalCategories = new JLabel();
		hSpacer3 = new JPanel();
		totalUsersContainer = new JPanel();
		panel5 = new JPanel();
		label6 = new JLabel();
		separator3 = new JSeparator();
		panel6 = new JPanel();
		totalUsers = new JLabel();
		tablesContainer = new JPanel();
		hSpacer5 = new JPanel();
		productsTableContainer = new JPanel();
		scrollPane1 = new JScrollPane();
		productTable = new JTable();
		hSpacer4 = new JPanel();
		categoriesTableContainer = new JPanel();
		scrollPane2 = new JScrollPane();
		categoryTable = new JTable();
		hSpacer6 = new JPanel();

		//======== this ========
		setIconImage(new ImageIcon(getClass().getResource("/images/title_logo_blue.png")).getImage());
		setTitle("Infinite Dash");
		setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		setResizable(false);
		setPreferredSize(new Dimension(950, 620));
		var contentPane = getContentPane();
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));

		//======== container ========
		{
			container.setPreferredSize(new Dimension(950, 620));
			container.setBackground(Color.white);
			container.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing
			. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border . TitledBorder
			. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .
			awt . Font. BOLD ,12 ) ,java . awt. Color .red ) ,container. getBorder () ) )
			; container. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
			) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } )
			;
			container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));

			//======== headerContainer ========
			{
				headerContainer.setBackground(new Color(0x0f87bf));
				headerContainer.setOpaque(false);
				headerContainer.setLayout(new BoxLayout(headerContainer, BoxLayout.LINE_AXIS));

				//======== logoContainer ========
				{
					logoContainer.setOpaque(false);
					logoContainer.setLayout(new FlowLayout());

					//---- label1 ----
					label1.setIcon(new ImageIcon(getClass().getResource("/images/header_logo.png")));
					logoContainer.add(label1);
				}
				headerContainer.add(logoContainer);

				//======== hSpacer ========
				{
					hSpacer.setPreferredSize(new Dimension(500, 10));
					hSpacer.setOpaque(false);
					hSpacer.setLayout(new FlowLayout());
				}
				headerContainer.add(hSpacer);

				//======== userStatusContainer ========
				{
					userStatusContainer.setOpaque(false);
					userStatusContainer.setLayout(new FlowLayout());

					//---- label2 ----
					label2.setIcon(new ImageIcon(getClass().getResource("/images/user_placeholder.png")));
					userStatusContainer.add(label2);

					//---- userName ----
					userName.setText("Blaze");
					userName.setFont(new Font("Segoe UI", Font.BOLD, 14));
					userStatusContainer.add(userName);
				}
				headerContainer.add(userStatusContainer);
			}
			container.add(headerContainer);
			container.add(separator4);

			//======== bodyContainer ========
			{
				bodyContainer.setOpaque(false);
				bodyContainer.setPreferredSize(new Dimension(950, 0));
				bodyContainer.setLayout(new BoxLayout(bodyContainer, BoxLayout.PAGE_AXIS));

				//======== welcomeContainer ========
				{
					welcomeContainer.setOpaque(false);
					welcomeContainer.setLayout(new FlowLayout());

					//---- label3 ----
					label3.setText("SEJA BEM VINDO AO INFINITE DASH "+name+"!");
					label3.setForeground(new Color(0x0f87bf));
					label3.setFont(new Font("Segoe UI", Font.BOLD, 36));
					welcomeContainer.add(label3);
				}
				bodyContainer.add(welcomeContainer);

				//======== dasboardHomeContainer ========
				{
					dasboardHomeContainer.setOpaque(false);
					dasboardHomeContainer.setLayout(new BoxLayout(dasboardHomeContainer, BoxLayout.PAGE_AXIS));

					//======== statisticsContainer ========
					{
						statisticsContainer.setOpaque(false);
						statisticsContainer.setPreferredSize(new Dimension(197, 10));
						statisticsContainer.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 5));

						//---- label7 ----
						label7.setText("Estat\u00edstica");
						label7.setForeground(new Color(0x0f87bf));
						label7.setFont(new Font("Segoe UI", Font.BOLD, 20));
						statisticsContainer.add(label7);
					}
					dasboardHomeContainer.add(statisticsContainer);

					//======== dataResumeContainer ========
					{
						dataResumeContainer.setOpaque(false);
						dataResumeContainer.setLayout(new FlowLayout());

						//======== totalProductsContainer ========
						{
							totalProductsContainer.setBackground(new Color(0xefecfd));
							totalProductsContainer.setPreferredSize(new Dimension(150, 90));
							totalProductsContainer.setLayout(new BoxLayout(totalProductsContainer, BoxLayout.PAGE_AXIS));

							//======== panel2 ========
							{
								panel2.setOpaque(false);
								panel2.setPreferredSize(new Dimension(111, 25));
								panel2.setLayout(new FlowLayout());

								//---- label4 ----
								label4.setText("Total Produtos");
								label4.setForeground(Color.black);
								label4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
								panel2.add(label4);
							}
							totalProductsContainer.add(panel2);
							totalProductsContainer.add(separator1);

							//======== panel1 ========
							{
								panel1.setOpaque(false);
								panel1.setLayout(new FlowLayout());

								//---- totalProducts ----
								totalProducts.setText("50");
								totalProducts.setForeground(Color.black);
								totalProducts.setFont(new Font("Segoe UI", Font.BOLD, 16));
								totalProducts.setHorizontalAlignment(SwingConstants.CENTER);
								panel1.add(totalProducts);
							}
							totalProductsContainer.add(panel1);
						}
						dataResumeContainer.add(totalProductsContainer);

						//======== hSpacer2 ========
						{
							hSpacer2.setPreferredSize(new Dimension(100, 0));
							hSpacer2.setOpaque(false);
							hSpacer2.setLayout(new FlowLayout());
						}
						dataResumeContainer.add(hSpacer2);

						//======== totalCategoriesContainer ========
						{
							totalCategoriesContainer.setBackground(new Color(0xf8edeb));
							totalCategoriesContainer.setPreferredSize(new Dimension(150, 90));
							totalCategoriesContainer.setLayout(new BoxLayout(totalCategoriesContainer, BoxLayout.PAGE_AXIS));

							//======== panel3 ========
							{
								panel3.setOpaque(false);
								panel3.setPreferredSize(new Dimension(111, 25));
								panel3.setLayout(new FlowLayout());

								//---- label5 ----
								label5.setText("Total Categorias");
								label5.setForeground(Color.black);
								label5.setFont(new Font("Segoe UI", Font.PLAIN, 16));
								panel3.add(label5);
							}
							totalCategoriesContainer.add(panel3);
							totalCategoriesContainer.add(separator2);

							//======== panel4 ========
							{
								panel4.setOpaque(false);
								panel4.setLayout(new FlowLayout());

								//---- totalCategories ----
								totalCategories.setText("6");
								totalCategories.setForeground(Color.black);
								totalCategories.setFont(new Font("Segoe UI", Font.BOLD, 16));
								totalCategories.setHorizontalAlignment(SwingConstants.CENTER);
								panel4.add(totalCategories);
							}
							totalCategoriesContainer.add(panel4);
						}
						dataResumeContainer.add(totalCategoriesContainer);

						//======== hSpacer3 ========
						{
							hSpacer3.setPreferredSize(new Dimension(100, 0));
							hSpacer3.setOpaque(false);
							hSpacer3.setLayout(new FlowLayout());
						}
						dataResumeContainer.add(hSpacer3);

						//======== totalUsersContainer ========
						{
							totalUsersContainer.setBackground(new Color(0xe8f9ff));
							totalUsersContainer.setPreferredSize(new Dimension(150, 90));
							totalUsersContainer.setLayout(new BoxLayout(totalUsersContainer, BoxLayout.PAGE_AXIS));

							//======== panel5 ========
							{
								panel5.setOpaque(false);
								panel5.setPreferredSize(new Dimension(111, 25));
								panel5.setLayout(new FlowLayout());

								//---- label6 ----
								label6.setText("Total Usu\u00e1rios");
								label6.setForeground(Color.black);
								label6.setFont(new Font("Segoe UI", Font.PLAIN, 16));
								panel5.add(label6);
							}
							totalUsersContainer.add(panel5);
							totalUsersContainer.add(separator3);

							//======== panel6 ========
							{
								panel6.setOpaque(false);
								panel6.setLayout(new FlowLayout());

								//---- totalUsers ----
								totalUsers.setText("2");
								totalUsers.setForeground(Color.black);
								totalUsers.setFont(new Font("Segoe UI", Font.BOLD, 16));
								totalUsers.setHorizontalAlignment(SwingConstants.CENTER);
								panel6.add(totalUsers);
							}
							totalUsersContainer.add(panel6);
						}
						dataResumeContainer.add(totalUsersContainer);
					}
					dasboardHomeContainer.add(dataResumeContainer);

					//======== tablesContainer ========
					{
						tablesContainer.setOpaque(false);
						tablesContainer.setLayout(new BoxLayout(tablesContainer, BoxLayout.LINE_AXIS));

						//======== hSpacer5 ========
						{
							hSpacer5.setPreferredSize(new Dimension(10, 0));
							hSpacer5.setOpaque(false);
							hSpacer5.setLayout(new FlowLayout());
						}
						tablesContainer.add(hSpacer5);

						//======== productsTableContainer ========
						{
							productsTableContainer.setPreferredSize(new Dimension(800, 431));
							productsTableContainer.setLayout(new BoxLayout(productsTableContainer, BoxLayout.PAGE_AXIS));

							//======== scrollPane1 ========
							{
								scrollPane1.addMouseListener(new MouseAdapter() {
									@Override
									public void mouseClicked(MouseEvent e) {
										scrollPane1MouseClicked();
									}
								});

								//---- productTable ----
								productTable.setAutoCreateRowSorter(true);
								productTable.setShowHorizontalLines(true);
								productTable.setSelectionBackground(new Color(0x0f87bf));
								productTable.setSelectionForeground(Color.white);
								productTable.setGridColor(new Color(0x666666));
								productTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
								productTable.setModel(new DefaultTableModel(
									new Object[][] {
										{"[ ]", 1, "Supa supa", "Nike", 10, "250 MZN", "Sapatilhas"},
										{null, null, null, null, null, "blaze", null},
										{null, null, null, null, null, null, null},
									},
									new String[] {
										"Imagem", "id", "Nome", "Marca", "Quantidade", "Pre\u00e7o", "Categoria"
									}
								) {
									Class<?>[] columnTypes = new Class<?>[] {
										Object.class, Integer.class, String.class, String.class, Integer.class, String.class, String.class
									};
									boolean[] columnEditable = new boolean[] {
										false, false, false, false, false, false, false
									};
									@Override
									public Class<?> getColumnClass(int columnIndex) {
										return columnTypes[columnIndex];
									}
									@Override
									public boolean isCellEditable(int rowIndex, int columnIndex) {
										return columnEditable[columnIndex];
									}
								});
								{
									TableColumnModel cm = productTable.getColumnModel();
									cm.getColumn(0).setMinWidth(70);
									cm.getColumn(0).setMaxWidth(70);
									cm.getColumn(0).setPreferredWidth(70);
									cm.getColumn(1).setMinWidth(50);
									cm.getColumn(1).setMaxWidth(50);
									cm.getColumn(1).setPreferredWidth(50);
									cm.getColumn(2).setMinWidth(200);
									cm.getColumn(2).setMaxWidth(200);
									cm.getColumn(2).setPreferredWidth(200);
									cm.getColumn(3).setMinWidth(100);
									cm.getColumn(3).setMaxWidth(100);
									cm.getColumn(3).setPreferredWidth(100);
									cm.getColumn(4).setMinWidth(70);
									cm.getColumn(4).setMaxWidth(70);
									cm.getColumn(4).setPreferredWidth(70);
									cm.getColumn(5).setMinWidth(100);
									cm.getColumn(5).setMaxWidth(100);
									cm.getColumn(5).setPreferredWidth(100);
									cm.getColumn(6).setMinWidth(130);
									cm.getColumn(6).setMaxWidth(130);
									cm.getColumn(6).setPreferredWidth(130);
								}
								productTable.setBackground(Color.white);
								productTable.setForeground(Color.black);
								productTable.setFont(new Font("Segoe UI", Font.PLAIN, 14));
								productTable.addMouseListener(new MouseAdapter() {
									@Override
									public void mouseClicked(MouseEvent e) {
										productTableMouseClicked(e);
									}
								});
								scrollPane1.setViewportView(productTable);
							}
							productsTableContainer.add(scrollPane1);
						}
						tablesContainer.add(productsTableContainer);

						//======== hSpacer4 ========
						{
							hSpacer4.setPreferredSize(new Dimension(80, 0));
							hSpacer4.setOpaque(false);
							hSpacer4.setLayout(new FlowLayout());
						}
						tablesContainer.add(hSpacer4);

						//======== categoriesTableContainer ========
						{
							categoriesTableContainer.setPreferredSize(new Dimension(200, 431));
							categoriesTableContainer.setLayout(new BoxLayout(categoriesTableContainer, BoxLayout.PAGE_AXIS));

							//======== scrollPane2 ========
							{

								//---- categoryTable ----
								categoryTable.setModel(new DefaultTableModel(
									new Object[][] {
										{2, "Camisetas"},
										{1, "Sapatilhas"},
										{null, null},
									},
									new String[] {
										"Id", "Name"
									}
								) {
									Class<?>[] columnTypes = new Class<?>[] {
										Integer.class, String.class
									};
									boolean[] columnEditable = new boolean[] {
										false, false
									};
									@Override
									public Class<?> getColumnClass(int columnIndex) {
										return columnTypes[columnIndex];
									}
									@Override
									public boolean isCellEditable(int rowIndex, int columnIndex) {
										return columnEditable[columnIndex];
									}
								});
								{
									TableColumnModel cm = categoryTable.getColumnModel();
									cm.getColumn(0).setMinWidth(50);
									cm.getColumn(0).setMaxWidth(50);
									cm.getColumn(0).setPreferredWidth(50);
									cm.getColumn(1).setMinWidth(120);
									cm.getColumn(1).setMaxWidth(120);
									cm.getColumn(1).setPreferredWidth(120);
								}
								categoryTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
								categoryTable.setAutoCreateRowSorter(true);
								categoryTable.setPreferredSize(new Dimension(100, 60));
								categoryTable.setPreferredScrollableViewportSize(new Dimension(290, 400));
								categoryTable.setBackground(Color.white);
								categoryTable.setForeground(Color.black);
								categoryTable.setFont(new Font("Segoe UI", Font.PLAIN, 14));
								categoryTable.setShowHorizontalLines(true);
								categoryTable.setSelectionBackground(new Color(0x0f87bf));
								categoryTable.setSelectionForeground(Color.white);
								categoryTable.addMouseListener(new MouseAdapter() {
									@Override
									public void mouseClicked(MouseEvent e) {
										categoryTableMouseClicked(e);
									}
								});
								scrollPane2.setViewportView(categoryTable);
							}
							categoriesTableContainer.add(scrollPane2);
						}
						tablesContainer.add(categoriesTableContainer);

						//======== hSpacer6 ========
						{
							hSpacer6.setPreferredSize(new Dimension(10, 0));
							hSpacer6.setOpaque(false);
							hSpacer6.setLayout(new FlowLayout());
						}
						tablesContainer.add(hSpacer6);
					}
					dasboardHomeContainer.add(tablesContainer);
				}
				bodyContainer.add(dasboardHomeContainer);
			}
			container.add(bodyContainer);
		}
		contentPane.add(container);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Blaze Ogl
	private JPanel container;
	private JPanel headerContainer;
	private JPanel logoContainer;
	private JLabel label1;
	private JPanel hSpacer;
	private JPanel userStatusContainer;
	private JLabel label2;
	private JLabel userName;
	private JSeparator separator4;
	private JPanel bodyContainer;
	private JPanel welcomeContainer;
	private JLabel label3;
	private JPanel dasboardHomeContainer;
	private JPanel statisticsContainer;
	private JLabel label7;
	private JPanel dataResumeContainer;
	private JPanel totalProductsContainer;
	private JPanel panel2;
	private JLabel label4;
	private JSeparator separator1;
	private JPanel panel1;
	private JLabel totalProducts;
	private JPanel hSpacer2;
	private JPanel totalCategoriesContainer;
	private JPanel panel3;
	private JLabel label5;
	private JSeparator separator2;
	private JPanel panel4;
	private JLabel totalCategories;
	private JPanel hSpacer3;
	private JPanel totalUsersContainer;
	private JPanel panel5;
	private JLabel label6;
	private JSeparator separator3;
	private JPanel panel6;
	private JLabel totalUsers;
	private JPanel tablesContainer;
	private JPanel hSpacer5;
	private JPanel productsTableContainer;
	private JScrollPane scrollPane1;
	private JTable productTable;
	private JPanel hSpacer4;
	private JPanel categoriesTableContainer;
	private JScrollPane scrollPane2;
	private JTable categoryTable;
	private JPanel hSpacer6;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
