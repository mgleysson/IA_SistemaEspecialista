package br.ufal.ic;
import java.util.List;

public class Regra {
	
	private int idRegra;
	private List<Expressao> expressoes;
	private String conclusao;
	
	public Regra(int idRegra, List<Expressao> expressoes, String conclusao) {
		this.expressoes = expressoes;
		this.conclusao = conclusao;
		this.idRegra = idRegra;
	}
	
	public int getIdRegra() {
		return idRegra;
	}

	public void setIdRegra(int idRegra) {
		this.idRegra = idRegra;
	}
	
	public List<Expressao> getExpressoes() {
		return expressoes;
	}

	public void setExpressoes(List<Expressao> expressoes) {
		this.expressoes = expressoes;
	}

	public String getConclusao() {
		return conclusao;
	}

	public void setConclusao(String conclusao) {
		this.conclusao = conclusao;
	}

}
