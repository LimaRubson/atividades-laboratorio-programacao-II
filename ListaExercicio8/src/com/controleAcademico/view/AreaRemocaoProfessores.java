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

public class AreaRemocaoProfessores extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomeDoProfessor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaRemocaoProfessores frame = new AreaRemocaoProfessores();
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
	public AreaRemocaoProfessores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRemocaoDeProfessores = new JLabel("REMO\u00C7\u00C3O DE PROFESSORES");
		lblRemocaoDeProfessores.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRemocaoDeProfessores.setBounds(87, 11, 243, 38);
		contentPane.add(lblRemocaoDeProfessores);
		
		JLabel lblNomeDoProfessor = new JLabel("NOME DO PROFESSOR");
		lblNomeDoProfessor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeDoProfessor.setBounds(115, 60, 168, 14);
		contentPane.add(lblNomeDoProfessor);
		
		textFieldNomeDoProfessor = new JTextField();
		textFieldNomeDoProfessor.setColumns(10);
		textFieldNomeDoProfessor.setBounds(70, 85, 260, 20);
		contentPane.add(textFieldNomeDoProfessor);
		
		JButton btnValidar = new JButton("VALIDAR");
		btnValidar.setBounds(148, 116, 89, 23);
		contentPane.add(btnValidar);
		
		JLabel lblProfessor = new JLabel("PROFESSOR");
		lblProfessor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProfessor.setBounds(148, 161, 89, 14);
		contentPane.add(lblProfessor);
		
		List listProfessorSelecionado = new List();
		listProfessorSelecionado.setBounds(70, 181, 260, 79);
		contentPane.add(listProfessorSelecionado);
		
		JButton btnRemover = new JButton("REMOVER");
		btnRemover.setBounds(148, 289, 104, 23);
		contentPane.add(btnRemover);
	}

}
