package br.ufal.ic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseDados {

	public List<Variavel> listaVariaveis = new ArrayList<Variavel>();

	public List<Expressao> listaExpressoes = new ArrayList<Expressao>();

	public List<Regra> listaRegras = new ArrayList<Regra>();
	public List<Expressao> listaExprR1 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR2 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR3 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR4 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR5 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR6 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR7 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR8 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR9 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR10 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR11 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR12 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR13 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR14 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR15 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR16 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR17 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR18 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR19 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR20 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR21 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR22 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR23 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR24 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR25 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR26 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR27 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR28 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR29 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR30 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR31 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR32 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR33 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR34 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR35 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR36 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR37 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR38 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR39 = new ArrayList<Expressao>();
	public List<Expressao> listaExprR40 = new ArrayList<Expressao>();

	public void criarBase() {

		listaVariaveis.add(new Variavel(0, "afinamento de colmos", "Os colmos est�o bastante finos?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(1, "apodrecimento do topo", "Os colmos est�o bastante finos?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(2, "�rea enxarcada", "A �rea apresenta enxarcamento?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(3, "aus�ncia de ra�zes secund�rias", "H� pouca ou nenhuma ra�z secund�ria?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(4, "bainha afetada", "As estrias se prolongam pela bainha?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(5, "baixa brota��o de gemas",
				"H� uma baixa brota��o de gemas, provocando falhas no plantio?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(6, "baixo teor de sacarose",
				"Houve uma redu��o no teor de sacarose das plantas?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(7, "brota��es de gemas laterais no colmo",
				"H� brota��es de gemas laterais no colmo?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(8, "brota��es do colmo com estrias brancas",
				"As brota��es no colmo possuem estrias brancas?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(9, "chicote com massa preta",
				"Ao romper a pel�cula do chicote, foi observado uma massa preta semelhante a p� de carv�o?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(10, "chicote com pel�cula prateada", "O chicote possui uma pel�cula prateada?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(11, "cor das estrias",
				"Qual a cor que melhor descreve as estrias?", Arrays.asList("amarelo-esbranqui�adas (clor�ticas)",
						"brancas", "marrom-avermelhadas", "vari�vel", "laranja-avermelhadas", "vermelhas", "amarelas"),
				false));
		listaVariaveis.add(new Variavel(12, "cor das manchas", "Qual a cor das manchas?",
				Arrays.asList("outras", "verde-p�lidas", "vermelhas"), false));
		listaVariaveis.add(new Variavel(13, "crescimento irregular", "As plantas apresentam crescimento irregular?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(14, "descolora��o nodal",
				"H� descolora��o dos tecidos nodais pr�ximos ao meristema apical?", Arrays.asList("sim", "n�o"),
				false));
		listaVariaveis.add(new Variavel(15, "descolora��o vascular nodal no colmo",
				"H� descolora��o vascular na regi�o nodal do colmo?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(16, "doen�a", "",
				Arrays.asList("podrid�o vermelha", "podrid�o da casca", "raquitismo da soqueira", "estrias vermelhas",
						"estrias pardas", "gomose", "mancha amarela", "mancha ocular", "ferrugem", "podrid�o abacaxi",
						"carv�o", "podrid�o das ra�zes", "estrias clor�ticas", "estria mosqueada", "mosaico",
						"mancha anelar", "mancha parda", "escaldadura das folhas", "amarelinho"),
				true));
		listaVariaveis.add(new Variavel(17, "encurtamento dos entre-n�s", "H� um encurtamento dos entre-n�s?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(18, "estrias acompanham nervuras secund�rias",
				"O sentido das estrias acompanham as nervuras secund�rias das folhas?", Arrays.asList("sim", "n�o"),
				false));
		listaVariaveis.add(new Variavel(19, "estrias coalescentes", "As estrias coalescem (juntam-se umas �s outras)?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(20, "filamento de esporos negros",
				"O colmo apresenta alguns filamentos de esporos negros?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(21, "folhas atingidas", "As folhas atingidas s�o:",
				Arrays.asList("somente as mais velhas", "jovens e velhas"), false));
		listaVariaveis.add(new Variavel(22, "folhas com estrias", "As folhas possuem estrias?",
				Arrays.asList("folhas maduras", "todas as folhas", "folhas jovens"), false));
		listaVariaveis.add(new Variavel(23, "folhas mais velhas amareladas",
				"As folhas mais velhas est�o amareladas, com a nervura central arroxeada?", Arrays.asList("sim", "n�o"),
				false));
		listaVariaveis.add(new Variavel(24, "forma da mancha", "O formato da mancha �:",
				Arrays.asList("eliptica", "irregular"), false));
		listaVariaveis.add(new Variavel(25, "forma das estrias", "Qual a forma que melhor descreve as estrias?",
				Arrays.asList("outras", "estreitas de comprimento vari�vel", "finas e longas"), false));
		listaVariaveis.add(new Variavel(26, "gemas laterais com chicotes",
				"As gemas laterais possuem hastes pontiagudas no �pice, semelhantes a um chicote?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(27, "halo marrom",
				"Em torno das  manchas mais velhas, nota-se a presen�a de um halo amarronzado?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(28, "manchas coalescentes", "As manchas coalescem (juntam-se umas �s outras)?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(29, "manchas internas na regi�o dos n�s",
				"H� manchas internas na regi�o do n�s, de colora��o vermelho-escuro a parda?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(30, "manchas na nervura central", "H� manchas na nervura central?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(31, "manchas na parte interna do colmo",
				"H� manchas vermelhas intercalas com manchas brancas na parte interna do colmo?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(32, "margens indefinidas", "As margens das estrias s�o indefinidas?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(33, "morte dos ponteiros", "Algumas plantas est�o com os ponteiros mortos?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(34, "necrose de folhas", "As estrias mais velhas est�o necrosadas?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(35, "nervura central da folha amarelada",
				"A nervura central das folhas est�o amareladas?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(36, "nervura central das folhas adocicadas",
				"A nervura central das folhas tem gosto adocicado?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(37, "odor de abacaxi",
				"O rebolo apresenta um odor t�pico de abacaxi e �cido ac�tico?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(38, "odor de �cido ac�tico no colmo",
				"O colmo apresenta odor de �cido ac�tico (semelhante a abacaxi)?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(
				new Variavel(39, "odor f�tido", "A planta apresenta odor f�tido?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(40, "parte da folha com estrias",
				"Foram encontradas estrias nas seguintes partes das folhas:",
				Arrays.asList("todo o limbo", "somente extremidade distral"), false));
		listaVariaveis.add(
				new Variavel(41, "perfilhamento", "O perfilhamento �:", Arrays.asList("regular", "irregular"), false));
		listaVariaveis.add(new Variavel(42, "plantas arrancadas facilmente",
				"As plantas podem ser arrancadas quando puxadas pelo colmo?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(43, "plantas raqu�ticas",
				"As plantas apresentam sintomas de raquitismo (crescimento irregular, poucos perfilhos, colmos finos e baixa produ��o)?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(44, "pontos internos basais",
				"Internamente, a parte basal dos n�s apresentam v�rgulas ou pontos de cor alaranjado-claro a avermelhado-escuro?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(45, "preju�zo", "H� preju�zo ao desenvolvimento da planta?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(46, "presen�a de brocas", "A planta est� brocada (perfurada)?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(47, "presen�a de chicote",
				"No �pice da planta existe uma haste pontiaguda semelhante a um chicote?", Arrays.asList("sim", "n�o"),
				false));
		listaVariaveis.add(new Variavel(48, "presen�a de esporos",
				"Foi observada a presen�a de esporos na parte inferior da folha?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(49, "presen�a de estrias nas folhas", "H� estrias nas folhas?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(50, "presen�a de exsuda��o", "As folhas apresentam exsuda��o bacteriana?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(51, "presen�a de halo clor�tico",
				"h� halos clor�ticos (sem colora��o) em volta das manchas?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(52, "presen�a de manchas nas folhas", "H� manchas nas folhas?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(53, "presen�a de mic�lio",
				"Foi notado a presen�a de mic�lio (fungos) na parte inferior das folhas?", Arrays.asList("sim", "n�o"),
				false));
		listaVariaveis.add(new Variavel(54, "presen�a de p�stulas",
				"H� presen�a de p�stulas (esporos) em alto relevo na face inferior das folhas?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(55, "rabo de cometa", "As estrias apresentam-se em forma de rabo de cometa?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(56, "ra�zes com extremidade avermelhadas",
				"As ra�zes mais novas apresentam extremidades avermelhadas?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(57, "ra�zes pobres e superficiais",
				"O sistema radicular da planta tem poucas ra�zes, sendo estas superficiais?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(58, "rebolo apodrecido",
				"O rebolo est� apodrecido, tendo iniciado pelas extremidades?", Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(59, "rebolos destru�dos",
				"O rebolo est� destru�do, restando somente a casca e feixes fibro vasculares?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(60, "sintoma de mosaico",
				"H� manchas verde-p�lidas entremeadas no verde normal da folha, lembrando um mosaico?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(new Variavel(61, "superbrotamento de touceiras", "H� um superbrotamento de touceiras?",
				Arrays.asList("sim", "n�o"), false));
		listaVariaveis.add(
				new Variavel(62, "tipo de estrias", "As estrias s�o:", Arrays.asList("alongadas", "pequenas"), false));
		listaVariaveis.add(new Variavel(63, "touceiras pouco desenvolvidas",
				"As touceiras afetadas est�o subdesenvolvidas?", Arrays.asList("sim", "n�o"), false));

		listaExpressoes.add(new Expressao(0, listaVariaveis.get(49), "=", "sim"));
		listaExpressoes.add(new Expressao(1, listaVariaveis.get(11), "=", "brancas"));
		listaExpressoes.add(new Expressao(2, listaVariaveis.get(34), "=", "sim"));
		listaExpressoes.add(new Expressao(3, listaVariaveis.get(40), "=", "todo o limbo"));
		listaExpressoes.add(new Expressao(4, listaVariaveis.get(7), "=", "sim"));
		listaExpressoes.add(new Expressao(5, listaVariaveis.get(8), "=", "sim"));
		listaExpressoes.add(new Expressao(6, listaVariaveis.get(1), "=", "sim"));
		listaExpressoes.add(new Expressao(7, listaVariaveis.get(39), "=", "sim"));
		listaExpressoes.add(new Expressao(8, listaVariaveis.get(4), "=", "sim"));
		listaExpressoes.add(new Expressao(9, listaVariaveis.get(52), "=", "sim"));
		listaExpressoes.add(new Expressao(10, listaVariaveis.get(51), "=", "sim"));
		listaExpressoes.add(new Expressao(11, listaVariaveis.get(24), "=", "irregular"));
		listaExpressoes.add(new Expressao(12, listaVariaveis.get(28), "=", "sim"));
		listaExpressoes.add(new Expressao(13, listaVariaveis.get(54), "=", "sim"));
		listaExpressoes.add(new Expressao(14, listaVariaveis.get(48), "=", "sim"));
		listaExpressoes.add(new Expressao(15, listaVariaveis.get(27), "=", "sim"));
		listaExpressoes.add(new Expressao(16, listaVariaveis.get(62), "=", "alongadas"));
		listaExpressoes.add(new Expressao(17, listaVariaveis.get(55), "=", "sim"));
		listaExpressoes.add(new Expressao(18, listaVariaveis.get(53), "=", "sim"));
		listaExpressoes.add(new Expressao(19, listaVariaveis.get(21), "=", "somente as mais velhas"));
		listaExpressoes.add(new Expressao(20, listaVariaveis.get(45), "=", "n�o"));
		listaExpressoes.add(new Expressao(21, listaVariaveis.get(25), "=", "finas e longas"));
		listaExpressoes.add(new Expressao(22, listaVariaveis.get(50), "=", "sim"));
		listaExpressoes.add(new Expressao(23, listaVariaveis.get(28), "=", "n�o"));
		listaExpressoes.add(new Expressao(24, listaVariaveis.get(24), "=", "eliptica"));
		listaExpressoes.add(new Expressao(25, listaVariaveis.get(51), "=", "n�o"));
		listaExpressoes.add(new Expressao(26, listaVariaveis.get(53), "=", "n�o"));
		listaExpressoes.add(new Expressao(27, listaVariaveis.get(25), "=", "somente as mais velhas"));
		listaExpressoes.add(new Expressao(28, listaVariaveis.get(11), "=", "vermelhas"));
		listaExpressoes.add(new Expressao(29, listaVariaveis.get(11), "=", "marelo-esbranqui�adas (clor�ticas)"));
		listaExpressoes.add(new Expressao(30, listaVariaveis.get(32), "=", "sim"));
		listaExpressoes.add(new Expressao(31, listaVariaveis.get(15), "=", "sim"));
		listaExpressoes.add(new Expressao(32, listaVariaveis.get(11), "=", "amarelas"));
		listaExpressoes.add(new Expressao(33, listaVariaveis.get(11), "=", "laranja-avermelhadas"));
		listaExpressoes.add(new Expressao(34, listaVariaveis.get(11), "=", "marrom-avermelhadas"));
		listaExpressoes.add(new Expressao(35, listaVariaveis.get(40), "=", "somente extremidade distral"));
		listaExpressoes.add(new Expressao(36, listaVariaveis.get(11), "=", "vari�vel"));
		listaExpressoes.add(new Expressao(37, listaVariaveis.get(25), "=", "estreitas de comprimento vari�vel"));
		listaExpressoes.add(new Expressao(38, listaVariaveis.get(18), "=", "sim"));
		listaExpressoes.add(new Expressao(39, listaVariaveis.get(50), "=", "n�o"));
		listaExpressoes.add(new Expressao(40, listaVariaveis.get(1), "=", "n�o"));
		listaExpressoes.add(new Expressao(41, listaVariaveis.get(19), "=", "sim"));
		listaExpressoes.add(new Expressao(42, listaVariaveis.get(60), "=", "sim"));
		listaExpressoes.add(new Expressao(43, listaVariaveis.get(63), "=", "sim"));
		listaExpressoes.add(new Expressao(44, listaVariaveis.get(17), "=", "sim"));
		listaExpressoes.add(new Expressao(45, listaVariaveis.get(43), "=", "sim"));
		listaExpressoes.add(new Expressao(46, listaVariaveis.get(13), "=", "sim"));
		listaExpressoes.add(new Expressao(47, listaVariaveis.get(41), "=", "irregular"));
		listaExpressoes.add(new Expressao(48, listaVariaveis.get(44), "=", "sim"));
		listaExpressoes.add(new Expressao(49, listaVariaveis.get(47), "=", "sim"));
		listaExpressoes.add(new Expressao(50, listaVariaveis.get(10), "=", "sim"));
		listaExpressoes.add(new Expressao(51, listaVariaveis.get(9), "=", "sim"));
		listaExpressoes.add(new Expressao(52, listaVariaveis.get(61), "=", "sim"));
		listaExpressoes.add(new Expressao(53, listaVariaveis.get(0), "=", "sim"));
		listaExpressoes.add(new Expressao(54, listaVariaveis.get(14), "=", "sim"));
		listaExpressoes.add(new Expressao(53, listaVariaveis.get(30), "=", "sim"));
		listaExpressoes.add(new Expressao(54, listaVariaveis.get(33), "=", "sim"));
		listaExpressoes.add(new Expressao(55, listaVariaveis.get(6), "=", "sim"));
		listaExpressoes.add(new Expressao(56, listaVariaveis.get(46), "=", "sim"));
		listaExpressoes.add(new Expressao(57, listaVariaveis.get(31), "=", "sim"));
		listaExpressoes.add(new Expressao(58, listaVariaveis.get(5), "=", "sim"));
		listaExpressoes.add(new Expressao(59, listaVariaveis.get(58), "=", "sim"));
		listaExpressoes.add(new Expressao(60, listaVariaveis.get(59), "=", "sim"));
		listaExpressoes.add(new Expressao(61, listaVariaveis.get(37), "=", "sim"));
		listaExpressoes.add(new Expressao(62, listaVariaveis.get(2), "=", "sim"));
		listaExpressoes.add(new Expressao(63, listaVariaveis.get(42), "=", "sim"));
		listaExpressoes.add(new Expressao(64, listaVariaveis.get(56), "=", "sim"));
		listaExpressoes.add(new Expressao(65, listaVariaveis.get(3), "=", "sim"));
		listaExpressoes.add(new Expressao(66, listaVariaveis.get(38), "=", "sim"));
		listaExpressoes.add(new Expressao(67, listaVariaveis.get(29), "=", "sim"));
		listaExpressoes.add(new Expressao(68, listaVariaveis.get(20), "=", "sim"));
		listaExpressoes.add(new Expressao(69, listaVariaveis.get(35), "=", "sim"));
		listaExpressoes.add(new Expressao(70, listaVariaveis.get(23), "=", "sim"));
		listaExpressoes.add(new Expressao(71, listaVariaveis.get(57), "=", "sim"));
		listaExpressoes.add(new Expressao(72, listaVariaveis.get(36), "=", "sim"));

		// Regra 1:
		listaExprR1 = Arrays.asList(listaExpressoes.get(0), listaExpressoes.get(1), listaExpressoes.get(4),
				listaExpressoes.get(5));
		listaRegras.add(new Regra(0, listaExprR1, "escaldadura das folhas CNF 100%"));

		// Regra 2:
		listaExprR2 = Arrays.asList(listaExpressoes.get(0), listaExpressoes.get(1), listaExpressoes.get(2),
				listaExpressoes.get(4));
		listaRegras.add(new Regra(1, listaExprR2, "escaldadura das folhas CNF 100%"));

		// Regra 3:
		listaExprR3 = Arrays.asList(listaExpressoes.get(9), listaExpressoes.get(10), listaExpressoes.get(11),
				listaExpressoes.get(12));
		listaRegras.add(new Regra(2, listaExprR3, "ferrugem CNF 80%"));

		// Regra 4:
		listaExprR4 = Arrays.asList(listaExpressoes.get(9), listaExpressoes.get(10), listaExpressoes.get(11),
				listaExpressoes.get(12), listaExpressoes.get(13));
		listaRegras.add(new Regra(3, listaExprR4, "ferrugem CNF 90%"));

		// Regra 5:
		listaExprR5 = Arrays.asList(listaExpressoes.get(9), listaExpressoes.get(10), listaExpressoes.get(11),
				listaExpressoes.get(12), listaExpressoes.get(14));
		listaRegras.add(new Regra(4, listaExprR5, "ferrugem CNF 100%"));

		// Regra 6:
		listaExprR6 = Arrays.asList(listaExpressoes.get(9), listaExpressoes.get(10), listaExpressoes.get(11),
				listaExpressoes.get(12), listaExpressoes.get(15));
		listaRegras.add(new Regra(5, listaExprR6, "mancha parda CNF 80%"));

		// Regra 7:
		listaExprR7 = Arrays.asList(listaExpressoes.get(9), listaExpressoes.get(10), listaExpressoes.get(24),
				listaExpressoes.get(0), listaExpressoes.get(16));
		listaRegras.add(new Regra(6, listaExprR7, "mancha ocular CNF 80%"));

		// Regra 8:
		listaExprR8 = Arrays.asList(listaExpressoes.get(9), listaExpressoes.get(10), listaExpressoes.get(24),
				listaExpressoes.get(0), listaExpressoes.get(16), listaExpressoes.get(17));
		listaRegras.add(new Regra(7, listaExprR8, "mancha ocular CNF 100%"));

		// Regra 9:
		listaExprR9 = Arrays.asList(listaExpressoes.get(9), listaExpressoes.get(10), listaExpressoes.get(11),
				listaExpressoes.get(12), listaExpressoes.get(18));
		listaRegras.add(new Regra(8, listaExprR9, "mancha amarela CNF 90%"));

		// Regra 10:
		listaExprR10 = Arrays.asList(listaExpressoes.get(9), listaExpressoes.get(10), listaExpressoes.get(11),
				listaExpressoes.get(12), listaExpressoes.get(26));
		listaRegras.add(new Regra(9, listaExprR10, "mancha amarela CNF 50%"));

		// Regra 11:
		listaExprR11 = Arrays.asList(listaExpressoes.get(9), listaExpressoes.get(10), listaExpressoes.get(11),
				listaExpressoes.get(12), listaExpressoes.get(15));
		listaRegras.add(new Regra(10, listaExprR11, "mancha anelar CNF 60%"));

		// Regra 12:
		listaExprR12 = Arrays.asList(listaExpressoes.get(9), listaExpressoes.get(10), listaExpressoes.get(11),
				listaExpressoes.get(12), listaExpressoes.get(15), listaExpressoes.get(19), listaExpressoes.get(20));
		listaRegras.add(new Regra(11, listaExprR12, "mancha anelar CNF 90%"));

		// Regra 13:
		listaExprR13 = Arrays.asList(listaExpressoes.get(0), listaExpressoes.get(21), listaExpressoes.get(6),
				listaExpressoes.get(28), listaExpressoes.get(22), listaExpressoes.get(7));
		listaRegras.add(new Regra(12, listaExprR13, "estrias vermelhas CNF 100%"));

		// Regra 14:
		listaExprR14 = Arrays.asList(listaExpressoes.get(0), listaExpressoes.get(29), listaExpressoes.get(30),
				listaExpressoes.get(31), listaExpressoes.get(20));
		listaRegras.add(new Regra(13, listaExprR14, "estrias clor�ticas CNF 70%"));

		// Regra 15:
		listaExprR15 = Arrays.asList(listaExpressoes.get(0), listaExpressoes.get(36), listaExpressoes.get(27),
				listaExpressoes.get(35), listaExpressoes.get(22));
		listaRegras.add(new Regra(14, listaExprR15, "gomose CNF 70%"));

		// Regra 16:
		listaExprR16 = Arrays.asList(listaExpressoes.get(0), listaExpressoes.get(36), listaExpressoes.get(37),
				listaExpressoes.get(38), listaExpressoes.get(3), listaExpressoes.get(39), listaExpressoes.get(40));
		listaRegras.add(new Regra(15, listaExprR16, "estria mosqueada CNF 80%"));

		// Regra 17:
		listaExprR17 = Arrays.asList(listaExpressoes.get(0), listaExpressoes.get(36), listaExpressoes.get(37),
				listaExpressoes.get(38), listaExpressoes.get(3), listaExpressoes.get(39), listaExpressoes.get(40));
		listaRegras.add(new Regra(16, listaExprR17, "estria mosqueada CNF 80%"));

		// Regra 18:
		listaExprR18 = Arrays.asList(listaExpressoes.get(0), listaExpressoes.get(34), listaExpressoes.get(37),
				listaExpressoes.get(2), listaExpressoes.get(41));
		listaRegras.add(new Regra(17, listaExprR18, "estrias pardas CNF 80%"));

		// Regra 19:
		listaExprR19 = Arrays.asList(listaExpressoes.get(9), listaExpressoes.get(42));
		listaRegras.add(new Regra(18, listaExprR19, "mosaico CNF 100%"));

		// Regra 20:
		listaExprR20 = Arrays.asList(listaExpressoes.get(45), listaExpressoes.get(46), listaExpressoes.get(47));
		listaRegras.add(new Regra(19, listaExprR20, "raquitismo da soqueira CNF 60%"));

		// Regra 21:
		listaExprR21 = Arrays.asList(listaExpressoes.get(45), listaExpressoes.get(48));
		listaRegras.add(new Regra(20, listaExprR21, "raquitismo da soqueira CNF 80%"));

		// Regra 22:
		listaExprR22 = Arrays.asList(listaExpressoes.get(45), listaExpressoes.get(47), listaExpressoes.get(48));
		listaRegras.add(new Regra(21, listaExprR22, "raquitismo da soqueira CNF 100%"));

		// Regra 23:
		listaExprR23 = Arrays.asList(listaExpressoes.get(45), listaExpressoes.get(46), listaExpressoes.get(48));
		listaRegras.add(new Regra(22, listaExprR23, "raquitismo da soqueira CNF 100%"));

		// Regra 24:
		listaExprR24 = Arrays.asList(listaExpressoes.get(52), listaExpressoes.get(0), listaExpressoes.get(54));
		listaRegras.add(new Regra(23, listaExprR24, "carv�o CNF 60%"));

		// Regra 25:
		listaExprR25 = Arrays.asList(listaExpressoes.get(49));
		listaRegras.add(new Regra(24, listaExprR25, "carv�o CNF 100%"));

		// Regra 26:
		listaExprR26 = Arrays.asList(listaExpressoes.get(55), listaExpressoes.get(56));
		listaRegras.add(new Regra(25, listaExprR26, "podrid�o vermelha CNF 60%"));
		
		// Regra 27:
		listaExprR27 = Arrays.asList(listaExpressoes.get(57));
		listaRegras.add(new Regra(26, listaExprR27, "podrid�o vermelha CNF 100%"));

		// Regra 28:
		listaExprR28 = Arrays.asList(listaExpressoes.get(58));
		listaRegras.add(new Regra(27, listaExprR28, "podrid�o abacaxi CNF 50%"));

		// Regra 29:
		listaExprR29 = Arrays.asList(listaExpressoes.get(58), listaExpressoes.get(59));
		listaRegras.add(new Regra(28, listaExprR29, "podrid�o abacaxi CNF 80%"));

		// Regra 30:
		listaExprR30 = Arrays.asList(listaExpressoes.get(58), listaExpressoes.get(59), listaExpressoes.get(61));
		listaRegras.add(new Regra(29, listaExprR30, "podrid�o abacaxi CNF 100%"));

		// Regra 31:
		listaExprR31 = Arrays.asList(listaExpressoes.get(62), listaExpressoes.get(58));
		listaRegras.add(new Regra(30, listaExprR31, "podrid�o das ra�zes CNF 50%"));

		// Regra 32:
		listaExprR32 = Arrays.asList(listaExpressoes.get(62), listaExpressoes.get(58), listaExpressoes.get(46),
				listaExpressoes.get(47), listaExpressoes.get(63));
		listaRegras.add(new Regra(31, listaExprR32, "podrid�o das ra�zes CNF 70%"));

		// Regra 33:
		listaExprR33 = Arrays.asList(listaExpressoes.get(62), listaExpressoes.get(58), listaExpressoes.get(63),
				listaExpressoes.get(64), listaExpressoes.get(65));
		listaRegras.add(new Regra(32, listaExprR33, "podrid�o das ra�zes CNF 90%"));

		// Regra 34:
		listaExprR34 = Arrays.asList(listaExpressoes.get(58), listaExpressoes.get(67));
		listaRegras.add(new Regra(33, listaExprR34, "podrid�o da casca CNF 60%"));

		// Regra 35:
		listaExprR35 = Arrays.asList(listaExpressoes.get(58), listaExpressoes.get(66), listaExpressoes.get(67));
		listaRegras.add(new Regra(34, listaExprR35, "podrid�o da casca CNF 80%"));

		// Regra 36:
		listaExprR36 = Arrays.asList(listaExpressoes.get(68));
		listaRegras.add(new Regra(35, listaExprR36, "podrid�o da casca CNF 100%"));

		// Regra 37:
		listaExprR37 = Arrays.asList(listaExpressoes.get(72));
		listaRegras.add(new Regra(36, listaExprR37, "amarelinho CNF 80%"));

		// Regra 38:
		listaExprR38 = Arrays.asList(listaExpressoes.get(69), listaExpressoes.get(72));
		listaRegras.add(new Regra(37, listaExprR38, "amarelinho CNF 100%"));

	}

}
