package lista02;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Classe para executar os exercícios da lista 02
 * 
 * @author 1829203
 *
 */
public class Exercicios {
	
	/**
	 * Procura um elemento no vetor. Se encontrar retorna true, caso contrário retorna false.
	 * 
	 * @param vetor
	 * @param elemento
	 * @return
	 */
	public static boolean procurarElemento(double[] vetor, double elemento) {
		for (double item : vetor) {
			if (item == elemento) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Adiciona um elemento no vetor.
	 * 
	 * @param vetor
	 * @param elemento
	 * @return
	 */
	public static double[] adicionarElemento(double[] vetor, double elemento) {
		/**
		 * Cria um vetor novo com uma posição a mais para poder armazenar mais um elemento.
		 */
		double[] vetorRetorno = new double[vetor.length + 1];
		/**
		 * Percorre a lista para fazer a cópia do vetor anterior para o novo.
		 */
		for (int i = 0; i < vetor.length; i++) {
			vetorRetorno[i] = vetor[i];
		}
		/**
		 * Adiciona o novo elemento na última posição criada.
		 */
		vetorRetorno[vetor.length] = elemento;
		/**
		 * Ao final retorna o vetor com mais um elemento.
		 */
		return vetorRetorno;
	}
	
	/**
	 * Método que realiza a contagem de ocorrências de um determinado elemento no vetor.
	 * 
	 * @param vetor
	 * @param elemento
	 * @return
	 */
	public static int contarOcorrencias(double[] vetor, double elemento) {
		/**
		 * Variável para armazenar a quantidade de ocorrências.
		 */
		int ocorrencias = 0;
		for (double item : vetor) {
			if (item == elemento) {
				ocorrencias++;
			}
		}
		/**
		 * Ao final retorna a quantidade de ocorrências.
		 */
		return ocorrencias;
	}
	
	/**
	 * Multiplica dois vetores de double.
	 * 
	 * @param arrayA Array de double.
	 * @param arrayB Array de double.
	 * @return ArrayList com resultado da multiplicação dos itens dos arrays.
	 */
	public static ArrayList<Double> multiplicarArrays(double[] arrayA, double[] arrayB) {
		ArrayList<Double> resultado = new ArrayList<>();
		for (int i = 0; i < arrayA.length; i++) {
			resultado.add(arrayA[i] * arrayB[i]);
		}
		return resultado;
	}

	/**
	 * Produto escalar de dois vetores de double.
	 * 
	 * @param arrayA Array de inteiros.
	 * @param arrayB Array de inteiros.
	 * @return Produto escalar dos itens dos arrays.
	 */
	public static int produtoEscalarDeDoisArrays(int[] arrayA, int[] arrayB) {
		int resultado = 0;
		for (int i = 0; i < arrayA.length; i++) {
			resultado = resultado + (arrayA[i] * arrayB[i]);
		}
		return resultado;
	}
	
	/**
	 * Verifica o produto dos elementos pares.
	 * 
	 * @param Array de inteiros.
	 * @return Produto dos números pares.
	 */
	public static int produtoNumerosPares(int[] array) {
		int resultado = 1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0 && array[i] % 2 == 0) {
				resultado = resultado * array[i];
			}
			if (resultado == 1) {
				resultado = 0;
			}
		}
		return resultado;
	}
	
	/**
	 * Recebe um vetor de double de qualquer tamanho e posiciona o maior elemento na
última posição do vetor.

	 * @param array Vetor de double ordenado.
	 */
	public static ArrayList<Double> ordenarMaior(double[] array) {
		ArrayList<Double> arrayA = new ArrayList<>();
		int cont = 0;
		for (int i = 0; i < array.length; i++) {
			arrayA.add(array[i]);
		}
		Double maior = Collections.max(arrayA);
		for (int i = 0; i < array.length; i++) {
			if (array[i] == maior) {
				cont++;
				arrayA.set(array.length - cont, array[i]); // maior no último
				arrayA.set(i, array[array.length - cont]);
			}
		}
		return arrayA;
	}
	
	/**
	 * Cria a série de Fibonacci.
	 * 
	 * @param quantidade Tamanho do vetor.
	 * @return Serie de Fibonacci.
	 */
	public static ArrayList<Integer> criarSerieFibonacciComArray(int quantidade) {
		ArrayList<Integer> fibonacci = new ArrayList<>();
		for (int i = 0; i < quantidade; i++) {
			if (i == 0 || i == 1) {
				fibonacci.add(1);
			} else {
				fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
			}
		}
		return fibonacci;
	}
	
	/**
	 * Analisa um vetor (maior, menor, soma e média dos elementos).
	 * 
	 * @param A VetorA.
	 * @return VetorB com o resultado da análise.
	 */
	public static ArrayList<Double> analisarVetor(double[] A) {
		ArrayList<Double> arrayA = new ArrayList<>();
		for (int i = 0; i < A.length; i++) {
			arrayA.add(A[i]);
		}
		ArrayList<Double> arrayB = new ArrayList<>();
		arrayB.add(Collections.max(arrayA)); // Maior Elemento
		arrayB.add(Collections.min(arrayA)); // Menor Elemento
		Double soma = 0d;
		for (int i = 0; i < A.length; i++) {
			soma = soma + arrayA.get(i);
		}
		arrayB.add(soma); // Soma
		arrayB.add(soma / A.length); // Média
		return arrayB;
	}
	
