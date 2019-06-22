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

public class AreaConsultaProfessores extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomeProfessor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaConsultaProfessores frame = new AreaConsultaProfessores();
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
	public AreaConsultaProfessores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConsultaDeProfessores = new JLabel("CONSULTA DE PROFESSORES");
		lblConsultaDeProfessores.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblConsultaDeProfessores.setBounds(79, 11, 248, 14);
		contentPane.add(lblConsultaDeProfessores);
		
		JLabel lblNomeDoProfessor = new JLabel("NOME DO PROFESSOR");
		lblNomeDoProfessor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeDoProfessor.setBounds(114, 36, 174, 14);
		contentPane.add(lblNomeDoProfessor);
		
		textFieldNomeProfessor = new JTextField();
		textFieldNomeProfessor.setColumns(10);
		textFieldNomeProfessor.setBounds(79, 61, 236, 20);
		contentPane.add(textFieldNomeProfessor);
		
		JButton btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setBounds(138, 92, 110, 23);
		contentPane.add(btnConsultar);
		
		JLabel lblProfessor = new JLabel("PROFESSOR");
		lblProfessor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProfessor.setBounds(149, 149, 89, 14);
		contentPane.add(lblProfessor);
		
		List listProfessorSelecionado = new List();
		listProfessorSelecionado.setBounds(67, 173, 260, 79);
		contentPane.add(listProfessorSelecionado);
	}

}
