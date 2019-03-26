package lista02;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A classe Principal do sistema.
 * 
 * @author 1829203
 *
 */
public class Principal {
	
	/**
	 * Função para iniciar o programa.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String[] opcoes = {"Mostrar vetor (//mostrar array)",
				           "Maior elemento",
				           "Menor elemento",
				           "Vetor inverso",
				           "Multiplicar dois vetores",
				           "Produto escalar de dois vetores",
				           "Produto dos elementos pares",
				           "Ordenar maior",
				           "Serie de Fibonacci",
				           "Analisar vetor",
				           "Mescla de vetores",
				           "Mostra elementos repetidos",
				           "Preenche vetor crescente",
				           "Concatena dois vetores",
				           "União entre dois vetores",
				           "Interseção entre dois vetores"};
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Lista 02", null);
			switch (opcao) {
			case 1:
				int[] vetor = criarVetorInteiros();
				imprimirVetorInteiros(vetor);
				// ArrayList<Integer> array = criarArrayDeInteiros();
				// System.out.println(array);
				break;
				
			case 2:
				ArrayList<Integer> maiores = criarArrayDeInteiros();
				Integer maior = Collections.max(maiores);
				System.out.println("O maior elemento do array " + maiores + " é " + maior + ".");
				break;
				
			case 3:
				ArrayList<Integer> menores = criarArrayDeInteiros();
				Integer menor = Collections.min(menores);
				System.out.println("O menor elemento do array " + menores + " é " + menor + ".");
				break;
				
			case 4:
				ArrayList<Integer> inverso = criarArrayDeInteiros();
				Collections.reverse(inverso);
				System.out.println(inverso);
				break;
				
			case 5:
				multiplicarVetores();
				break;
				
			case 6:
				produtoEscalarDeDoisArrays();
				break;
				
			case 7:
				produtoNumerosPares();
				break;
				
			case 8:
				ordenarMaior();
				break;
				
			case 9:
				criarSerieFibonacci();
				break;
				
			case 10:
				analisarVetor();
				break;
				
			case 11:
				mesclarVetores();
				break;
				
			case 12:
				elementosRepetidos();
				break;
				
			case 13:
				preencheSempreMaiores();
				break;
				
			case 14:
				concatencaoVetores();
				break;
				
			case 15:
				uniaoVetores();
				break;
				
			case 16:
				intersecaoVetores();
				break;
				
			case -1:
				continua = false;
				System.out.println("Saindo do sistema...");
				break;
			}
		} while (continua);
	}
	
	/**
	 * Método responsável por retornar um vetor com tamanho variável e valores
	 * escolhidos pelo usuário no console.
	 * 
	 * @return
	 */
	public static double[] recuperaVetor() {
		int quantidadeElementos = Console.recuperaInteiro("Entre com a quantidade de elementos do vetor (inteiro):");
		double[] valores = new double[quantidadeElementos];
		for (int i = 0; i < valores.length; i++) {
			valores[i] = Console.recuperaDecimal("Entre com o elemento de índice " + i + " do vetor:");
		}
		return valores;
	}
	
