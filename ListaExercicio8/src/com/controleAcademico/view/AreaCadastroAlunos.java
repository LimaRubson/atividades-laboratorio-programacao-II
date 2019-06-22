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

public class AreaCadastroAlunos extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldIdAluno;
	private JTextField textFieldNomeAluno;
	private JTextField textFieldDataNascimentoAluno;
	private JTextField textFieldPeriodo;
	private JTextField textFieldNomeUsuario;
	private JTextField textFieldSenhaUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaCadastroAlunos frame = new AreaCadastroAlunos();
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
	public AreaCadastroAlunos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeAlunos = new JLabel("CADASTRO DE ALUNOS");
		lblCadastroDeAlunos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCadastroDeAlunos.setBounds(113, 11, 196, 14);
		contentPane.add(lblCadastroDeAlunos);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblId.setBounds(10, 48, 46, 14);
		contentPane.add(lblId);
		
		textFieldIdAluno = new JTextField();
		textFieldIdAluno.setColumns(10);
		textFieldIdAluno.setBounds(66, 47, 86, 20);
		contentPane.add(textFieldIdAluno);
		
		JLabel lblNome = new JLabel("NOME:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNome.setBounds(162, 50, 76, 14);
		contentPane.add(lblNome);
		
		textFieldNomeAluno = new JTextField();
		textFieldNomeAluno.setColumns(10);
		textFieldNomeAluno.setBounds(248, 47, 176, 20);
		contentPane.add(textFieldNomeAluno);
		
		JLabel lblDataDeNascimento = new JLabel("DATA DE NASCIMENTO:");
		lblDataDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDataDeNascimento.setBounds(10, 84, 196, 14);
		contentPane.add(lblDataDeNascimento);
		
		textFieldDataNascimentoAluno = new JTextField();
		textFieldDataNascimentoAluno.setColumns(10);
		textFieldDataNascimentoAluno.setBounds(216, 83, 176, 20);
		contentPane.add(textFieldDataNascimentoAluno);
		
		JLabel lblPerodo = new JLabel("PER\u00CDODO:");
		lblPerodo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPerodo.setBounds(10, 124, 86, 14);
		contentPane.add(lblPerodo);
		
		textFieldPeriodo = new JTextField();
		textFieldPeriodo.setColumns(10);
		textFieldPeriodo.setBounds(113, 123, 46, 20);
		contentPane.add(textFieldPeriodo);
		
		JLabel lblUsurio = new JLabel("NOME DO USU\u00C1RIO:");
		lblUsurio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsurio.setBounds(169, 126, 163, 14);
		contentPane.add(lblUsurio);
		
		textFieldNomeUsuario = new JTextField();
		textFieldNomeUsuario.setColumns(10);
		textFieldNomeUsuario.setBounds(342, 123, 82, 20);
		contentPane.add(textFieldNomeUsuario);
		
		JLabel lblSenha = new JLabel("SENHA:");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSenha.setBounds(10, 161, 76, 14);
		contentPane.add(lblSenha);
		
		textFieldSenhaUsuario = new JTextField();
		textFieldSenhaUsuario.setColumns(10);
		textFieldSenhaUsuario.setBounds(96, 160, 82, 20);
		contentPane.add(textFieldSenhaUsuario);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCadastrar.setBounds(122, 228, 174, 23);
		contentPane.add(btnCadastrar);
	}

}
