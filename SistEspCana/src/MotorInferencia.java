
public class MotorInferencia {
	
	/*

		Iterar sobre cada regra fazendo as perguntas para o usuário e salva as informações na base de fatos.
		
		Se uma condição não for aceita a regra em questão é rejeitada e pula pra próxima regra.
		
		Se todas as condições forem aceitas, a conclusão é válida.
		
		
	*/
	
	public void startMachine() {
		
		// Teste para ver se cadastrou as 64 variáveis existentes
		
		BaseDados baseDados = new BaseDados();
		baseDados.criarBase();
		System.out.println(baseDados.listaVariaveis.size());
		
	}
	

}
