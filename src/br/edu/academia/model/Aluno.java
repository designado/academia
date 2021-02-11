package br.edu.academia.model;

import java.time.LocalDate;
import java.time.Period;


// Criação da Classe para o Aluno e suas respectivas propriedades
public class Aluno {
	
	private String nome;
	private LocalDate dataNascimento;
	private char sexo;
	private double peso;
	private double altura;
	private String nivelDeAtividade;
//*** ------------------------------------------------------
//***Getters and Setters
	public void setNome(String nome) {
		this.nome =nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento =dataNascimento;
	}
	public LocalDate getDataNascimento() {
		return this.dataNascimento;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public char getSexo() {
		return this.sexo;
	}
	public void setPeso(double peso) {
		this.peso =peso;
	}
	public double getPeso() {
		return this.peso;
	}
	public void setAltura(double altura) {
		this.altura =altura;
	}
	public double getAltura() {
		return this.altura;
	}
	public void setNivelDeAtividade(String nivelDeAtividade) {
		this.nivelDeAtividade =nivelDeAtividade;
	}
	public String getNivelDeAtividade() {
		return this.nivelDeAtividade;
	}
//*** ------------------------------------------------------
	//***Método que calcula a idade do aluno
	public int getIdade(){
		LocalDate hoje = LocalDate.now();
		Period periodo = Period.between (this.dataNascimento, hoje); 
		return periodo.getYears();
	}
//*** ------------------------------------------------------	
	//***Método que calcula a IMC do aluno
	public double getImc() {
		return this.peso/(this.altura*this.altura);
	}
//*** ------------------------------------------------------
	//***Método que calcula avalia o resultado do IMC e converte em Status---------
	public String getStatusImc() {
		if(this.getImc()<=18.6) {
			return "Abaixo do peso";
		}else if(this.getImc()>18.6 && this.getImc()<25) {
			return "Peso Normal";
		}else if(this.getImc()>=25 && this.getImc()<30) {
			return "Levemente acima do peso";
		}else if(this.getImc()>=30 && this.getImc()<35) {
			return "Obesidade grau I";
		}else if(this.getImc()>=35 && this.getImc()<40) {
			return "Obesidade grau II (severa)";
		}else {
		return "Obesidade grau III (mórbida)";
 		}
	}
//*** ------------------------------------------------------	
	//***Método que calcula o índice de NCD---------	
	public double getNcd() {
		if(this.getSexo()=='M' && this.getIdade()>=18 && this.getIdade()<=30 && this.getNivelDeAtividade()=="Nenhuma") {
			return 15.3 * getPeso() + 679;		
		}else if(this.getSexo()=='M' && this.getIdade()>=18 && this.getIdade()<=30 && this.getNivelDeAtividade()=="Leve") {
			return (15.3 * getPeso() + 679)*1.5;	
		}else if(this.getSexo()=='M' && this.getIdade()>=18 && this.getIdade()<=30 && this.getNivelDeAtividade()=="Moderada") {
			return (15.3 * getPeso() + 679)*1.8;				
		}else if(this.getSexo()=='M' && this.getIdade()>=18 && this.getIdade()<=30 && this.getNivelDeAtividade()=="Intensa") {
			return (15.3 * getPeso() + 679)*2.1;				
		}else if(this.getSexo()=='M' && this.getIdade()>=31 && this.getIdade()<=60 && this.getNivelDeAtividade()=="Nenhuma") {
			return 11.6 * getPeso() + 879;			
		}else if(this.getSexo()=='M' && this.getIdade()>=31 && this.getIdade()<=60 && this.getNivelDeAtividade()=="Leve") {			
			return (11.6 * getPeso() + 879)*1.5;			
		}else if(this.getSexo()=='M' && this.getIdade()>=31 && this.getIdade()<=60 && this.getNivelDeAtividade()=="Moderada") {			
			return (11.6 * getPeso() + 879)*1.8;			
		}else if(this.getSexo()=='M' && this.getIdade()>=31 && this.getIdade()<=60 && this.getNivelDeAtividade()=="Intensa") {			
			return (11.6 * getPeso() + 879)*2.1;
		}else if(this.getSexo()=='M' && this.getIdade()>=60  && this.getNivelDeAtividade()=="Nenhuma") {
			return 13.5 * getPeso() + 487;				
		}else if(this.getSexo()=='M' && this.getIdade()>=60  && this.getNivelDeAtividade()=="Leve") {			
			return (13.5 * getPeso() + 487)*1.5;
		}else if(this.getSexo()=='M' && this.getIdade()>=60  && this.getNivelDeAtividade()=="Moderada") {			
			return (13.5 * getPeso() + 487)*1.8;
		}else if(this.getSexo()=='M' && this.getIdade()>=60  && this.getNivelDeAtividade()=="Intensa") {			
			return (13.5 * getPeso() + 487)*2.1;	
		}if(this.getSexo()=='F' && this.getIdade()>=18 && this.getIdade()<=30 && this.getNivelDeAtividade()=="Nenhuma") {
			return 14.7 * getPeso() + 496;		
		}else if(this.getSexo()=='F' && this.getIdade()>=18 && this.getIdade()<=30 && this.getNivelDeAtividade()=="Leve") {
			return (14.7 * getPeso() + 496)*1.6;	
		}else if(this.getSexo()=='F' && this.getIdade()>=18 && this.getIdade()<=30 && this.getNivelDeAtividade()=="Moderada") {
			return (14.7 * getPeso() + 496)*1.6;				
		}else if(this.getSexo()=='F' && this.getIdade()>=18 && this.getIdade()<=30 && this.getNivelDeAtividade()=="Intensa") {
			return (14.7 * getPeso() + 496)*1.8;				
		}else if(this.getSexo()=='F' && this.getIdade()>=31 && this.getIdade()<=60 && this.getNivelDeAtividade()=="Nenhuma") {
			return 8.7 * getPeso() + 829;			
		}else if(this.getSexo()=='F' && this.getIdade()>=31 && this.getIdade()<=60 && this.getNivelDeAtividade()=="Leve") {			
			return (8.7 * getPeso() + 829)*1.6;			
		}else if(this.getSexo()=='F' && this.getIdade()>=31 && this.getIdade()<=60 && this.getNivelDeAtividade()=="Moderada") {			
			return (8.7 * getPeso() + 829)*1.6;			
		}else if(this.getSexo()=='F' && this.getIdade()>=31 && this.getIdade()<=60 && this.getNivelDeAtividade()=="Intensa") {			
			return (8.7 * getPeso() + 829)*1.8;
		}else if(this.getSexo()=='F' && this.getIdade()>=60  && this.getNivelDeAtividade()=="Nenhuma") {
			return 10.5 * getPeso() + 596;				
		}else if(this.getSexo()=='F' && this.getIdade()>=60  && this.getNivelDeAtividade()=="Leve") {			
			return (10.5 * getPeso() + 596)*1.6;
		}else if(this.getSexo()=='F' && this.getIdade()>=60  && this.getNivelDeAtividade()=="moderada") {			
			return (10.5 * getPeso() + 596)*1.6;
		}else {			
			return (10.5 * getPeso() + 596)*1.8;			
		}
	}
}