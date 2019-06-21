package com.controleAcademico.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.controleAcademico.controller.Disciplina;
import com.controleAcademico.controller.Fachada;
import com.controleAcademico.model.RepositorioDisciplinaArray;
import com.controleAcademico.util.DisciplinaInexistenteException;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AreaConsultaDisciplinas extends JFrame {

	private JPanel contentPane;
	
	Fachada fachada = new Fachada();
	
	private JTextField textFieldNomeDaDisciplina;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaConsultaDisciplinas frame = new AreaConsultaDisciplinas();
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
	public AreaConsultaDisciplinas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConsultaDeDisciplina = new JLabel("CONSULTA DE DISCIPLINAS");
		lblConsultaDeDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblConsultaDeDisciplina.setBounds(94, 11, 236, 14);
		contentPane.add(lblConsultaDeDisciplina);
		
		JLabel lblNomeDaDisciplina = new JLabel("NOME DA DISCIPLINA");
		lblNomeDaDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeDaDisciplina.setBounds(130, 36, 163, 14);
		contentPane.add(lblNomeDaDisciplina);
		
		textFieldNomeDaDisciplina = new JTextField();
		textFieldNomeDaDisciplina.setBounds(94, 61, 236, 20);
		contentPane.add(textFieldNomeDaDisciplina);
		textFieldNomeDaDisciplina.setColumns(10);
		
		List listDisciplina = new List();
		listDisciplina.setBounds(76, 169, 260, 79);
		contentPane.add(listDisciplina);
		
		JButton btnConsultarDisciplina = new JButton("CONSULTAR");
		btnConsultarDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldNomeDaDisciplina.getText().equals("Laboratório de Programação I")) {
					try {
						listDisciplina.add("ID: " + Integer.toString(Fachada.getInstance().procurarDisciplina("Laboratório de Programação I").getId()));
						listDisciplina.add("Nome: " + Fachada.getInstance().procurarDisciplina("Laboratório de Programação I").getNome());
						listDisciplina.add("Ementa: " + Fachada.getInstance().procurarDisciplina("Laboratório de Programação I").getEmenta());
					} catch (DisciplinaInexistenteException ex) {
						// TODO Auto-generated catch block
						listDisciplina.add("Disciplina Inexistente!");
						ex.printStackTrace();
					}
				}
			}
		});
		btnConsultarDisciplina.setBounds(155, 92, 110, 23);
		contentPane.add(btnConsultarDisciplina);
		
		JLabel labelDisciplina = new JLabel("DISCIPLINA");
		labelDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelDisciplina.setBounds(165, 149, 89, 14);
		contentPane.add(labelDisciplina);
		
	}
}
