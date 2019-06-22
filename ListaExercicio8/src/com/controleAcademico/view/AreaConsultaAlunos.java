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

public class AreaConsultaAlunos extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomeAluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaConsultaAlunos frame = new AreaConsultaAlunos();
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
	public AreaConsultaAlunos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConsultaDeAlunos = new JLabel("CONSULTA DE ALUNOS");
		lblConsultaDeAlunos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblConsultaDeAlunos.setBounds(115, 11, 199, 14);
		contentPane.add(lblConsultaDeAlunos);
		
		JLabel lblNomeDoAluno = new JLabel("NOME DO ALUNO");
		lblNomeDoAluno.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeDoAluno.setBounds(139, 36, 138, 14);
		contentPane.add(lblNomeDoAluno);
		
		textFieldNomeAluno = new JTextField();
		textFieldNomeAluno.setColumns(10);
		textFieldNomeAluno.setBounds(92, 61, 236, 20);
		contentPane.add(textFieldNomeAluno);
		
		JButton btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setBounds(154, 92, 110, 23);
		contentPane.add(btnConsultar);
		
		JLabel lblAluno = new JLabel("ALUNO");
		lblAluno.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAluno.setBounds(180, 145, 59, 14);
		contentPane.add(lblAluno);
		
		List listAlunoSelecionado = new List();
		listAlunoSelecionado.setBounds(80, 165, 260, 79);
		contentPane.add(listAlunoSelecionado);
	}

}
