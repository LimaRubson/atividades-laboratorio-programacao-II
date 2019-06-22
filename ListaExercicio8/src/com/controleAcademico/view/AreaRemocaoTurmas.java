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

public class AreaRemocaoTurmas extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldIdTurma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaRemocaoTurmas frame = new AreaRemocaoTurmas();
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
	public AreaRemocaoTurmas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRemooDeTurmas = new JLabel("REMO\u00C7\u00C3O DE TURMAS");
		lblRemooDeTurmas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRemooDeTurmas.setBounds(116, 11, 231, 38);
		contentPane.add(lblRemooDeTurmas);
		
		JLabel lblIdDaTurma = new JLabel("ID DA TURMA");
		lblIdDaTurma.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIdDaTurma.setBounds(157, 72, 123, 14);
		contentPane.add(lblIdDaTurma);
		
		textFieldIdTurma = new JTextField();
		textFieldIdTurma.setColumns(10);
		textFieldIdTurma.setBounds(167, 97, 74, 20);
		contentPane.add(textFieldIdTurma);
		
		JButton btnValidar = new JButton("VALIDAR");
		btnValidar.setBounds(162, 128, 89, 23);
		contentPane.add(btnValidar);
		
		JLabel lblTurma = new JLabel("TURMA");
		lblTurma.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTurma.setBounds(178, 186, 63, 14);
		contentPane.add(lblTurma);
		
		List listTurmaSelecionada = new List();
		listTurmaSelecionada.setBounds(76, 206, 260, 79);
		contentPane.add(listTurmaSelecionada);
		
		JButton btnRemover = new JButton("REMOVER");
		btnRemover.setBounds(157, 300, 104, 23);
		contentPane.add(btnRemover);
	}
}
