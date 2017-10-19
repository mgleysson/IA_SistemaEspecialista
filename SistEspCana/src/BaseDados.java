import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseDados {
	
	public List<Variavel> listaVariaveis = new ArrayList<Variavel>();
	public List<Expressao> listaExpressoes = new ArrayList<Expressao>();
	public List<Regra> listaRegras = new ArrayList<Regra>();
	
	public void criarBase() {
		
		listaVariaveis.add(new Variavel(0,"afinamento de colmos", "Os colmos estão bastante finos?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(1,"apodrecimento do topo", "Os colmos estão bastante finos?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(2,"área enxarcada", "A área apresenta enxarcamento?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(3,"ausência de raízes secundárias", "Há pouca ou nenhuma raíz secundária?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(4,"bainha afetada", "As estrias se prolongam pela bainha?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(5,"baixa brotação de gemas", "Há uma baixa brotação de gemas, provocando falhas no plantio?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(6,"baixo teor de sacarose", "Houve uma redução no teor de sacarose das plantas?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(7,"brotações de gemas laterais no colmo", "Há brotações de gemas laterais no colmo?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(8,"brotações do colmo com estrias brancas", "As brotações no colmo possuem estrias brancas?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(9,"chicote com massa preta", "Ao romper a película do chicote, foi observado uma massa preta semelhante a pó de carvão?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(10,"chicote com película prateada", "O chicote possui uma película prateada?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(11,"cor das estrias", "Qual a cor que melhor descreve as estrias?", Arrays.asList("amarelo-esbranquiçadas (cloróticas)", "brancas","marrom-avermelhadas","variável", "laranja-avermelhadas", "vermelhas", "amarelas"), false));
		listaVariaveis.add(new Variavel(12,"cor das manchas", "Qual a cor das manchas?", Arrays.asList("outras","verde-pálidas","vermelhas"), false));
		listaVariaveis.add(new Variavel(13,"crescimento irregular", "As plantas apresentam crescimento irregular?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(14,"descoloração nodal", "Há descoloração dos tecidos nodais próximos ao meristema apical?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(15,"descoloração vascular nodal no colmo", "Há descoloração vascular na região nodal do colmo?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(16,"doença", "", Arrays.asList("podridão vermelha","podridão da casca","raquitismo da soqueira","estrias vermelhas","estrias pardas","gomose","mancha amarela","mancha ocular","ferrugem","podridão abacaxi","carvão","podridão das raízes","estrias cloróticas","estria mosqueada","mosaico","mancha anelar","mancha parda","escaldadura das folhas","amarelinho"), true));
		listaVariaveis.add(new Variavel(17,"encurtamento dos entre-nós", "Há um encurtamento dos entre-nós?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(18,"estrias acompanham nervuras secundárias", "O sentido das estrias acompanham as nervuras secundárias das folhas?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(19,"estrias coalescentes", "As estrias coalescem (juntam-se umas às outras)?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(20,"filamento de esporos negros", "O colmo apresenta alguns filamentos de esporos negros?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(21,"folhas atingidas", "As folhas atingidas são:", Arrays.asList("somente as mais velhas", "jovens e velhas"), false));
		listaVariaveis.add(new Variavel(22,"folhas com estrias", "As folhas possuem estrias?", Arrays.asList("folhas maduras","todas as folhas","folhas jovens"), false));
		listaVariaveis.add(new Variavel(23,"folhas mais velhas amareladas", "As folhas mais velhas estão amareladas, com a nervura central arroxeada?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(24,"forma da mancha", "O formato da mancha é:", Arrays.asList("eliptica", "irregular"), false));
		listaVariaveis.add(new Variavel(25,"forma das estrias", "Qual a forma que melhor descreve as estrias?", Arrays.asList("outras","estreitas de comprimento variável","finas e longas"), false));
		listaVariaveis.add(new Variavel(26,"gemas laterais com chicotes", "As gemas laterais possuem hastes pontiagudas no ápice, semelhantes a um chicote?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(27,"halo marrom", "Em torno das  manchas mais velhas, nota-se a presença de um halo amarronzado?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(28,"manchas coalescentes", "As manchas coalescem (juntam-se umas às outras)?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(29,"manchas internas na região dos nós", "Há manchas internas na região do nós, de coloração vermelho-escuro a parda?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(30,"manchas na nervura central", "Há manchas na nervura central?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(31,"manchas na parte interna do colmo", "Há manchas vermelhas intercalas com manchas brancas na parte interna do colmo?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(32,"margens indefinidas", "As margens das estrias são indefinidas?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(33,"morte dos ponteiros", "Algumas plantas estão com os ponteiros mortos?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(34,"necrose de folhas", "As estrias mais velhas estão necrosadas?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(35,"nervura central da folha amarelada", "A nervura central das folhas estão amareladas?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(36,"nervura central das folhas adocicadas", "A nervura central das folhas tem gosto adocicado?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(37,"odor de abacaxi", "O rebolo apresenta um odor típico de abacaxi e ácido acético?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(38,"odor de ácido acético no colmo", "O colmo apresenta odor de ácido acético (semelhante a abacaxi)?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(39,"odor fétido", "A planta apresenta odor fétido?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(40,"parte da folha com estrias", "Foram encontradas estrias nas seguintes partes das folhas:", Arrays.asList("todo o limbo", "somente extremidade distral"), false));
		listaVariaveis.add(new Variavel(41,"perfilhamento", "O perfilhamento é:", Arrays.asList("regular","irregular"), false));
		listaVariaveis.add(new Variavel(42,"plantas arrancadas facilmente", "As plantas podem ser arrancadas quando puxadas pelo colmo?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(43,"plantas raquíticas", "As plantas apresentam sintomas de raquitismo (crescimento irregular, poucos perfilhos, colmos finos e baixa produção)?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(44,"pontos internos basais", "Internamente, a parte basal dos nós apresentam vírgulas ou pontos de cor alaranjado-claro a avermelhado-escuro?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(45,"prejuízo", "Há prejuízo ao desenvolvimento da planta?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(46,"presença de brocas", "A planta está brocada (perfurada)?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(47,"presença de chicote", "No ápice da planta existe uma haste pontiaguda semelhante a um chicote?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(48,"presença de esporos", "Foi observada a presença de esporos na parte inferior da folha?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(49,"presença de estrias nas folhas", "Há estrias nas folhas?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(50,"presença de exsudação", "As folhas apresentam exsudação bacteriana?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(51,"presença de halo clorótico", "há halos cloróticos (sem coloração) em volta das manchas?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(52,"presença de manchas nas folhas", "Há manchas nas folhas?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(53,"presença de micélio", "Foi notado a presença de micélio (fungos) na parte inferior das folhas?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(54,"presença de pústulas", "Há presença de pústulas (esporos) em alto relevo na face inferior das folhas?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(55,"rabo de cometa", "As estrias apresentam-se em forma de rabo de cometa?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(56,"raízes com extremidade avermelhadas", "As raízes mais novas apresentam extremidades avermelhadas?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(57,"raízes pobres e superficiais", "O sistema radicular da planta tem poucas raízes, sendo estas superficiais?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(58,"rebolo apodrecido", "O rebolo está apodrecido, tendo iniciado pelas extremidades?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(59,"rebolos destruídos", "O rebolo está destruído, restando somente a casca e feixes fibro vasculares?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(60,"sintoma de mosaico", "Há manchas verde-pálidas entremeadas no verde normal da folha, lembrando um mosaico?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(61,"superbrotamento de touceiras", "Há um superbrotamento de touceiras?", Arrays.asList("sim", "não"), false));
		listaVariaveis.add(new Variavel(62,"tipo de estrias", "As estrias são:", Arrays.asList("alongadas", "pequenas"), false));
		listaVariaveis.add(new Variavel(63,"touceiras pouco desenvolvidas", "As touceiras afetadas estão subdesenvolvidas?", Arrays.asList("sim", "não"), false));
		
		/*
		 *  Modelo de como fazer a adição na lista de expressões:
		 *  listaExpressoes.add(new Expressao(variavel, operador, valor));
		 *  
		 *  onde o parametro variavel referencia uma variavel na lista de variaveis acima;
		 *  o operador usado pela base de regras sempre é o = ;
		 *  e o valor é o valor da variavel obtido a partir de cada regra 
		 */
		
		// EXEMPLO PARA AS EXPRESSÕES DA REGRA 1:
		// TOMAR CUIDADO PARA NÃO CADASTRAR EXPRESSÕES REPETIDAS, ACHO QUE ALGUMAS SE REPETEM NAS DIFERENTES REGRAS!
		
		listaExpressoes.add(new Expressao(listaVariaveis.get(49), "=", "sim"));
		// listaVariaveis.get(49) => buscando a variável de indice 49 da lista de variáveis acima
		//que é justamente a variável procurada: "presença de estrias nas folha" 
		
		//Fazer isso para as demais expressões presentes em todas as regras!
		
	}
	
	
	
	

}
