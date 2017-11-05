package br.ufal.ic;

//import java.io.LineNumberInputStream;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MotorInferencia {
	
	Scanner reader = new Scanner(System.in);
	int contador = 1;
	
	/*

		Iterar sobre cada regra fazendo as perguntas para o usuário e salva as informações na base de fatos.
		
		Se uma condição não for aceita a regra em questão é rejeitada e pula pra próxima regra.
		
		Se todas as condições forem aceitas, a conclusão é válida.
		
		
	*/
	
	public void startMachine() {
		
		// Teste para ver se cadastrou as 64 variáveis existentes
		
		BaseDados baseDados = new BaseDados();
		BaseFatos baseFatos = new BaseFatos();
		
		baseDados.criarBase();
		String MinhasRegras;
		
		for (Regra regras : baseDados.listaRegras) {
			
			MinhasRegras = "";
			for (Expressao expressoes : regras.getExpressoes()) {
				MinhasRegras += expressoes.getVariavel().getVarNome() + " " + expressoes.getOperador() + " " + expressoes.getValor() + "\n";
			}
			
			MinhasRegras += "\n\nSão apresentados todos os sintomas acima sem exceção? \n\n";
					
			int reply = JOptionPane.showConfirmDialog(null, MinhasRegras, "\n\nRegra " + contador++, JOptionPane.YES_NO_OPTION);
	        if (reply == JOptionPane.YES_OPTION) {
			  baseFatos.listaFatos.add(regras.getConclusao());
	        }
			
		}
		
		String MinhasDoencas = "";
		
		for (String doencas: baseFatos.listaFatos) {
			
			MinhasDoencas += doencas.toString() + "\n";
			
		}
		MinhasDoencas += "\n\nUm total de "+ baseFatos.listaFatos.size() + " doenças foram diagnosticadas.\n\n";
				
		JOptionPane.showConfirmDialog(null, MinhasDoencas, "Lista de doenças diagnosticadas: \n", JOptionPane.PLAIN_MESSAGE);
	}
	

}
