package com.controleAcademico.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class AreaAdministrador extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaAdministrador frame = new AreaAdministrador();
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
	public AreaAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1007, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblreaAdministrador = new JLabel("\u00C1REA ADMINISTRADOR");
		lblreaAdministrador.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblreaAdministrador.setBounds(424, 11, 195, 14);
		contentPane.add(lblreaAdministrador);
		
		JLabel lblDisciplinas = new JLabel("DISCIPLINAS");
		lblDisciplinas.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblDisciplinas.setBounds(47, 61, 106, 14);
		contentPane.add(lblDisciplinas);
		
		JButton btnCadastrarDisciplinas = new JButton("CADASTRAR");
		btnCadastrarDisciplinas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AreaCadastroDisciplinas areaCadastroDisciplinas = new AreaCadastroDisciplinas();
				
				areaCadastroDisciplinas.setVisible(true);
			}
		});
		btnCadastrarDisciplinas.setBounds(36, 107, 117, 23);
		contentPane.add(btnCadastrarDisciplinas);
		
		JButton btnRemoverDisciplinas = new JButton("REMOVER");
		btnRemoverDisciplinas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AreaRemocaoDisciplinas areaRemocaoDisciplinas = new AreaRemocaoDisciplinas();
				
				areaRemocaoDisciplinas.setVisible(true);
			}
		});
		btnRemoverDisciplinas.setBounds(36, 141, 117, 23);
		contentPane.add(btnRemoverDisciplinas);
		
		JButton btnConsultarDisciplinas = new JButton("CONSULTAR");
		btnConsultarDisciplinas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AreaConsultaDisciplinas areaConsultaDisciplinas = new AreaConsultaDisciplinas();
				
				areaConsultaDisciplinas.setVisible(true);
			}
		});
		btnConsultarDisciplinas.setBounds(36, 175, 117, 23);
		contentPane.add(btnConsultarDisciplinas);
		
		JButton btnListarDisciplinas = new JButton("LISTAR");
		btnListarDisciplinas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AreaListaDisciplinas areaListaDisciplinas = new AreaListaDisciplinas();
				
				areaListaDisciplinas.setVisible(true);
			}
		});
		btnListarDisciplinas.setBounds(36, 209, 117, 23);
		contentPane.add(btnListarDisciplinas);
		
		JLabel lblTurmas = new JLabel("TURMAS");
		lblTurmas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTurmas.setBounds(264, 61, 78, 14);
		contentPane.add(lblTurmas);
		
		JButton btnCadastrarTurmas = new JButton("CADASTRAR");
		btnCadastrarTurmas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AreaCadastroTurmas areaCadastroTurmas = new AreaCadastroTurmas();
				
				areaCadastroTurmas.setVisible(true);
			}
		});
		btnCadastrarTurmas.setBounds(246, 107, 106, 23);
		contentPane.add(btnCadastrarTurmas);
		
		JButton btnRemoverTurmas = new JButton("REMOVER");
		btnRemoverTurmas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AreaRemocaoTurmas areaRemocaoTurmas = new AreaRemocaoTurmas();
				
				areaRemocaoTurmas.setVisible(true);
				
			}
		});
		btnRemoverTurmas.setBounds(246, 141, 106, 23);
		contentPane.add(btnRemoverTurmas);
		
		JButton btnConsultarTurmas = new JButton("CONSULTAR");
		btnConsultarTurmas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AreaConsultaTurmas areaConsultaTurma = new AreaConsultaTurmas();
				
				areaConsultaTurma.setVisible(true);
				
			}
		});
		btnConsultarTurmas.setBounds(246, 175, 106, 23);
		contentPane.add(btnConsultarTurmas);
		
		JButton btnListarTurmas = new JButton("LISTAR");
		btnListarTurmas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AreaListaTurmas areaListaTurmas = new AreaListaTurmas();
				
				areaListaTurmas.setVisible(true);
				
			}
		});
		btnListarTurmas.setBounds(246, 209, 106, 23);
		contentPane.add(btnListarTurmas);
		
		JLabel lblAlunos = new JLabel("ALUNOS");
		lblAlunos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAlunos.setBounds(424, 61, 69, 14);
		contentPane.add(lblAlunos);
		
		JButton btnCadastrarAlunos = new JButton("CADASTRAR");
		btnCadastrarAlunos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AreaCadastroAlunos areaCadastroAlunos = new AreaCadastroAlunos();
				
				areaCadastroAlunos.setVisible(true);
				
			}
		});
		btnCadastrarAlunos.setBounds(403, 107, 106, 23);
		contentPane.add(btnCadastrarAlunos);
		
		JButton btnRemoverAlunos = new JButton("REMOVER");
		btnRemoverAlunos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AreaRemocaoAlunos areaRemocaoAlunos = new AreaRemocaoAlunos();
				
				areaRemocaoAlunos.setVisible(true);
				
			}
		});
		btnRemoverAlunos.setBounds(403, 141, 106, 23);
		contentPane.add(btnRemoverAlunos);
		
		JButton btnConsultarAlunos = new JButton("CONSULTAR");
		btnConsultarAlunos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AreaConsultaAlunos areaConsultaAlunos = new AreaConsultaAlunos();
				
				areaConsultaAlunos.setVisible(true);
				
				
			}
		});
		btnConsultarAlunos.setBounds(403, 175, 106, 23);
		contentPane.add(btnConsultarAlunos);
		
		JButton btnListarAlunos = new JButton("LISTAR");
		btnListarAlunos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AreaListaAlunos areaListaAlunos = new AreaListaAlunos();
				
				areaListaAlunos.setVisible(true);
				
			}
		});
		btnListarAlunos.setBounds(403, 209, 106, 23);
		contentPane.add(btnListarAlunos);
		
		JLabel lblProfessores = new JLabel("PROFESSORES");
		lblProfessores.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProfessores.setBounds(580, 61, 108, 14);
		contentPane.add(lblProfessores);
		
		JButton btnRemoverProfessores = new JButton("REMOVER");
		btnRemoverProfessores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AreaRemocaoProfessores areaRemocaoProfessores = new AreaRemocaoProfessores();
				
				areaRemocaoProfessores.setVisible(true);
				
				
			}
		});
		btnRemoverProfessores.setBounds(569, 107, 123, 23);
		contentPane.add(btnRemoverProfessores);
		
		JButton btnConsultarProfessores = new JButton("CONSULTAR");
		btnConsultarProfessores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AreaConsultaProfessores areaConsultaProfessores = new AreaConsultaProfessores();
				
				areaConsultaProfessores.setVisible(true);				
				
			}
		});
		btnConsultarProfessores.setBounds(569, 141, 123, 23);
		contentPane.add(btnConsultarProfessores);
		
		JButton btnListarProfessores = new JButton("LISTAR");
		btnListarProfessores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AreaListaProfessores areaListaProfessores = new AreaListaProfessores();
				
				areaListaProfessores.setVisible(true);
				
			}
		});
		btnListarProfessores.setBounds(569, 175, 123, 23);
		contentPane.add(btnListarProfessores);
		
		JLabel lblRendimentoEscolar = new JLabel("RENDIMENTO ESCOLAR");
		lblRendimentoEscolar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRendimentoEscolar.setBounds(786, 61, 195, 14);
		contentPane.add(lblRendimentoEscolar);
		
		JButton btnRemoverRendimentos = new JButton("REMOVER");
		btnRemoverRendimentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AreaRemocaoRendimentosEscolar areaRemocaoRendimentosEscolar = new AreaRemocaoRendimentosEscolar();
				
				areaRemocaoRendimentosEscolar.setVisible(true);
				
				
			}
		});
		btnRemoverRendimentos.setBounds(821, 107, 113, 23);
		contentPane.add(btnRemoverRendimentos);
		
		JButton btnConsultarRendimentos = new JButton("CONSULTAR");
		btnConsultarRendimentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AreaConsultaRendimentosEscolar areaConsultaRendimentosEscolar = new AreaConsultaRendimentosEscolar();
				
				areaConsultaRendimentosEscolar.setVisible(true);
				
			}
		});
		btnConsultarRendimentos.setBounds(821, 141, 113, 23);
		contentPane.add(btnConsultarRendimentos);
		
		JButton btnListarRendimentos = new JButton("LISTAR");
		btnListarRendimentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AreaListaRendimentosEscolar areaListaRendimentosEscolar = new AreaListaRendimentosEscolar();
				
				areaListaRendimentosEscolar.setVisible(true);
				
			}
		});
		btnListarRendimentos.setBounds(821, 175, 113, 23);
		contentPane.add(btnListarRendimentos);
	}
}
