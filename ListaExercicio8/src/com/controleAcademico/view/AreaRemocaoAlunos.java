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

public class AreaRemocaoAlunos extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomeAluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaRemocaoAlunos frame = new AreaRemocaoAlunos();
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
	public AreaRemocaoAlunos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRemocaoDeAlunos = new JLabel("REMO\u00C7\u00C3O DE ALUNOS");
		lblRemocaoDeAlunos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRemocaoDeAlunos.setBounds(114, 11, 192, 38);
		contentPane.add(lblRemocaoDeAlunos);
		
		JLabel lblNomeDoAluno = new JLabel("NOME DO ALUNO");
		lblNomeDoAluno.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeDoAluno.setBounds(138, 60, 136, 14);
		contentPane.add(lblNomeDoAluno);
		
		textFieldNomeAluno = new JTextField();
		textFieldNomeAluno.setColumns(10);
		textFieldNomeAluno.setBounds(76, 85, 260, 20);
		contentPane.add(textFieldNomeAluno);
		
		JButton btnValidar = new JButton("VALIDAR");
		btnValidar.setBounds(163, 116, 89, 23);
		contentPane.add(btnValidar);
		
		JLabel lblAluno = new JLabel("ALUNO");
		lblAluno.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAluno.setBounds(177, 161, 60, 14);
		contentPane.add(lblAluno);
		
		List listAlunoSelecionado = new List();
		listAlunoSelecionado.setBounds(76, 183, 260, 79);
		contentPane.add(listAlunoSelecionado);
		
		JButton btnRemover = new JButton("REMOVER");
		btnRemover.setBounds(158, 288, 104, 23);
		contentPane.add(btnRemover);
	}

}
