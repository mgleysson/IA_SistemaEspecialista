
public class MotorInferencia {
	
	/*

		Iterar sobre cada regra fazendo as perguntas para o usu�rio e salva as informa��es na base de fatos.
		
		Se uma condi��o n�o for aceita a regra em quest�o � rejeitada e pula pra pr�xima regra.
		
		Se todas as condi��es forem aceitas, a conclus�o � v�lida.
		
		
	*/
	
	public void startMachine() {
		
		// Teste para ver se cadastrou as 64 vari�veis existentes
		
		BaseDados baseDados = new BaseDados();
		baseDados.criarBase();
		System.out.println(baseDados.listaVariaveis.size());
		
	}
	

}
