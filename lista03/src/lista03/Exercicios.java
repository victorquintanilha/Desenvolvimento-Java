package lista03;

import java.util.ArrayList;

/**
 * Classe para desenvolver os exercícios da lista 03.
 * 
 * @author 1829203
 *
 */
public class Exercicios {
	
	/**
	 * Primeiro fator fixo para utilização do cálculo de peso ideal para homens.
	 */
	public static final double FATOR_MASCULINO_1 = 72.7d;
	
	/**
	 * Segundo fator fixo para utilização do cálculo de peso ideal para homens.
	 */
	public static final double FATOR_MASCULINO_2 = 58d;
	
	/**
	 * Primeiro fator fixo para utilização do cálculo de peso ideal para mulheres.
	 */
	public static final double FATOR_FEMININO_1 = 62.1d;
	
	/**
	 * Segundo fator fixo para utilização do cálculo de peso ideal para mulheres.
	 */
	public static final double FATOR_FEMININO_2 = 44.7d;
	
	/**
	 * Calcula o peso ideal de uma pessoa baseado no sexo e na altura.
	 * 
	 * @param h Altura em metros da pessoa.
	 * @param sexo Sexo, utilize M para Masculino e F pra Feminino.
	 * @return O peso ideal em Kg.
	 */
	public static double calcularPesoIdeal (double h, String sexo) {
		
		double pesoIdeal = 0d;
		
		/*	sexo == "M"
			sexo.equals("M")
			sexo.equalsIgnoreCase("M") */
		
		if (sexo.equalsIgnoreCase("F")) {
			pesoIdeal = (FATOR_FEMININO_1 * h) - FATOR_FEMININO_2;
		}
		
		if (sexo.equalsIgnoreCase("M")) {
			pesoIdeal = (FATOR_MASCULINO_1 * h) - FATOR_MASCULINO_2;
		}
		
		return pesoIdeal;
		
	}
	
	/**
	 * Faz o cálculo de Báskara para a equação do segundo grau.
	 * 
	 * @param a Termo em x ao quadrado.
	 * @param b Termo em x.
	 * @param c Termo em x elevado a zero.
	 * @return
	 */
	public static double[] calcularEquacao2Grau (double a, double b, double c) {
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		if(delta < 0) {
			// Não tem raízes reais.
			double[] vazio = {};
			return vazio;
		}
		
		if(delta == 0) {
			// Apenas uma raíz real.
			double raiz = -b / 2 * a;
			double[] umaRaiz = {raiz};
			return umaRaiz;
		}
		
		// Duas raízes reais.
		double raiz1 = (-b + Math.sqrt(delta)) / 2 * a;
		double raiz2 = (-b - Math.sqrt(delta)) / 2 * a;
		double[] raizes = {raiz1, raiz2};
		return raizes;
	}
	
	/**
	 * Cria a série de Fibonacci utilizando Vetor primitivo.
	 * 
	 * @param quantidade Quantidade de elementos da série.
	 * @return Um vetor primitivo de inteiros com a série de Fibonacci.
	 */
	public static int[] criaSerieFibonacciComVetor(int quantidade) {
		
		int[] fibonacci = new int[quantidade];
		
		for (int i = 0; i < fibonacci.length; i++) {
			if (i == 0 || i == 1) {
				fibonacci[i] = 1;
			} else {
				fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
			}
		}
		
		return fibonacci;
		
	}
	
	/**
	 * Cria a série de Fibonacci utilizando {@link ArrayList}.
	 * 
	 * @param quantidade Quantidade de elementos da série.
	 * @return Um {@link ArrayList} de inteiros com a série de Fibonacci.
	 */
	public static ArrayList<Integer> criarSerieFibonacciComArray(int quantidade) {
		
		ArrayList<Integer> fibonacci = new ArrayList<>();
		for (int i = 0; i < quantidade; i++) {
			if (i == 0 || i == 1) {
				fibonacci.add(1);
			} else {
				int valor = fibonacci.get(i-1) + fibonacci.get(i-2);
				fibonacci.add(valor);
			}
		}
		return fibonacci;
		
	}
	
}