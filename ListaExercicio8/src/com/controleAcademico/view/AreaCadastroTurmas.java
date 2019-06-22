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

public class AreaCadastroTurmas extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldIdTurma;
	private JTextField textFieldDisciplinaTurma;
	private JTextField textFieldProfessorTurma;
	private JTextField textFieldCapacidadeTurma;
	private JTextField textFieldAlunoTurma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaCadastroTurmas frame = new AreaCadastroTurmas();
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
	public AreaCadastroTurmas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeTurmas = new JLabel("CADASTRO DE TURMAS");
		lblCadastroDeTurmas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCadastroDeTurmas.setBounds(178, 11, 201, 14);
		contentPane.add(lblCadastroDeTurmas);
		
		JLabel lblIdTurma = new JLabel("ID:");
		lblIdTurma.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIdTurma.setBounds(10, 50, 46, 14);
		contentPane.add(lblIdTurma);
		
		textFieldIdTurma = new JTextField();
		textFieldIdTurma.setColumns(10);
		textFieldIdTurma.setBounds(66, 49, 86, 20);
		contentPane.add(textFieldIdTurma);
		
		JLabel lblDisciplina = new JLabel("DISCIPLINA:");
		lblDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDisciplina.setBounds(162, 50, 100, 14);
		contentPane.add(lblDisciplina);
		
		textFieldDisciplinaTurma = new JTextField();
		textFieldDisciplinaTurma.setColumns(10);
		textFieldDisciplinaTurma.setBounds(270, 49, 154, 20);
		contentPane.add(textFieldDisciplinaTurma);
		
		JLabel lblProfessor = new JLabel("PROFESSOR:");
		lblProfessor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProfessor.setBounds(10, 89, 100, 14);
		contentPane.add(lblProfessor);
		
		textFieldProfessorTurma = new JTextField();
		textFieldProfessorTurma.setColumns(10);
		textFieldProfessorTurma.setBounds(113, 88, 154, 20);
		contentPane.add(textFieldProfessorTurma);
		
		JLabel lblCapacidadeDaTurma = new JLabel("CAPACIDADE DA TURMA:");
		lblCapacidadeDaTurma.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCapacidadeDaTurma.setBounds(277, 91, 201, 14);
		contentPane.add(lblCapacidadeDaTurma);
		
		textFieldCapacidadeTurma = new JTextField();
		textFieldCapacidadeTurma.setColumns(10);
		textFieldCapacidadeTurma.setBounds(488, 88, 73, 20);
		contentPane.add(textFieldCapacidadeTurma);
		
		JLabel lblAluno = new JLabel("ALUNO:");
		lblAluno.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAluno.setBounds(10, 126, 73, 14);
		contentPane.add(lblAluno);
		
		textFieldAlunoTurma = new JTextField();
		textFieldAlunoTurma.setColumns(10);
		textFieldAlunoTurma.setBounds(93, 125, 154, 20);
		contentPane.add(textFieldAlunoTurma);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCadastrar.setBounds(205, 182, 174, 23);
		contentPane.add(btnCadastrar);
	}
}
