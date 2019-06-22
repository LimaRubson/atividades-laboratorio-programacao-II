package com.controleAcademico.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.List;

public class AreaConsultaTurmas extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldIdTurma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaConsultaTurmas frame = new AreaConsultaTurmas();
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
	public AreaConsultaTurmas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConsultaDeTurmas = new JLabel("CONSULTA DE TURMAS");
		lblConsultaDeTurmas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblConsultaDeTurmas.setBounds(112, 11, 203, 14);
		contentPane.add(lblConsultaDeTurmas);
		
		JLabel lblIdDaTurma = new JLabel("ID DA TURMA");
		lblIdDaTurma.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIdDaTurma.setBounds(153, 47, 113, 14);
		contentPane.add(lblIdDaTurma);
		
		textFieldIdTurma = new JTextField();
		textFieldIdTurma.setColumns(10);
		textFieldIdTurma.setBounds(163, 71, 74, 20);
		contentPane.add(textFieldIdTurma);
		
		JButton btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setBounds(143, 115, 110, 23);
		contentPane.add(btnConsultar);
		
		JLabel lblTurma = new JLabel("TURMA");
		lblTurma.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTurma.setBounds(177, 174, 60, 14);
		contentPane.add(lblTurma);
		
		List listTurmaSelecionada = new List();
		listTurmaSelecionada.setBounds(83, 204, 260, 79);
		contentPane.add(listTurmaSelecionada);
	}

}
