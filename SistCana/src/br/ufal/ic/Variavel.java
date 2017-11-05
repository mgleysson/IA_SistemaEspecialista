package br.ufal.ic;
import java.util.List;

public class Variavel {
	
	private int idVar;
	private String varNome;
	private String varPergunta;
	private List<String> varValores;
	private boolean varOjetivo;
	
	
	public boolean isVarOjetivo() {
		return varOjetivo;
	}

	public void setVarOjetivo(boolean varOjetivo) {
		this.varOjetivo = varOjetivo;
	}

	public Variavel(int idVar, String varNome, String varPergunta, List<String> varValores, boolean varObjetivo) {
		this.idVar = idVar;
		this.varNome = varNome;
		this.varPergunta = varPergunta;
		this.varValores = varValores;
		this.varOjetivo = varObjetivo;
	}
	
	public int getIdVar() {
		return idVar;
	}

	public void setIdVar(int idVar) {
		this.idVar = idVar;
	}

	public String getVarNome() {
		return varNome;
	}
	public void setVarNome(String varNome) {
		this.varNome = varNome;
	}
	public String getVarPergunta() {
		return varPergunta;
	}
	public void setVarPergunta(String varPergunta) {
		this.varPergunta = varPergunta;
	}
	

}
