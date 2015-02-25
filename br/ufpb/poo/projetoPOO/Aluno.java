package br.ufpb.poo.projetoPOO;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	public String nome;
	public int matricula;
	public Exercicio exer;

	public Aluno(String nome,int matricula){
		this.nome=nome;
		this.matricula=matricula;
	}
	public void setNome(String nome){
		this.nome=nome;
	}
	public void setMatricula(int matricula){
		this.matricula=matricula;
	}
	public String getNome(){
		return nome;
	}
	public int getMatricula(){
		return matricula;
	}
	
	public void setExer(Exercicio exer){
		this.exer=exer;
	}
	
	public String resolverExercicio(){
		return exer.toStringExercicio();
	}
	
}
