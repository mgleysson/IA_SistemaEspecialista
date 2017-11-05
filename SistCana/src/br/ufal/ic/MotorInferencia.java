package br.ufal.ic;

import java.io.LineNumberInputStream;
import java.util.Scanner;

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
		
		for (Regra regras : baseDados.listaRegras) {
			
			System.out.println("\n\nRegra " + contador++);
			System.out.println("--------");
			for (Expressao expressoes : regras.getExpressoes()) {
				System.out.println(expressoes.getVariavel().getVarNome() + " " + expressoes.getOperador() + " " + expressoes.getValor());
			}
			
			System.out.println("\n\nS�o apresentados todos os sintomas acima sem exce��o? ");
			System.out.println("1 - Sim\n2 - N�o");
			int opc = reader.nextInt();
			
			if (opc == 1){
				System.out.println("\nUma doen�a foi diagnosticada! A Base de Fatos foi atualizada com sucesso.");
				baseFatos.listaFatos.add(regras.getConclusao());
			}else{
				System.out.println("\nRegra Ignorada... Pr�xima regra:");
			}
			
		}
		
		System.out.println("\n\n------------------------------------------");
		System.out.println("==> Lista de doen�as diagnosticadas: <==\n");
		
		for (String doencas: baseFatos.listaFatos) {
			
			System.out.println(">> "+ doencas.toString());
			
		}
		
		System.out.println("\n\nUm total de "+ baseFatos.listaFatos.size() + " doen�as foram diagnosticadas.");
		
		System.out.println("------------------------------------------");
		
	}
	

}
