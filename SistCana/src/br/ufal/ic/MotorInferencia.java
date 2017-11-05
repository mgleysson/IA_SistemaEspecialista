package br.ufal.ic;

import java.io.LineNumberInputStream;
import java.util.Scanner;

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
		
		for (Regra regras : baseDados.listaRegras) {
			
			System.out.println("\n\nRegra " + contador++);
			System.out.println("--------");
			for (Expressao expressoes : regras.getExpressoes()) {
				System.out.println(expressoes.getVariavel().getVarNome() + " " + expressoes.getOperador() + " " + expressoes.getValor());
			}
			
			System.out.println("\n\nSão apresentados todos os sintomas acima sem exceção? ");
			System.out.println("1 - Sim\n2 - Não");
			int opc = reader.nextInt();
			
			if (opc == 1){
				System.out.println("\nUma doença foi diagnosticada! A Base de Fatos foi atualizada com sucesso.");
				baseFatos.listaFatos.add(regras.getConclusao());
			}else{
				System.out.println("\nRegra Ignorada... Próxima regra:");
			}
			
		}
		
		System.out.println("\n\n------------------------------------------");
		System.out.println("==> Lista de doenças diagnosticadas: <==\n");
		
		for (String doencas: baseFatos.listaFatos) {
			
			System.out.println(">> "+ doencas.toString());
			
		}
		
		System.out.println("\n\nUm total de "+ baseFatos.listaFatos.size() + " doenças foram diagnosticadas.");
		
		System.out.println("------------------------------------------");
		
	}
	

}
