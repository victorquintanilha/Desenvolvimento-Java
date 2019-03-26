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
	
}
