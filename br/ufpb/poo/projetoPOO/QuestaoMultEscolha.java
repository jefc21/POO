package br.ufpb.poo.projetoPOO;

public class QuestaoMultEscolha extends Questao{	
	private int respostaProf;
	private String opA,opB,opC,opD;
	private String tipo="Mult";
	
	public QuestaoMultEscolha(){
		super();
	}

	public QuestaoMultEscolha(int numero,String  texto,String opA,String opB ,String opC,String opD,int Gabarito) {
		super(numero,texto);
		this.respostaProf = respostaProf;
		this.opA=opA;
		this.opB=opB;
		this.opC=opC;
		this.opD=opD;
	}

	public Object getRespostaProf() {
		return respostaProf;
	}

	public void setResposta(String respostaProf) {
		this.respostaProf =Integer.parseInt(respostaProf);
	}
	public String getTipo(){
		return this.tipo;
	}
	
	public void setTexto(String texto,String opA,String opB,String opC,String opD){
		this.texto=texto;
		this.opA=opA;
		this.opB=opB;
		this.opC=opC;
		this.opD=opD;
	}
	public String getTexto(){
		return this.texto+" "+this.opA+" "+this.opB+" "+this.opC+" "+this.opD;
	}
	
	public String toStringQuestao(){
		String questao=""+this.numero+") "+this.texto+"\n 1- "+this.opA+"\n 3- "+this.opB+"\n 5- "+this.opC+"\n 7- "+this.opD+"\n Digite a soma da(s) alternativa(s) correta(s).";
		return questao;
	}
	
}