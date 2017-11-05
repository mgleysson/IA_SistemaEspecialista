package br.ufal.ic;

public class Expressao {
	
	private Variavel variavel;
	private String operador;
	private String valor;
	private int idExpressao;
	
	public Expressao(int id, Variavel variavel, String operador, String valor) {
		this.variavel = variavel;
		this.operador = operador;
		this.valor = valor;
		this.idExpressao = id;
	}
	
	public int getIdExpressao() {
		return idExpressao;
	}

	public void setIdExpressao(int idExpressao) {
		this.idExpressao = idExpressao;
	}
	
	public Variavel getVariavel() {
		return variavel;
	}
	
	public void setVariavel(Variavel variavel) {
		this.variavel = variavel;
	}
	
	public String getOperador() {
		return operador;
	}
	
	public void setOperador(String operador) {
		this.operador = operador;
	}
	
	public String getValor() {
		return valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}

}
