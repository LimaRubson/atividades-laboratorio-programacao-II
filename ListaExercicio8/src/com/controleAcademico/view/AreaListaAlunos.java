package com.controleAcademico.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.List;

public class AreaListaAlunos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaListaAlunos frame = new AreaListaAlunos();
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
	public AreaListaAlunos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListaDeAlunos = new JLabel("LISTA DE ALUNOS");
		lblListaDeAlunos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblListaDeAlunos.setBounds(137, 11, 161, 14);
		contentPane.add(lblListaDeAlunos);
		
		List listAlunos = new List();
		listAlunos.setBounds(10, 31, 414, 208);
		contentPane.add(listAlunos);
	}

}