	/**
	 * Cria um {@link ArrayList} de {@link Integer}
	 * @return {@link ArrayList} de {@link Integer}
	 */
	public static ArrayList<Integer> criarArrayDeInteiros() {
		int quantidade = Console.recuperaInteiro("Informe a quantidade:");
		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 0; i < quantidade; i++) {
			array.add(Console.recuperaInteiro("Informe o valor " + (i + 1) + ":"));
		}
		return array;
	}
	
	/**
	 * Imprime um vetor primitivo de inteiros.
	 *  
	 * @param valores
	 */
	public static void imprimirVetorInteiros(int[] valores) {
		if (valores.length == 0) {
			System.out.println("[]");
		}else if(valores.length == 1) {
			System.out.println("[" + valores[0] + "]");
		} else {
			System.out.print("[");
			for (int i = 0; i < valores.length - 1; i++) {
				System.out.print(valores[i] + ", ");
			}
			System.out.println(valores[valores.length - 1] + "]");
		}		
	}
	
	/**
	 * Imprime um vetor primitivo de doubles.
	 *  
	 * @param valores
	 */
	public static void imprimirVetorDouble(double[] valores) {
		if (valores.length == 0) {
			System.out.println("[]");
		}else if(valores.length == 1) {
			System.out.println("[" + valores[0] + "]");
		} else {
			System.out.print("[");
			for (int i = 0; i < valores.length - 1; i++) {
				System.out.print(valores[i] + ", ");
			}
			System.out.println(valores[valores.length - 1] + "]");
		}		
	}
	
	/**
	 * Cria um vetor de inteiros com a quantidade escolhida pelo usuário.
	 * 
	 * @return Vetor de inteiros.
	 */
	public static int[] criarVetorInteiros() {
		int quantidade = Console.recuperaInteiro("Informe a quantidade:");
		int[] valores = new int[quantidade];
		for (int i = 0; i < quantidade; i++) {
			valores[i] = Console.recuperaInteiro("Informe o valor " + (i + 1) + ":");
		}
		return valores;
	}
	
	/**
	 * Cria um vetor double com a quantidade de itens informados.
	 * 
	 * @return Vetor de doubles.
	 */
	public static double[] criarVetorDouble(){
		int quantidade = Console.recuperaInteiro("Informe a quantidade: ");
		double[] valores = new double[quantidade];
		for (int i = 0; i < quantidade; i++) {
			valores[i] = Console.recuperaDecimal("Informe o " + (i + 1) + "º valor: ");
		}
		return valores;
	}
	
	/**
	 * Mulitiplica dois vetores de double.
	 */
	public static void multiplicarVetores() {
		System.out.println("Criar array A");
		double[] arrayA = criarVetorDouble();
		System.out.println("Criar array B");
		double[] arrayB = criarVetorDouble();
		
		ArrayList<Double> resultadoMultiplicacao = Exercicios.multiplicarArrays(arrayA, arrayB);
		
		System.out.println(resultadoMultiplicacao);
	}
	
	/**
	 * Produto Escalar de dois vetores de inteiros.
	 */
	private static void produtoEscalarDeDoisArrays() {
		System.out.println("Criar array A");
		int[] arrayA = criarVetorInteiros();
		System.out.println("Criar array B");
		int[] arrayB = criarVetorInteiros();
		
		int resultado = Exercicios.produtoEscalarDeDoisArrays(arrayA, arrayB);
		
		System.out.println(resultado);
	}
	
	/**
	 * Verifica o produto dos elementos pares.
	 */
	private static void produtoNumerosPares() {
		System.out.println("Criar array");
		int[] array = criarVetorInteiros();
		int resultado = Exercicios.produtoNumerosPares(array);
		System.out.println(resultado);
	}
	
	/**
	 * Recebe um vetor de double de qualquer tamanho e posiciona o maior elemento na
última posição do vetor.
	 */
	private static void ordenarMaior() {
		System.out.println("Criar vetor");
		double[] vetor = criarVetorDouble();
		ArrayList<Double> resultado = Exercicios.ordenarMaior(vetor);
		System.out.println(resultado);
	}
	
	/**
	 * Cria a série de Fibonacci.
	 */
	public static void criarSerieFibonacci() {
		int quantidade = Console.recuperaInteiro("Informe o tamanho da sequência:");
		ArrayList<Integer> fiboArray = Exercicios.criarSerieFibonacciComArray(quantidade);
		System.out.println(fiboArray);
	}
	
	/**
	 * Analisa um vetor (maior, menor, soma e média dos elementos).
	 */
	private static void analisarVetor() {
		System.out.println("Criar array");
		double[] A = criarVetorDouble();
		ArrayList<Double> resultado = Exercicios.analisarVetor(A);
		System.out.println(resultado);
	}
	
	/**
	 * Mescla os elementos de dois vetores.
	 */
	public static void mesclarVetores() {
		System.out.println("Criar arrayA");
		int[] arrayA = criarVetorInteiros();
		System.out.println("Criar arrayB");
		int[] arrayB = criarVetorInteiros();
		ArrayList<Integer> arrayC = Exercicios.mesclarVetores(arrayA, arrayB);
		System.out.println(arrayC);
	}
	
	/**
	 * Mostra os elementos repetidos de um vetor.
	 */
	public static void elementosRepetidos() {
		double[] vetor = recuperaVetor();
		Exercicios.mostrarElementosRepetidos(vetor);
	}
	
	/**
	 * Preenche vetores com valores crescentes.
	 */
	public static void preencheSempreMaiores() {
		Exercicios.preencheVetorCrescente();
	}
	
	/**
	 * Concatena dois vetores.
	 */
	public static void concatencaoVetores() {
		System.out.println("Digite os valores do vetor A:");
		double[] vetorA = recuperaVetor();
		System.out.println("Digite os valores do vetor B:");
		double[] vetorB = recuperaVetor();
		System.out.print("O vetor ");
		imprimirVetorDouble(vetorA);
		System.out.print(" concatenado com o vetor ");
		imprimirVetorDouble(vetorB);
		System.out.print(" é igual a ");
		double[] vetoresConcatenados = Exercicios.concatenarVetor(vetorA, vetorB);
		imprimirVetorDouble(vetoresConcatenados);
		System.out.print(".");
	}
	
	/**
	 * Une dois vetores.
	 */
	public static void uniaoVetores() {
		double[] vetorA = recuperaVetor();
		System.out.println("Digite os valores do segundo vetor:");
		double[] vetorB = recuperaVetor();
		System.out.print("A união do vetor ");
		imprimirVetorDouble(vetorA);
		System.out.print(" e o vetor ");
		imprimirVetorDouble(vetorB);
		System.out.print(" é igual a ");
		double[] uniao = Exercicios.unirVetores(vetorA, vetorB);
		imprimirVetorDouble(uniao);
		System.out.print(".");
	}
	
	/**
	 * Intersecta dois vetores.
	 */
	public static void intersecaoVetores() {
		double[] vetorA = recuperaVetor();
		System.out.println("Digite os valores do segundo vetor:");
		double[] vetorB = recuperaVetor();
		double[] intersecao = Exercicios.intersecaoVetores(vetorA, vetorB);
		System.out.print("A interseção do vetor ");
		imprimirVetorDouble(vetorA);
		System.out.print(" e o vetor ");
		imprimirVetorDouble(vetorB);
		System.out.print(" é igual a ");
		imprimirVetorDouble(intersecao);
		System.out.print(".");
	}
	
}