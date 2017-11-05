package br.ufal.ic;

//import java.io.LineNumberInputStream;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MotorInferencia {
	
	Scanner reader = new Scanner(System.in);
	int contador = 1;
	
	/*

		Iterar sobre cada regra fazendo as perguntas para o usu�rio e salva as informa��es na base de fatos.
		
		Se uma condi��o n�o for aceita a regra em quest�o � rejeitada e pula pra pr�xima regra.
		
		Se todas as condi��es forem aceitas, a conclus�o � v�lida.
		
		
	*/
	
	public void startMachine() {
		
		// Teste para ver se cadastrou as 64 vari�veis existentes
		
		BaseDados baseDados = new BaseDados();
		BaseFatos baseFatos = new BaseFatos();
		
		baseDados.criarBase();
		String MinhasRegras;
		
		for (Regra regras : baseDados.listaRegras) {
			
			MinhasRegras = "";
			for (Expressao expressoes : regras.getExpressoes()) {
				MinhasRegras += expressoes.getVariavel().getVarNome() + " " + expressoes.getOperador() + " " + expressoes.getValor() + "\n";
			}
			
			MinhasRegras += "\n\nS�o apresentados todos os sintomas acima sem exce��o? \n\n";
					
			int reply = JOptionPane.showConfirmDialog(null, MinhasRegras, "\n\nRegra " + contador++, JOptionPane.YES_NO_OPTION);
	        if (reply == JOptionPane.YES_OPTION) {
			  baseFatos.listaFatos.add(regras.getConclusao());
	        }
			
		}
		
		String MinhasDoencas = "";
		
		for (String doencas: baseFatos.listaFatos) {
			
			MinhasDoencas += doencas.toString() + "\n";
			
		}
		MinhasDoencas += "\n\nUm total de "+ baseFatos.listaFatos.size() + " doen�as foram diagnosticadas.\n\n";
				
		JOptionPane.showConfirmDialog(null, MinhasDoencas, "Lista de doen�as diagnosticadas: \n", JOptionPane.PLAIN_MESSAGE);
	}
	

}
