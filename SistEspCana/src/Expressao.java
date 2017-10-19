
public class Expressao {
	
	Variavel variavel;
	String operador;
	String valor;
	
	public Expressao(Variavel variavel, String operador, String valor) {
		this.variavel = variavel;
		this.operador = operador;
		this.valor = valor;
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
