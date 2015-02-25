package br.ufpb.poo.projetoPOO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class GravadorELeitorAquivo {
	private String nomeArquivo;
	List<Exercicio> exer;
	
	public GravadorELeitorAquivo(){
		nomeArquivo="Arq.txt";
		exer=new ArrayList<Exercicio>();
	}
	
//Leitor de Arquivo txt.
	public List<Exercicio> leitorArquivo()throws IOException{
		BufferedReader leitor=null;
		try{
			leitor=new BufferedReader(new FileReader(nomeArquivo));
			int QuantExercicio=Integer.parseInt(leitor.readLine());
			for(int m=0;m<QuantExercicio;m++){
				Exercicio exercicio=new Exercicio();
				int cod=Integer.parseInt(leitor.readLine());
				String texto=leitor.readLine();
				exercicio.setCod(cod);
				exercicio.setDescricao(texto);
				int quantQuestao=Integer.parseInt(leitor.readLine());
				for(int f=0;f<quantQuestao;f++){
					Questao quest;
					String tipo=leitor.readLine();
					if(tipo.equals("Mult")){
						int num=Integer.parseInt(leitor.readLine());
						StringTokenizer perg=new StringTokenizer(leitor.readLine());
						int resposta=Integer.parseInt(leitor.readLine());
						quest=new QuestaoMultEscolha(num,perg.nextToken(),perg.nextToken(),perg.nextToken(),perg.nextToken(),perg.nextToken(),resposta);
					}
					else if(tipo.equals("VouF")){
						int num=Integer.parseInt(leitor.readLine());
						String pergunta=leitor.readLine();
						boolean resposta=Boolean.parseBoolean(leitor.readLine());
						quest=new QuestaoVouF(num,pergunta,resposta);				
					}
					else{
						int num=Integer.parseInt(leitor.readLine());
						String pergunta=leitor.readLine();
						String resposta=leitor.readLine();
						quest=new QuestaoDissertativa(num,pergunta,resposta);
					}
					exercicio.CadastraQuestao(quest);
				}
				exer.add(exercicio);
			}
			return exer;
		}
		finally{
			if(leitor!=null){
				leitor.close();
			}
		}
	}
	
//Gravador de Arquivo txt.	
	public void gravaExercicios(List<Exercicio> exercicios)throws IOException{
		BufferedWriter gravador=null;
		try{
			gravador=new BufferedWriter(new FileWriter(nomeArquivo));
			gravador.write(""+exercicios.size()+"\n");
			for(Exercicio exer: exercicios){
				gravador.write(""+exer.getCod()+"\n");
				gravador.write(""+exer.getDescricao()+"\n");
				gravador.write(""+exer.questoes.size()+"\n");
				for(Questao quest: exer.questoes){
					gravador.write(""+quest.getTipo()+"\n");
					gravador.write(""+quest.getNumero()+"\n");
					gravador.write(""+quest.getTexto()+"\n");
					gravador.write(""+quest.getRespostaProf()+"\n");
				}
			}
		}
		finally{
			if(gravador!=null){
				gravador.close();
			}
		}
	}
}