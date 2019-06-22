package com.controleAcademico.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.List;

public class AreaListaRendimentosEscolar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaListaRendimentosEscolar frame = new AreaListaRendimentosEscolar();
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
	public AreaListaRendimentosEscolar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListaDeRendimentos = new JLabel("LISTA DE RENDIMENTOS ESCOLAR");
		lblListaDeRendimentos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblListaDeRendimentos.setBounds(67, 11, 298, 14);
		contentPane.add(lblListaDeRendimentos);
		
		List listRendimentosEscolar = new List();
		listRendimentosEscolar.setBounds(10, 44, 414, 208);
		contentPane.add(listRendimentosEscolar);
	}

}
