package com.controleAcademico.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.controleAcademico.aplicacao.Aplicacao;
import com.controleAcademico.controller.Disciplina;
import com.controleAcademico.controller.Fachada;
import com.controleAcademico.util.DisciplinaInexistenteException;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.TextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AreaCadastroDisciplinas extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldIdDisciplina;
	private JTextField textFieldNomeDisciplina;
	
	private Disciplina disciplina = new Disciplina();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaCadastroDisciplinas frame = new AreaCadastroDisciplinas();
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
	public AreaCadastroDisciplinas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeDisciplinas = new JLabel("CADASTRO DE DISCIPLINAS");
		lblCadastroDeDisciplinas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCadastroDeDisciplinas.setBounds(102, 11, 242, 14);
		contentPane.add(lblCadastroDeDisciplinas);
		
		JLabel lblIdDisciplina = new JLabel("ID:");
		lblIdDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIdDisciplina.setBounds(10, 53, 46, 14);
		contentPane.add(lblIdDisciplina);
		
		textFieldIdDisciplina = new JTextField();
		textFieldIdDisciplina.setBounds(66, 50, 86, 20);
		contentPane.add(textFieldIdDisciplina);
		textFieldIdDisciplina.setColumns(10);
		
		JLabel lblNomeDisciplina = new JLabel("NOME:");
		lblNomeDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeDisciplina.setBounds(184, 53, 76, 14);
		contentPane.add(lblNomeDisciplina);
		
		textFieldNomeDisciplina = new JTextField();
		textFieldNomeDisciplina.setBounds(270, 50, 154, 20);
		contentPane.add(textFieldNomeDisciplina);
		textFieldNomeDisciplina.setColumns(10);
		
		JLabel lblEmentaDisciplina = new JLabel("EMENTA");
		lblEmentaDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmentaDisciplina.setBounds(184, 98, 76, 14);
		contentPane.add(lblEmentaDisciplina);
		
		TextArea textAreaEmentaDisciplina = new TextArea();
		textAreaEmentaDisciplina.setBounds(44, 119, 340, 126);
		contentPane.add(textAreaEmentaDisciplina);
		
		JButton btnCadastrarDisciplina = new JButton("CADASTRAR");
		btnCadastrarDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Aplicacao.main(null);
				
				disciplina.setId(Integer.parseInt(textFieldIdDisciplina.getText()));
				disciplina.setNome(textFieldNomeDisciplina.getText());
				disciplina.setEmenta(textAreaEmentaDisciplina.getText());
				
				Fachada.getInstance().cadastrarDisciplina(disciplina);
	
			}
		});
		btnCadastrarDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCadastrarDisciplina.setBounds(132, 278, 174, 23);
		contentPane.add(btnCadastrarDisciplina);
	}
	
}	
