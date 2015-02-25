package br.ufpb.poo.projetoPOO;

import java.io.IOException;
import java.util.List;

public class teste {

	public static void main(String[] args) throws IOException {
		GravadorELeitorAquivo arquivo=new GravadorELeitorAquivo();
		//arquivo.leitorArquivo();
				 
		//Exercicio e=new Exercicio();
		
		QuestaoVouF v=new QuestaoVouF(1,"Hoje é sabado?",true);
		QuestaoDissertativa d=new QuestaoDissertativa(2, "Hoje é ?","sábado");
		QuestaoMultEscolha m=new QuestaoMultEscolha(1,"Quantos Mundiais o Brasil tem no futebol?", "2 Mundias", "5 Mundias", "6 Mundias", "4 Mundias", 5);
		Questao q= new Questao();
		
		Exercicio exer=new Exercicio();
		
		exer.setCod(002);
		exer.setDescricao("lista 2 de exercicio");
		exer.CadastraQuestao(v);
		exer.CadastraQuestao(d);
		exer.CadastraQuestao(m);
		
		SistemaQuiz G=new SistemaQuiz();
		G.cadastraExercicio(exer);
		List<Exercicio> ListaExer=G.exercicios;
		
		arquivo.gravaExercicios(ListaExer);
		
		arquivo.leitorArquivo();
		String a=arquivo.exer.get(0).respostaProfToString();
		
		
		System.out.println(exer.toStringExercicio());
		
		
		
	}
}
