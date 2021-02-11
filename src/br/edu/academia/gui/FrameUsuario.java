package br.edu.academia.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import br.edu.academia.model.Aluno;

public class FrameUsuario {

	
	public void criarTela() {
		
//*** Formatações da tela
		Color cinza = new Color (110,110,110);
		Color branca = new Color (255,255,255);
		Color verdeEscuro = new Color (3,130,23);
		Font titulo = new Font ("Arial Black", Font.BOLD, 20);
		Font tituloResultado = new Font ("Arial Black", Font.BOLD, 16);
	
		JFrame telaAluno = new JFrame();
		telaAluno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaAluno.setSize(700, 560);
		telaAluno.setTitle("Dados de Usuário");
		telaAluno.setLayout(null);
		
//*** ------------------------------------------------------		
	//**Label Título
		JLabel labelTitulo = new JLabel();
		labelTitulo.setText("  ACADEMIA DO JÃO");
		labelTitulo.setBackground(cinza);
		labelTitulo.setFont(titulo);
		labelTitulo.setForeground(branca);
		labelTitulo.setOpaque(true);
		labelTitulo.setBounds(10, 10, 665, 40);
//*** ------------------------------------------------------
	//**Label Nome
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome do Aluno:");
		labelNome.setBounds(10, 60, 200, 30);	
//*** ------------------------------------------------------			
	//**TextField Nome
		JTextField textFieldNome = new JTextField();
		textFieldNome.setText(null);
		textFieldNome.setBounds(10, 85, 300, 30);
//*** ------------------------------------------------------		
	//**Label Sexo
		JLabel labelSexo = new JLabel();
		labelSexo.setText("Sexo do Aluno:");
		labelSexo.setBounds(10, 120, 200, 30);
//*** ------------------------------------------------------			
	//**Radio Sexo M	
		JRadioButton radioMasculino = new JRadioButton();
		radioMasculino.setText("Masculino");
		radioMasculino.setBounds(130,145,150,30);
	//**Radio Sexo F		
		JRadioButton radioFeminino = new JRadioButton();
		radioFeminino.setText("Feminino");	
		radioFeminino.setBounds(10,145,120,30);
	//**Radio Group
		ButtonGroup radioGroup = new ButtonGroup();
		radioGroup.add(radioFeminino);
		radioGroup.add(radioMasculino);
//*** ------------------------------------------------------		
	//**Label Data de Nascimento
		JLabel labelDataNascimento = new JLabel();
		labelDataNascimento.setText("Data de Nascimento:");
		labelDataNascimento.setBounds(10, 180, 200, 30);
//*** ------------------------------------------------------
	//**Label Dia de Nascimento
		JLabel labelDiaNascimento = new JLabel();
		labelDiaNascimento.setText("Dia:");
		labelDiaNascimento.setBounds(10, 205, 200, 30);
//*** ------------------------------------------------------
	//**TextField Dia de Nascimento
		JTextField textFieldDiaNascimento = new JTextField();
		textFieldDiaNascimento.setText(null);
		textFieldDiaNascimento.setHorizontalAlignment(JTextField.RIGHT);
		textFieldDiaNascimento.setBounds(35, 205, 50, 30);
//*** ------------------------------------------------------
	//**Label Mes de Nascimento
		JLabel labelMesNascimento = new JLabel();
		labelMesNascimento.setText("Mes:");
		labelMesNascimento.setBounds(110, 205, 200, 30);
//*** ------------------------------------------------------		
	//**TextField Mes de Nascimento
		JTextField textFieldMesNascimento = new JTextField();
		textFieldMesNascimento.setText(null);
		textFieldMesNascimento.setHorizontalAlignment(JTextField.RIGHT);
		textFieldMesNascimento.setBounds(140, 205, 50, 30);
//*** ------------------------------------------------------
	//**Label Ano de Nascimento
		JLabel labelAnoNascimento = new JLabel();
		labelAnoNascimento.setText("Ano:");
		labelAnoNascimento.setBounds(215, 205, 200, 30);
//*** ------------------------------------------------------
	//**TextField Ano de Nascimento
		JTextField textFieldAnoNascimento = new JTextField();
		textFieldAnoNascimento.setText(null);
		textFieldAnoNascimento.setHorizontalAlignment(JTextField.RIGHT);
		textFieldAnoNascimento.setBounds(245, 205, 50, 30);
//*** ------------------------------------------------------		
	//**Label Peso
		JLabel labelPeso = new JLabel();
		labelPeso.setText("Peso:");
		labelPeso.setBounds(10, 240, 200, 30);
//*** ------------------------------------------------------			
	//**TextField Peso
		JTextField textFieldPeso = new JTextField();
		textFieldPeso.setText(null);
		textFieldPeso.setHorizontalAlignment(JTextField.RIGHT);
		textFieldPeso.setBounds(10, 265, 50, 30);
//*** ------------------------------------------------------
	//**Label Altura
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura:");
		labelAltura.setBounds(10, 300, 200, 30);
////*** ------------------------------------------------------			
	//**TextField Altura
		JTextField textFieldAltura = new JTextField();
		textFieldAltura.setText(null);
		textFieldAltura.setHorizontalAlignment(JTextField.RIGHT);
		textFieldAltura.setBounds(10, 325, 50, 30);
//*** ------------------------------------------------------
	//**Label Nivel de Atividade
		JLabel labelNivelAtividade = new JLabel();
		labelNivelAtividade.setText("Nivel de Atividade:");
		labelNivelAtividade.setBounds(10, 360, 200, 30);
//*** ------------------------------------------------------
	//**Combo Nivel de Atividade
		String[] nivelAtividadeFisica = {
				"Nenhuma",
				"Leve",
				"Moderada",
				"Intensa"};
		JComboBox<String> comboAtividade = new JComboBox<String>(nivelAtividadeFisica);
		comboAtividade.setBounds(10,385,300,30);	
//*** ------------------------------------------------------		
	//**Criar Botão Resultado
		JButton buttonResultado = new JButton();
		buttonResultado.setText("Calcular");
		Color verde = new Color(0,255,0);
		buttonResultado.setBackground(verde);
		buttonResultado.setBounds(10,440,130,50);
//*** ------------------------------------------------------			
	//**Criar Botão Limpar
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		Color azul = new Color(0,0,255);
		buttonLimpar.setBackground(azul);
		buttonLimpar.setForeground(branca);
		buttonLimpar.setBounds(180,440,130,50);	
//*** ------------------------------------------------------
	//**Label Separador
		JLabel labelSeparador = new JLabel();
		labelSeparador.setBounds(330, 85, 2, 405);	
		labelSeparador.setOpaque(true);
		labelSeparador.setBackground(cinza);		
//*** ------------------------------------------------------
	//**Label Título Resultado
		JLabel labelTituloResultado = new JLabel();
		labelTituloResultado.setText("Resultados");
		labelTituloResultado.setBounds(355, 50, 200, 50);
		labelTituloResultado.setFont(tituloResultado);
//*** ------------------------------------------------------
	//**Label Resultado Nome
		JLabel labelResultadoNome = new JLabel();
		labelResultadoNome.setText("Nome do Aluno: ");
		labelResultadoNome.setForeground(verdeEscuro);
		labelResultadoNome.setOpaque(true);
		labelResultadoNome.setBounds(355, 90, 300, 50);
//*** ------------------------------------------------------
	//**Label Resultado Idade
		JLabel labelResultadoIdade = new JLabel();
		labelResultadoIdade.setText("Idade do Aluno: ");
		labelResultadoIdade.setForeground(verdeEscuro);
		labelResultadoIdade.setOpaque(true);
		labelResultadoIdade.setBounds(355, 130, 200, 50);		
//*** ------------------------------------------------------
	//**Labels Resultado IMC
		JLabel labelImc = new JLabel();
		labelImc.setForeground(verdeEscuro);
		labelImc.setOpaque(true);
		labelImc.setText("IMC: ");
		labelImc.setBounds(355,170,200,50);
//*** ------------------------------------------------------
	//**Labels Resultado Status IMC
		JLabel labelStatusImc = new JLabel();
		labelStatusImc.setText("Status IMC: ");
		labelStatusImc.setForeground(verdeEscuro);
		labelStatusImc.setOpaque(true);
		labelStatusImc.setBounds(355,210,300,50);
//*** ------------------------------------------------------
	//**Labels Resultado NCD
		JLabel labelResultadoNcd = new JLabel();
		labelResultadoNcd.setText("NCD: ");
		labelResultadoNcd.setForeground(verdeEscuro);
		labelResultadoNcd.setOpaque(true);
		labelResultadoNcd.setBounds(355,250,200,50);
//*** ------------------------------------------------------		
	//**Ouvinte Botão Resultado
		buttonResultado.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Aluno a1 = new Aluno();

				a1.setNome((textFieldNome.getText()));
				a1.setAltura(Double.parseDouble(textFieldAltura.getText()));
				a1.setPeso(Double.parseDouble(textFieldPeso.getText()));
				a1.setNivelDeAtividade(comboAtividade.getSelectedItem().toString());
				a1.setSexo(radioFeminino.isSelected()? 'F':'M');
//*** ------------------------------------------------------		
				//**O que é isso? Não sei. Tive dificuldade com o tipo de variável e acabei aceitando a sugestão da IDE.		
				a1.setDataNascimento(LocalDate.of((int) (Double.parseDouble(textFieldAnoNascimento.getText())), (int)(Double.parseDouble(textFieldMesNascimento.getText())), (int)(Double.parseDouble(textFieldDiaNascimento.getText()))));	
		
				labelResultadoNome.setText("Nome do Aluno:  " + (a1.getNome()));
				labelResultadoIdade.setText("Idade do Aluno:  " + (a1.getIdade()));
				labelImc.setText("IMC:  "+ String.format("%.2f", a1.getImc()));
				labelStatusImc.setText("Status IMC:  "+ a1.getStatusImc());
				labelResultadoNcd.setText("NCD:  "+ String.format("%.2f", a1.getNcd()));						
			}
		});
