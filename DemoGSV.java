package com.gsv;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DemoGSV extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoGSV frame = new DemoGSV();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DemoGSV() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table_1 = new JTable();
		table_1.setBounds(209, 19, 0, 0);
		contentPane.add(table_1);
		
		table = new JTable();
		table.setBounds(214, 19, 0, 0);
		contentPane.add(table);
		
		table_2 = new JTable();
		table_2.setBounds(219, 19, 0, 0);
		table_2.setCellSelectionEnabled(true);
		contentPane.add(table_2);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(224, 10, 7, 19);
		contentPane.add(textPane);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(236, 18, 0, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(241, 18, 0, 2);
		contentPane.add(separator_1);
		
		JTextPane txtpnUsername = new JTextPane();
		txtpnUsername.setText("Username");
		txtpnUsername.setBounds(84, 39, 60, 19);
		contentPane.add(txtpnUsername);
		
		textField = new JTextField();
		textField.setBounds(173, 39, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setText("Password");
		txtpnPassword.setBounds(83, 68, 73, 19);
		contentPane.add(txtpnPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(173, 68, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(173, 123, 85, 21);
		contentPane.add(btnNewButton);
	}
}
