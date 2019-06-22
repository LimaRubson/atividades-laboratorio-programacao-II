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

public class AreaRemocaoRendimentosEscolar extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomeAluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaRemocaoRendimentosEscolar frame = new AreaRemocaoRendimentosEscolar();
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
	public AreaRemocaoRendimentosEscolar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRemooDeRendimentos = new JLabel("REMO\u00C7\u00C3O DE RENDIMENTOS ESCOLAR");
		lblRemooDeRendimentos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRemooDeRendimentos.setBounds(50, 11, 326, 38);
		contentPane.add(lblRemooDeRendimentos);
		
		JLabel lblNomeDoAluno = new JLabel("NOME DO ALUNO");
		lblNomeDoAluno.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeDoAluno.setBounds(137, 60, 138, 14);
		contentPane.add(lblNomeDoAluno);
		
		textFieldNomeAluno = new JTextField();
		textFieldNomeAluno.setColumns(10);
		textFieldNomeAluno.setBounds(73, 85, 260, 20);
		contentPane.add(textFieldNomeAluno);
		
		JButton btnValidar = new JButton("VALIDAR");
		btnValidar.setBounds(159, 116, 89, 23);
		contentPane.add(btnValidar);
		
		JLabel lblRedimentoEscolar = new JLabel("REDIMENTO ESCOLAR");
		lblRedimentoEscolar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRedimentoEscolar.setBounds(123, 150, 172, 14);
		contentPane.add(lblRedimentoEscolar);
		
		List listRendimentoEscolarSelecionado = new List();
		listRendimentoEscolarSelecionado.setBounds(73, 170, 260, 79);
		contentPane.add(listRendimentoEscolarSelecionado);
		
		JButton btnRemover = new JButton("REMOVER");
		btnRemover.setBounds(159, 273, 104, 23);
		contentPane.add(btnRemover);
	}

}