//*** ------------------------------------------------------		
	//**Ouvinte Botão Limpar		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textFieldNome.setText("");
				textFieldDiaNascimento.setText("");
				textFieldMesNascimento.setText("");
				textFieldAnoNascimento.setText("");
				textFieldPeso.setText("");
				textFieldAltura.setText("");
				
				labelResultadoNome.setText("Nome do Aluno: ");
				labelResultadoIdade.setText("Idade do Aluno: ");
				labelImc.setText("IMC: ");
				labelStatusImc.setText("Status IMC: ");
				labelResultadoNcd.setText("NCD: ");			
			}
		});
//*** ------------------------------------------------------			
	//**ContentPane
		telaAluno.getContentPane().add(labelTitulo);
		telaAluno.getContentPane().add(labelNome);
		telaAluno.getContentPane().add(textFieldNome);
		telaAluno.getContentPane().add(labelSexo);
		telaAluno.getContentPane().add(labelDataNascimento);
		telaAluno.getContentPane().add(labelDiaNascimento);
		telaAluno.getContentPane().add(textFieldDiaNascimento);
		telaAluno.getContentPane().add(labelMesNascimento);
		telaAluno.getContentPane().add(textFieldMesNascimento);
		telaAluno.getContentPane().add(labelAnoNascimento);
		telaAluno.getContentPane().add(textFieldAnoNascimento);
		telaAluno.getContentPane().add(labelPeso);
		telaAluno.getContentPane().add(textFieldPeso);
		telaAluno.getContentPane().add(labelAltura);
		telaAluno.getContentPane().add(textFieldAltura);
		telaAluno.getContentPane().add(labelNivelAtividade);
		telaAluno.getContentPane().add(buttonResultado);
		telaAluno.getContentPane().add(buttonLimpar);
		telaAluno.getContentPane().add(labelSeparador);
		telaAluno.getContentPane().add(labelTituloResultado);
		telaAluno.getContentPane().add(labelResultadoNome);
		telaAluno.getContentPane().add(labelResultadoIdade);
		telaAluno.getContentPane().add(labelImc);
		telaAluno.getContentPane().add(labelStatusImc);
		telaAluno.getContentPane().add(labelResultadoNcd);
		telaAluno.getContentPane().add(comboAtividade);
		telaAluno.getContentPane().add(radioFeminino);
		telaAluno.getContentPane().add(radioMasculino);
//*** ------------------------------------------------------			
	//**Seta a Visualização da tela		
		telaAluno.setVisible(true);		
	}
}