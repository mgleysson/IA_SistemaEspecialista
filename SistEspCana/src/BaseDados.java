import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseDados {
	
	public List<Variavel> listaVariaveis = new ArrayList<Variavel>();
	public List<Expressao> listaExpressoes = new ArrayList<Expressao>();
	public List<Regra> listaRegras = new ArrayList<Regra>();
	
	public void criarBase() {
		
		listaVariaveis.add(new Variavel(0,"afinamento de colmos", "Os colmos est�o bastante finos?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(1,"apodrecimento do topo", "Os colmos est�o bastante finos?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(2,"�rea enxarcada", "A �rea apresenta enxarcamento?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(3,"aus�ncia de ra�zes secund�rias", "H� pouca ou nenhuma ra�z secund�ria?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(4,"bainha afetada", "As estrias se prolongam pela bainha?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(5,"baixa brota��o de gemas", "H� uma baixa brota��o de gemas, provocando falhas no plantio?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(6,"baixo teor de sacarose", "Houve uma redu��o no teor de sacarose das plantas?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(7,"brota��es de gemas laterais no colmo", "H� brota��es de gemas laterais no colmo?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(8,"brota��es do colmo com estrias brancas", "As brota��es no colmo possuem estrias brancas?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(9,"chicote com massa preta", "Ao romper a pel�cula do chicote, foi observado uma massa preta semelhante a p� de carv�o?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(10,"chicote com pel�cula prateada", "O chicote possui uma pel�cula prateada?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(11,"cor das estrias", "Qual a cor que melhor descreve as estrias?", Arrays.asList("amarelo-esbranqui�adas (clor�ticas)", "brancas","marrom-avermelhadas","vari�vel", "laranja-avermelhadas", "vermelhas", "amarelas"), false));
		listaVariaveis.add(new Variavel(12,"cor das manchas", "Qual a cor das manchas?", Arrays.asList("outras","verde-p�lidas","vermelhas"), false));
		listaVariaveis.add(new Variavel(13,"crescimento irregular", "As plantas apresentam crescimento irregular?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(14,"descolora��o nodal", "H� descolora��o dos tecidos nodais pr�ximos ao meristema apical?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(15,"descolora��o vascular nodal no colmo", "H� descolora��o vascular na regi�o nodal do colmo?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(16,"doen�a", "", Arrays.asList("podrid�o vermelha","podrid�o da casca","raquitismo da soqueira","estrias vermelhas","estrias pardas","gomose","mancha amarela","mancha ocular","ferrugem","podrid�o abacaxi","carv�o","podrid�o das ra�zes","estrias clor�ticas","estria mosqueada","mosaico","mancha anelar","mancha parda","escaldadura das folhas","amarelinho"), true));
		listaVariaveis.add(new Variavel(17,"encurtamento dos entre-n�s", "H� um encurtamento dos entre-n�s?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(18,"estrias acompanham nervuras secund�rias", "O sentido das estrias acompanham as nervuras secund�rias das folhas?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(19,"estrias coalescentes", "As estrias coalescem (juntam-se umas �s outras)?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(20,"filamento de esporos negros", "O colmo apresenta alguns filamentos de esporos negros?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(21,"folhas atingidas", "As folhas atingidas s�o:", Arrays.asList("somente as mais velhas", "jovens e velhas"), false));
		listaVariaveis.add(new Variavel(22,"folhas com estrias", "As folhas possuem estrias?", Arrays.asList("folhas maduras","todas as folhas","folhas jovens"), false));
		listaVariaveis.add(new Variavel(23,"folhas mais velhas amareladas", "As folhas mais velhas est�o amareladas, com a nervura central arroxeada?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(24,"forma da mancha", "O formato da mancha �:", Arrays.asList("eliptica", "irregular"), false));
		listaVariaveis.add(new Variavel(25,"forma das estrias", "Qual a forma que melhor descreve as estrias?", Arrays.asList("outras","estreitas de comprimento vari�vel","finas e longas"), false));
		listaVariaveis.add(new Variavel(26,"gemas laterais com chicotes", "As gemas laterais possuem hastes pontiagudas no �pice, semelhantes a um chicote?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(27,"halo marrom", "Em torno das  manchas mais velhas, nota-se a presen�a de um halo amarronzado?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(28,"manchas coalescentes", "As manchas coalescem (juntam-se umas �s outras)?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(29,"manchas internas na regi�o dos n�s", "H� manchas internas na regi�o do n�s, de colora��o vermelho-escuro a parda?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(30,"manchas na nervura central", "H� manchas na nervura central?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(31,"manchas na parte interna do colmo", "H� manchas vermelhas intercalas com manchas brancas na parte interna do colmo?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(32,"margens indefinidas", "As margens das estrias s�o indefinidas?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(33,"morte dos ponteiros", "Algumas plantas est�o com os ponteiros mortos?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(34,"necrose de folhas", "As estrias mais velhas est�o necrosadas?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(35,"nervura central da folha amarelada", "A nervura central das folhas est�o amareladas?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(36,"nervura central das folhas adocicadas", "A nervura central das folhas tem gosto adocicado?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(37,"odor de abacaxi", "O rebolo apresenta um odor t�pico de abacaxi e �cido ac�tico?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(38,"odor de �cido ac�tico no colmo", "O colmo apresenta odor de �cido ac�tico (semelhante a abacaxi)?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(39,"odor f�tido", "A planta apresenta odor f�tido?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(40,"parte da folha com estrias", "Foram encontradas estrias nas seguintes partes das folhas:", Arrays.asList("todo o limbo", "somente extremidade distral"), false));
		listaVariaveis.add(new Variavel(41,"perfilhamento", "O perfilhamento �:", Arrays.asList("regular","irregular"), false));
		listaVariaveis.add(new Variavel(42,"plantas arrancadas facilmente", "As plantas podem ser arrancadas quando puxadas pelo colmo?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(43,"plantas raqu�ticas", "As plantas apresentam sintomas de raquitismo (crescimento irregular, poucos perfilhos, colmos finos e baixa produ��o)?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(44,"pontos internos basais", "Internamente, a parte basal dos n�s apresentam v�rgulas ou pontos de cor alaranjado-claro a avermelhado-escuro?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(45,"preju�zo", "H� preju�zo ao desenvolvimento da planta?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(46,"presen�a de brocas", "A planta est� brocada (perfurada)?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(47,"presen�a de chicote", "No �pice da planta existe uma haste pontiaguda semelhante a um chicote?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(48,"presen�a de esporos", "Foi observada a presen�a de esporos na parte inferior da folha?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(49,"presen�a de estrias nas folhas", "H� estrias nas folhas?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(50,"presen�a de exsuda��o", "As folhas apresentam exsuda��o bacteriana?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(51,"presen�a de halo clor�tico", "h� halos clor�ticos (sem colora��o) em volta das manchas?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(52,"presen�a de manchas nas folhas", "H� manchas nas folhas?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(53,"presen�a de mic�lio", "Foi notado a presen�a de mic�lio (fungos) na parte inferior das folhas?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(54,"presen�a de p�stulas", "H� presen�a de p�stulas (esporos) em alto relevo na face inferior das folhas?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(55,"rabo de cometa", "As estrias apresentam-se em forma de rabo de cometa?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(56,"ra�zes com extremidade avermelhadas", "As ra�zes mais novas apresentam extremidades avermelhadas?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(57,"ra�zes pobres e superficiais", "O sistema radicular da planta tem poucas ra�zes, sendo estas superficiais?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(58,"rebolo apodrecido", "O rebolo est� apodrecido, tendo iniciado pelas extremidades?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(59,"rebolos destru�dos", "O rebolo est� destru�do, restando somente a casca e feixes fibro vasculares?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(60,"sintoma de mosaico", "H� manchas verde-p�lidas entremeadas no verde normal da folha, lembrando um mosaico?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(61,"superbrotamento de touceiras", "H� um superbrotamento de touceiras?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(62,"tipo de estrias", "As estrias s�o:", Arrays.asList("alongadas", "pequenas"), false));
		listaVariaveis.add(new Variavel(63,"touceiras pouco desenvolvidas", "As touceiras afetadas est�o subdesenvolvidas?", Arrays.asList("sim", "n�o"), false));
		
		/*
		 *  Modelo de como fazer a adi��o na lista de express�es:
		 *  listaExpressoes.add(new Expressao(variavel, operador, valor));
		 *  
		 *  onde o parametro variavel referencia uma variavel na lista de variaveis acima;
		 *  o operador usado pela base de regras sempre � o = ;
		 *  e o valor � o valor da variavel obtido a partir de cada regra 
		 */
		
		// EXEMPLO PARA AS EXPRESS�ES DA REGRA 1:
		// TOMAR CUIDADO PARA N�O CADASTRAR EXPRESS�ES REPETIDAS, ACHO QUE ALGUMAS SE REPETEM NAS DIFERENTES REGRAS!
		
		listaExpressoes.add(new Expressao(listaVariaveis.get(49), "=", "sim"));
		// listaVariaveis.get(49) => buscando a vari�vel de indice 49 da lista de vari�veis acima
		//que � justamente a vari�vel procurada: "presen�a de estrias nas folha" 
		
		//Fazer isso para as demais express�es presentes em todas as regras!
		
	}
	
	
	
	

}
