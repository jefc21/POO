package br.ufpb.poo.projetoPOO;

public class QuestaoVouF extends Questao {
	private boolean respostaProf;
	private String tipo="VouF";
	
	public QuestaoVouF(){
		super();
	}

	public QuestaoVouF(int numero,String  texto,boolean respostaProf) {
		super(numero,texto);
		this.respostaProf = respostaProf;
	}

	public Object getRespostaProf() {
		return respostaProf;
	}

	public void setRespostaProf(boolean respostaProf) {
		this.respostaProf = respostaProf;
	}
	public String getTipo(){
		return this.tipo;
	}
	
	public String toStringQuestao(){
		String questao=""+this.numero+") "+this.texto;
		return questao;
	}
	
}