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

public class AreaConsultaRendimentosEscolar extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomeAluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaConsultaRendimentosEscolar frame = new AreaConsultaRendimentosEscolar();
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
	public AreaConsultaRendimentosEscolar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConsultaDeRendimentos = new JLabel("CONSULTA DE RENDIMENTOS ESCOLAR");
		lblConsultaDeRendimentos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblConsultaDeRendimentos.setBounds(48, 11, 334, 14);
		contentPane.add(lblConsultaDeRendimentos);
		
		JLabel lblNomeDoAluno = new JLabel("NOME DO ALUNO");
		lblNomeDoAluno.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeDoAluno.setBounds(138, 51, 136, 14);
		contentPane.add(lblNomeDoAluno);
		
		textFieldNomeAluno = new JTextField();
		textFieldNomeAluno.setColumns(10);
		textFieldNomeAluno.setBounds(85, 76, 236, 20);
		contentPane.add(textFieldNomeAluno);
		
		JButton btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setBounds(153, 107, 110, 23);
		contentPane.add(btnConsultar);
		
		JLabel lblRendimentoEscolar = new JLabel("RENDIMENTO ESCOLAR");
		lblRendimentoEscolar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRendimentoEscolar.setBounds(123, 151, 184, 14);
		contentPane.add(lblRendimentoEscolar);
		
		List listRendimentoEscolarSelecionado = new List();
		listRendimentoEscolarSelecionado.setBounds(87, 173, 260, 79);
		contentPane.add(listRendimentoEscolarSelecionado);
	}

}
