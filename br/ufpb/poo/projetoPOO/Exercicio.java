package br.ufpb.poo.projetoPOO;

import java.util.ArrayList;
import java.util.List;

public class Exercicio {
	private int cod;
	private String descricao;
	List<Questao> questoes;
	
	public Exercicio() {
		questoes=new ArrayList<Questao>();
	}
	
	public Exercicio(int codico,String texto){
		this.cod=codico;
		this.descricao=texto;
		questoes=new ArrayList<Questao>();
	}
	
	public void setCod(int codico){
		this.cod=codico;
	}
	
	public int getCod(){
		return cod;
	}
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String texto) {
		this.descricao = texto;
	}	

	public void CadastraQuestao(Questao q){
		questoes.add(q);
	}
	
	public Questao pesquisaQuestao(int numero)throws QuestaoInexistente{
		for(Questao q:questoes){
			if(q.getNumero()==numero){
				return q;
			}
		}
		throw new QuestaoInexistente("Questao com este numero não encontrado");
	}
	
	public List<Questao> pesquisaQuestaoVouF(){
		List<Questao> q=new ArrayList<Questao>();
		for(Questao questao:questoes){
			if(questao.getTipo().equals("VouF")){
				q.add(questao);
			}
		}	
		return q;
	}	
	
	public List<Questao> pesquisaQuestaoDissetativa(){
		List<Questao> q=new ArrayList<Questao>();
		for(Questao questao:questoes){
			if(questao.getTipo().equals("Dissertativa")){
				q.add(questao);
			}
		}	
		return q;
	}
	
	public List<Questao> pesquisaQuestaoMultEscolha(){
		List<Questao> q=new ArrayList<Questao>();
		for(Questao questao:questoes){
			if(questao.getTipo().equals("Mult")){
				q.add(questao);
			}
		}	
		return q;
	}
	
	public List<Object> pesquisaRespostaProf(){
		List<Object> q=new ArrayList<Object>();
		for(Questao questao:questoes){
			q.add(questao.getRespostaProf());	
		}	
		return q;
	}
	
	public String respostaProfToString(){
		return this.pesquisaRespostaProf().toString();
	}
	
	public String toStringExercicio(){
		String exercicio="Codigo:"+this.cod+"  "+this.descricao;
		return exercicio;
	}
}