	/**
	 * Mescla os elementos de dois vetores.
	 * 
	 * @param arrayA Vetor A.
	 * @param arrayB Vetor B.
	 * @return Vetor C com elementos nas posições pares de A e posições ímpares de B.
	 */
	public static ArrayList<Integer> mesclarVetores(int[] arrayA, int[] arrayB) {
		ArrayList<Integer> arrayC = new ArrayList<>();
		for (int i = 0; i < arrayA.length; i++) {
			if (i % 2 == 0) {
				arrayC.add(arrayA[i]);
			} else {
				arrayC.add(arrayB[i]);
			}
		}
		return arrayC;
	}
	
	/**
	 * Mostra os elementos repetidos de um vetor e a quantidade de repetições.
	 * 
	 * @param vetor
	 */
	public static void mostrarElementosRepetidos(double[] vetor) {
		double[] valoresAnalisados = new double[0];
		boolean primeiro = true;
		Principal.imprimirVetorDouble(vetor);
		System.out.print(" = ");
		for (double item : vetor) {
			if (procurarElemento(valoresAnalisados, item)) {
				continue;
			}
			int ocorrencias = contarOcorrencias(vetor, item);
			if (ocorrencias > 1) {
				if (!primeiro) {
					System.out.print(", ");
				}
				System.out.print(ocorrencias + " vezes o " + item);
				if (primeiro) {
					primeiro = false;
				}
				valoresAnalisados = adicionarElemento(valoresAnalisados, item);
			}
		}
		System.out.print(".");
	}
	
	/**
	 * Preenche vetor apenas com valores crescentes.
	 */
	public static void preencheVetorCrescente() {
		int quantidade = Console.recuperaInteiro("Entre com a quantidade de elementos: ");
		double[] elementos = new double[quantidade];
		elementos[0] = Console.recuperaDecimal("Entre com o elemento do vetor no índice 0:");
		for (int i = 1; i < elementos.length; i++) {
			double elemento = Console.recuperaDecimal("Entre com o elemento do vetor no índice " + i);
			if (elemento > elementos[i - 1]) {
				elementos[i] = elemento;
			} else {
				System.out.println("O valor deve ser maior que " + elementos[i] + ". Por favor digite novamente.");
				i--;
			}
		}
		System.out.print("Resultado: ");
		Principal.imprimirVetorDouble(elementos);
	}
	
	/**
	 * Realiza a concatenação de dois vetores.
	 * 
	 * @param vetorA Vetor A.
	 * @param vetorB Vetor B.
	 * @return Vetor A e B concatenados.
	 */
	public static double[] concatenarVetor(double[] vetorA, double[] vetorB) {
		/**
		 * Cria um vetor para armazenar os dados da concatenação.
		 */
		double[] concatenado = new double[vetorA.length + vetorB.length];
		for (int i = 0; i < vetorA.length; i++) {
			concatenado[i] = vetorA[i];
		}
		for (int i = 0; i < vetorB.length; i++) {
			concatenado[vetorA.length + i] = vetorB[i];
		}
		/**
		 * Ao final retorna os vetores concatenados.
		 */
		return concatenado;
	}
	
	/**
	 * Método específico para realizar a união entre dois vetores sem
	 * duplicidades.
	 * 
	 * @param vetorA
	 * @param vetorB
	 * @return
	 */
	public static double[] unirVetores(double[] vetorA, double[] vetorB) {
		/**
		 * Percorre todos os elementos do vetor B para inserir em A.
		 */
		for (double elemento : vetorB) {
			if (!procurarElemento(vetorA, elemento)) {
				vetorA = adicionarElemento(vetorA, elemento);
			}
		}
		/**
		 * Ao final retorna o vetor unificado.
		 */
		return vetorA;
	}
	
	/**
	 * Encontra os elementos com interseção entre os dois vetores sem
	 * duplicidade.
	 * 
	 * @param vetorA
	 * @param vetorB
	 * @return
	 */
	public static double[] intersecaoVetores(double[] vetorA, double[] vetorB) {
		/**
		 * Variável para armazenar os elementos de interseção.
		 */
		double[] intersecao = new double[0];
		/**
		 * Percorre todos os elementos do vetor B para verificar os
		 * correspondentes em A.
		 */
		for (double elemento : vetorB) {
			if (procurarElemento(vetorA, elemento)) {
				if (!procurarElemento(intersecao, elemento)) {
					intersecao = adicionarElemento(intersecao, elemento);
				}
			}
		}
		/**
		 * Ao final retorna o vetor com as interseções sem duplicidades.
		 */
		return intersecao;
	}
	
}
