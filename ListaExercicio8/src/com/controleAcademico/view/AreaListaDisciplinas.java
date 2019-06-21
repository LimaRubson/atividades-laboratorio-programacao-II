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
import java.awt.List;

public class AreaListaDisciplinas extends JFrame {

	private JPanel contentPane;
	
	Disciplina disciplinas = new Disciplina();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaListaDisciplinas frame = new AreaListaDisciplinas();
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
	public AreaListaDisciplinas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListaDeDisciplinas = new JLabel("LISTA DE DISCIPLINAS");
		lblListaDeDisciplinas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblListaDeDisciplinas.setBounds(115, 11, 201, 14);
		contentPane.add(lblListaDeDisciplinas);
		
		List listDisciplinas = new List();
		listDisciplinas.setBounds(10, 44, 414, 208);
		contentPane.add(listDisciplinas);
		
	}

}
