package br.ufpb.poo.projetoPOO;

public class Professor {	
	public String nome;
	public int matricula;

	public Professor(String nome,int matricula){
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
}
