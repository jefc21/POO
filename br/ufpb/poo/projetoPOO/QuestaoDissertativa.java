package br.ufpb.poo.projetoPOO;

public class QuestaoDissertativa extends Questao {
	private String respostaProf;
	private String tipo="Dissertativa";
	
	public QuestaoDissertativa(){
		super();
	}

	public QuestaoDissertativa(int numero,String  texto,String respostaProf) {
		super(numero,texto);
		this.respostaProf = respostaProf;
	}

	public String getResposta() {
		return respostaProf;
	}

	public void setResposta(String respostaProf) {
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