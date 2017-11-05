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

		listaVariaveis.add(new Variavel(0, "afinamento de colmos", "Os colmos estão bastante finos?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(1, "apodrecimento do topo", "Os colmos estão bastante finos?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(2, "área enxarcada", "A área apresenta enxarcamento?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(3, "ausência de raízes secundárias", "Há pouca ou nenhuma raíz secundária?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(4, "bainha afetada", "As estrias se prolongam pela bainha?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(5, "baixa brotação de gemas",
				"Há uma baixa brotação de gemas, provocando falhas no plantio?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(6, "baixo teor de sacarose",
				"Houve uma redução no teor de sacarose das plantas?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(7, "brotações de gemas laterais no colmo",
				"Há brotações de gemas laterais no colmo?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(8, "brotações do colmo com estrias brancas",
				"As brotações no colmo possuem estrias brancas?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(9, "chicote com massa preta",
				"Ao romper a película do chicote, foi observado uma massa preta semelhante a pó de carvão?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(10, "chicote com película prateada", "O chicote possui uma película prateada?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(11, "cor das estrias",
				"Qual a cor que melhor descreve as estrias?", Arrays.asList("amarelo-esbranquiçadas (cloróticas)",
						"brancas", "marrom-avermelhadas", "variável", "laranja-avermelhadas", "vermelhas", "amarelas"),
				false));
		listaVariaveis.add(new Variavel(12, "cor das manchas", "Qual a cor das manchas?",
				Arrays.asList("outras", "verde-pálidas", "vermelhas"), false));
		listaVariaveis.add(new Variavel(13, "crescimento irregular", "As plantas apresentam crescimento irregular?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(14, "descoloração nodal",
				"Há descoloração dos tecidos nodais próximos ao meristema apical?", Arrays.asList("sim", "não"),
				false));
		listaVariaveis.add(new Variavel(15, "descoloração vascular nodal no colmo",
				"Há descoloração vascular na região nodal do colmo?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(16, "doença", "",
				Arrays.asList("podridão vermelha", "podridão da casca", "raquitismo da soqueira", "estrias vermelhas",
						"estrias pardas", "gomose", "mancha amarela", "mancha ocular", "ferrugem", "podridão abacaxi",
						"carvão", "podridão das raízes", "estrias cloróticas", "estria mosqueada", "mosaico",
						"mancha anelar", "mancha parda", "escaldadura das folhas", "amarelinho"),
				true));
		listaVariaveis.add(new Variavel(17, "encurtamento dos entre-nós", "Há um encurtamento dos entre-nós?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(18, "estrias acompanham nervuras secundárias",
				"O sentido das estrias acompanham as nervuras secundárias das folhas?", Arrays.asList("sim", "não"),
				false));
		listaVariaveis.add(new Variavel(19, "estrias coalescentes", "As estrias coalescem (juntam-se umas às outras)?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(20, "filamento de esporos negros",
				"O colmo apresenta alguns filamentos de esporos negros?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(21, "folhas atingidas", "As folhas atingidas são:",
				Arrays.asList("somente as mais velhas", "jovens e velhas"), false));
		listaVariaveis.add(new Variavel(22, "folhas com estrias", "As folhas possuem estrias?",
				Arrays.asList("folhas maduras", "todas as folhas", "folhas jovens"), false));
		listaVariaveis.add(new Variavel(23, "folhas mais velhas amareladas",
				"As folhas mais velhas estão amareladas, com a nervura central arroxeada?", Arrays.asList("sim", "não"),
				false));
		listaVariaveis.add(new Variavel(24, "forma da mancha", "O formato da mancha é:",
				Arrays.asList("eliptica", "irregular"), false));
		listaVariaveis.add(new Variavel(25, "forma das estrias", "Qual a forma que melhor descreve as estrias?",
				Arrays.asList("outras", "estreitas de comprimento variável", "finas e longas"), false));
		listaVariaveis.add(new Variavel(26, "gemas laterais com chicotes",
				"As gemas laterais possuem hastes pontiagudas no ápice, semelhantes a um chicote?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(27, "halo marrom",
				"Em torno das  manchas mais velhas, nota-se a presença de um halo amarronzado?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(28, "manchas coalescentes", "As manchas coalescem (juntam-se umas às outras)?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(29, "manchas internas na região dos nós",
				"Há manchas internas na região do nós, de coloração vermelho-escuro a parda?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(30, "manchas na nervura central", "Há manchas na nervura central?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(31, "manchas na parte interna do colmo",
				"Há manchas vermelhas intercalas com manchas brancas na parte interna do colmo?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(32, "margens indefinidas", "As margens das estrias são indefinidas?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(33, "morte dos ponteiros", "Algumas plantas estão com os ponteiros mortos?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(34, "necrose de folhas", "As estrias mais velhas estão necrosadas?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(35, "nervura central da folha amarelada",
				"A nervura central das folhas estão amareladas?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(36, "nervura central das folhas adocicadas",
				"A nervura central das folhas tem gosto adocicado?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(37, "odor de abacaxi",
				"O rebolo apresenta um odor típico de abacaxi e ácido acético?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(38, "odor de ácido acético no colmo",
				"O colmo apresenta odor de ácido acético (semelhante a abacaxi)?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(
				new Variavel(39, "odor fétido", "A planta apresenta odor fétido?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(40, "parte da folha com estrias",
				"Foram encontradas estrias nas seguintes partes das folhas:",
				Arrays.asList("todo o limbo", "somente extremidade distral"), false));
		listaVariaveis.add(
				new Variavel(41, "perfilhamento", "O perfilhamento é:", Arrays.asList("regular", "irregular"), false));
		listaVariaveis.add(new Variavel(42, "plantas arrancadas facilmente",
				"As plantas podem ser arrancadas quando puxadas pelo colmo?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(43, "plantas raquíticas",
				"As plantas apresentam sintomas de raquitismo (crescimento irregular, poucos perfilhos, colmos finos e baixa produção)?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(44, "pontos internos basais",
				"Internamente, a parte basal dos nós apresentam vírgulas ou pontos de cor alaranjado-claro a avermelhado-escuro?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(45, "prejuízo", "Há prejuízo ao desenvolvimento da planta?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(46, "presença de brocas", "A planta está brocada (perfurada)?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(47, "presença de chicote",
				"No ápice da planta existe uma haste pontiaguda semelhante a um chicote?", Arrays.asList("sim", "não"),
				false));
		listaVariaveis.add(new Variavel(48, "presença de esporos",
				"Foi observada a presença de esporos na parte inferior da folha?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(49, "presença de estrias nas folhas", "Há estrias nas folhas?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(50, "presença de exsudação", "As folhas apresentam exsudação bacteriana?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(51, "presença de halo clorótico",
				"há halos cloróticos (sem coloração) em volta das manchas?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(52, "presença de manchas nas folhas", "Há manchas nas folhas?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(53, "presença de micélio",
				"Foi notado a presença de micélio (fungos) na parte inferior das folhas?", Arrays.asList("sim", "não"),
				false));
		listaVariaveis.add(new Variavel(54, "presença de pústulas",
				"Há presença de pústulas (esporos) em alto relevo na face inferior das folhas?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(55, "rabo de cometa", "As estrias apresentam-se em forma de rabo de cometa?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(56, "raízes com extremidade avermelhadas",
				"As raízes mais novas apresentam extremidades avermelhadas?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(57, "raízes pobres e superficiais",
				"O sistema radicular da planta tem poucas raízes, sendo estas superficiais?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(58, "rebolo apodrecido",
				"O rebolo está apodrecido, tendo iniciado pelas extremidades?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(59, "rebolos destruídos",
				"O rebolo está destruído, restando somente a casca e feixes fibro vasculares?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(60, "sintoma de mosaico",
				"Há manchas verde-pálidas entremeadas no verde normal da folha, lembrando um mosaico?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(61, "superbrotamento de touceiras", "Há um superbrotamento de touceiras?",
				Arrays.asList("sim", "não"), false));
		listaVariaveis.add(
				new Variavel(62, "tipo de estrias", "As estrias são:", Arrays.asList("alongadas", "pequenas"), false));
		listaVariaveis.add(new Variavel(63, "touceiras pouco desenvolvidas",
				"As touceiras afetadas estão subdesenvolvidas?", Arrays.asList("sim", "não"), false));

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
		listaExpressoes.add(new Expressao(20, listaVariaveis.get(45), "=", "não"));
		listaExpressoes.add(new Expressao(21, listaVariaveis.get(25), "=", "finas e longas"));
		listaExpressoes.add(new Expressao(22, listaVariaveis.get(50), "=", "sim"));
		listaExpressoes.add(new Expressao(23, listaVariaveis.get(28), "=", "não"));
		listaExpressoes.add(new Expressao(24, listaVariaveis.get(24), "=", "eliptica"));
		listaExpressoes.add(new Expressao(25, listaVariaveis.get(51), "=", "não"));
		listaExpressoes.add(new Expressao(26, listaVariaveis.get(53), "=", "não"));
		listaExpressoes.add(new Expressao(27, listaVariaveis.get(25), "=", "somente as mais velhas"));
		listaExpressoes.add(new Expressao(28, listaVariaveis.get(11), "=", "vermelhas"));
		listaExpressoes.add(new Expressao(29, listaVariaveis.get(11), "=", "marelo-esbranquiçadas (cloróticas)"));
		listaExpressoes.add(new Expressao(30, listaVariaveis.get(32), "=", "sim"));
		listaExpressoes.add(new Expressao(31, listaVariaveis.get(15), "=", "sim"));
		listaExpressoes.add(new Expressao(32, listaVariaveis.get(11), "=", "amarelas"));
		listaExpressoes.add(new Expressao(33, listaVariaveis.get(11), "=", "laranja-avermelhadas"));
		listaExpressoes.add(new Expressao(34, listaVariaveis.get(11), "=", "marrom-avermelhadas"));
		listaExpressoes.add(new Expressao(35, listaVariaveis.get(40), "=", "somente extremidade distral"));
		listaExpressoes.add(new Expressao(36, listaVariaveis.get(11), "=", "variável"));
		listaExpressoes.add(new Expressao(37, listaVariaveis.get(25), "=", "estreitas de comprimento variável"));
		listaExpressoes.add(new Expressao(38, listaVariaveis.get(18), "=", "sim"));
		listaExpressoes.add(new Expressao(39, listaVariaveis.get(50), "=", "não"));
		listaExpressoes.add(new Expressao(40, listaVariaveis.get(1), "=", "não"));
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
		listaRegras.add(new Regra(13, listaExprR14, "estrias cloróticas CNF 70%"));

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
		listaRegras.add(new Regra(23, listaExprR24, "carvão CNF 60%"));

		// Regra 25:
		listaExprR25 = Arrays.asList(listaExpressoes.get(49));
		listaRegras.add(new Regra(24, listaExprR25, "carvão CNF 100%"));

		// Regra 26:
		listaExprR26 = Arrays.asList(listaExpressoes.get(55), listaExpressoes.get(56));
		listaRegras.add(new Regra(25, listaExprR26, "podridão vermelha CNF 60%"));
		
		// Regra 27:
		listaExprR27 = Arrays.asList(listaExpressoes.get(57));
		listaRegras.add(new Regra(26, listaExprR27, "podridão vermelha CNF 100%"));

		// Regra 28:
		listaExprR28 = Arrays.asList(listaExpressoes.get(58));
		listaRegras.add(new Regra(27, listaExprR28, "podridão abacaxi CNF 50%"));

		// Regra 29:
		listaExprR29 = Arrays.asList(listaExpressoes.get(58), listaExpressoes.get(59));
		listaRegras.add(new Regra(28, listaExprR29, "podridão abacaxi CNF 80%"));

		// Regra 30:
		listaExprR30 = Arrays.asList(listaExpressoes.get(58), listaExpressoes.get(59), listaExpressoes.get(61));
		listaRegras.add(new Regra(29, listaExprR30, "podridão abacaxi CNF 100%"));

		// Regra 31:
		listaExprR31 = Arrays.asList(listaExpressoes.get(62), listaExpressoes.get(58));
		listaRegras.add(new Regra(30, listaExprR31, "podridão das raízes CNF 50%"));

		// Regra 32:
		listaExprR32 = Arrays.asList(listaExpressoes.get(62), listaExpressoes.get(58), listaExpressoes.get(46),
				listaExpressoes.get(47), listaExpressoes.get(63));
		listaRegras.add(new Regra(31, listaExprR32, "podridão das raízes CNF 70%"));

		// Regra 33:
		listaExprR33 = Arrays.asList(listaExpressoes.get(62), listaExpressoes.get(58), listaExpressoes.get(63),
				listaExpressoes.get(64), listaExpressoes.get(65));
		listaRegras.add(new Regra(32, listaExprR33, "podridão das raízes CNF 90%"));

		// Regra 34:
		listaExprR34 = Arrays.asList(listaExpressoes.get(58), listaExpressoes.get(67));
		listaRegras.add(new Regra(33, listaExprR34, "podridão da casca CNF 60%"));

		// Regra 35:
		listaExprR35 = Arrays.asList(listaExpressoes.get(58), listaExpressoes.get(66), listaExpressoes.get(67));
		listaRegras.add(new Regra(34, listaExprR35, "podridão da casca CNF 80%"));

		// Regra 36:
		listaExprR36 = Arrays.asList(listaExpressoes.get(68));
		listaRegras.add(new Regra(35, listaExprR36, "podridão da casca CNF 100%"));

		// Regra 37:
		listaExprR37 = Arrays.asList(listaExpressoes.get(72));
		listaRegras.add(new Regra(36, listaExprR37, "amarelinho CNF 80%"));

		// Regra 38:
		listaExprR38 = Arrays.asList(listaExpressoes.get(69), listaExpressoes.get(72));
		listaRegras.add(new Regra(37, listaExprR38, "amarelinho CNF 100%"));

	}

}
