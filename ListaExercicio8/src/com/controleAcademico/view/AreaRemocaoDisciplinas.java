package com.controleAcademico.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.controleAcademico.controller.Disciplina;
import com.controleAcademico.controller.Fachada;
import com.controleAcademico.util.DisciplinaInexistenteException;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextArea;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AreaRemocaoDisciplinas extends JFrame {

	private JPanel contentPaneRemocaoDisciplina;
	private JTextField textFieldRemocaoNomeDisciplina;
	
	Disciplina disciplina = new Disciplina();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaRemocaoDisciplinas frame = new AreaRemocaoDisciplinas();
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
	public AreaRemocaoDisciplinas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 386);
		contentPaneRemocaoDisciplina = new JPanel();
		contentPaneRemocaoDisciplina.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPaneRemocaoDisciplina);
		contentPaneRemocaoDisciplina.setLayout(null);
		
		JLabel lblRemaoDeDisciplinas = new JLabel("REMO\u00C7\u00C3O DE DISCIPLINAS");
		lblRemaoDeDisciplinas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRemaoDeDisciplinas.setBounds(100, 11, 231, 38);
		contentPaneRemocaoDisciplina.add(lblRemaoDeDisciplinas);
		
		JLabel lblRemocaoNomeDaDisciplina = new JLabel("NOME DA DISCIPLINA");
		lblRemocaoNomeDaDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRemocaoNomeDaDisciplina.setBounds(130, 60, 168, 14);
		contentPaneRemocaoDisciplina.add(lblRemocaoNomeDaDisciplina);
		
		textFieldRemocaoNomeDisciplina = new JTextField();
		textFieldRemocaoNomeDisciplina.setBounds(71, 85, 260, 20);
		contentPaneRemocaoDisciplina.add(textFieldRemocaoNomeDisciplina);
		textFieldRemocaoNomeDisciplina.setColumns(10);
		
		List listValidarRemocaoDisciplina = new List();
		listValidarRemocaoDisciplina.setBounds(71, 197, 260, 79);
		contentPaneRemocaoDisciplina.add(listValidarRemocaoDisciplina);
		
		JButton btnRemocaoValidar = new JButton("VALIDAR");
		btnRemocaoValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					disciplina.setId(1);
					disciplina.setNome("Pensamento");
					disciplina.setEmenta("Elementos do Pensamento");
					Fachada.getInstance().cadastrarDisciplina(disciplina);
					if(textFieldRemocaoNomeDisciplina.getText().equals(disciplina.getNome())) {
						try {
							listValidarRemocaoDisciplina.add("ID: " + Integer.toString(Fachada.getInstance().procurarDisciplina(disciplina.getNome()).getId()));
							listValidarRemocaoDisciplina.add("Nome: " + Fachada.getInstance().procurarDisciplina(disciplina.getNome()).getNome());
							listValidarRemocaoDisciplina.add("Ementa: " + Fachada.getInstance().procurarDisciplina(disciplina.getNome()).getEmenta());
						} catch (DisciplinaInexistenteException e) {
							// TODO Auto-generated catch block
							listValidarRemocaoDisciplina.add("Disciplina Inexistente!");
							//e.printStackTrace();
						}
					}
			}
		});
		btnRemocaoValidar.setBounds(161, 116, 89, 23);
		contentPaneRemocaoDisciplina.add(btnRemocaoValidar);
		
		JLabel lblRemocaoDisciplinaListada = new JLabel("DISCIPLINA");
		lblRemocaoDisciplinaListada.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRemocaoDisciplinaListada.setBounds(161, 177, 89, 14);
		contentPaneRemocaoDisciplina.add(lblRemocaoDisciplinaListada);
		
		JButton btnRemoverDisciplina = new JButton("REMOVER");
		btnRemoverDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textFieldRemocaoNomeDisciplina.getText().equals(disciplina.getNome())) {
					Fachada.getInstance().removerDisciplina(disciplina.getNome());
				}
			}
		});
		btnRemoverDisciplina.setBounds(146, 293, 104, 23);
		contentPaneRemocaoDisciplina.add(btnRemoverDisciplina);
	}
}
