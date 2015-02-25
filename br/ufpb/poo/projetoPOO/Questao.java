package br.ufpb.poo.projetoPOO;

import java.util.Collection;

public class Questao {
	protected String texto;
	protected int numero;
	private String tipo;
	private String respostaProf;
	
	public Questao(){
		
	}
	public Questao(int numero,String  texto){
		this.texto=texto;
		this.numero=numero;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTipo(){
		return this.tipo;
	}
	public void setRespostaProf(String respostaProf){
		this.respostaProf=respostaProf;
	}
	
	public Object getRespostaProf(){
		return respostaProf;
	}
	
	public String toStringQuestao(){
		return "";
	}
	
}