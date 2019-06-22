package com.controleAcademico.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.List;

public class AreaListaTurmas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaListaTurmas frame = new AreaListaTurmas();
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
	public AreaListaTurmas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListaDeTurmas = new JLabel("LISTA DE TURMAS");
		lblListaDeTurmas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblListaDeTurmas.setBounds(139, 11, 159, 14);
		contentPane.add(lblListaDeTurmas);
		
		List listTurmas = new List();
		listTurmas.setBounds(10, 44, 414, 208);
		contentPane.add(listTurmas);
	}

}
