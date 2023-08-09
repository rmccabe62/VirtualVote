package com.virtualvote;

import java.awt.EventQueue;
import java.io.*;
import java.net.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterHere extends JFrame {

	private JPanel contentPane;
	private JTextField tfFirstName;
	private JTextField tfLastName;
	private JTextField tfStreetAddr;
	private JTextField tfCity;
	private JTextField tfZipCode;
	private JTextField tfEmailAddr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterHere frame = new RegisterHere();
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
	public RegisterHere() {
		setBackground(new Color(240, 240, 240));
		setFont(new Font("Arial Black", Font.BOLD, 12));
		setForeground(new Color(0, 0, 0));
		setTitle("Register Here");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 507);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFirstName.setForeground(new Color(255, 255, 255));
		lblFirstName.setBounds(10, 88, 85, 13);
		contentPane.add(lblFirstName);
		
		JLabel lblRegVote = new JLabel("Register To Vote");
		lblRegVote.setBounds(293, 10, 200, 29);
		lblRegVote.setForeground(new Color(255, 0, 0));
		lblRegVote.setBackground(new Color(255, 0, 0));
		lblRegVote.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblRegVote);
		
		tfFirstName = new JTextField();
		tfFirstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfFirstName.setBounds(105, 87, 153, 19);
		contentPane.add(tfFirstName);
		tfFirstName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setForeground(new Color(255, 255, 255));
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLastName.setBounds(373, 90, 97, 13);
		contentPane.add(lblLastName);
		
		tfLastName = new JTextField();
		tfLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfLastName.setBounds(464, 87, 218, 19);
		contentPane.add(tfLastName);
		tfLastName.setColumns(10);
		
		JLabel lblStreetAddr = new JLabel("Street Address:");
		lblStreetAddr.setForeground(new Color(255, 255, 255));
		lblStreetAddr.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStreetAddr.setBounds(10, 167, 120, 13);
		contentPane.add(lblStreetAddr);
		
		tfStreetAddr = new JTextField();
		tfStreetAddr.setBounds(126, 166, 456, 19);
		contentPane.add(tfStreetAddr);
		tfStreetAddr.setColumns(10);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setForeground(new Color(255, 255, 255));
		lblCity.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCity.setBounds(10, 250, 39, 13);
		contentPane.add(lblCity);
		
		tfCity = new JTextField();
		tfCity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfCity.setBounds(50, 249, 147, 19);
		contentPane.add(tfCity);
		tfCity.setColumns(10);
		
		JLabel lblState = new JLabel("State:");
		lblState.setForeground(new Color(255, 255, 255));
		lblState.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblState.setBounds(235, 250, 45, 13);
		contentPane.add(lblState);
		// create a string of all states in the US
		String[] stateStrings = { "Selection","Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa",
		                         "Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada",
		                         "New Hampshire","New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon",
		                         "Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"};	
		// set up the state combo box for user selection
		JComboBox<String> cbState = new JComboBox<>(stateStrings);
		
		cbState.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbState.setBounds(293, 246, 127, 21);
		contentPane.add(cbState);
		
		JLabel lblZipCode = new JLabel("Zip Code:");
		lblZipCode.setForeground(new Color(255, 255, 255));
		lblZipCode.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblZipCode.setBounds(448, 252, 73, 13);
		contentPane.add(lblZipCode);
		
		tfZipCode = new JTextField();
		tfZipCode.setBounds(521, 251, 114, 19);
		contentPane.add(tfZipCode);
		tfZipCode.setColumns(10);
		
		JLabel lblEmailAddr = new JLabel("Email Address:");
		lblEmailAddr.setForeground(new Color(255, 255, 255));
		lblEmailAddr.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmailAddr.setBounds(10, 314, 106, 13);
		contentPane.add(lblEmailAddr);
		
		tfEmailAddr = new JTextField();
		tfEmailAddr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfEmailAddr.setBounds(116, 313, 405, 19);
		contentPane.add(tfEmailAddr);
		tfEmailAddr.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfFirstName.setText("");
				tfLastName.setText("");
				tfStreetAddr.setText("");
				tfCity.setText("");
				cbState.setSelectedItem("Selection");
				tfZipCode.setText("");
				tfEmailAddr.setText(getName());
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setBounds(374, 378, 96, 29);
		contentPane.add(btnClear);
		tfFirstName.setText("");
		tfLastName.setText("");
		tfStreetAddr.setText("");
		tfCity.setText("");
		cbState.setSelectedItem("Selection");
		tfZipCode.setText("");
		tfEmailAddr.setText("");
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tfFirstName.getText().isEmpty()&& tfLastName.getText().isEmpty() && tfStreetAddr.getText().isEmpty() 
						&& cbState.getSelectedIndex()== -1 && tfZipCode.getText().isEmpty() && tfEmailAddr.getText().isEmpty()) {
					JOptionPane.showMessageDialog(contentPane, "Please fill in all fields");
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "You are now registered");
					  
						try {
							Desktop.getDesktop().browse(new URL("http://localhost:8080/VirtualVote/index.html").toURI());
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					
					}
				
						
			}});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegister.setBounds(235, 378, 97, 29);
		contentPane.add(btnRegister);
	}

	
}
