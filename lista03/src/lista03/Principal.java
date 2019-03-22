package lista03;

import java.util.ArrayList;

/**
 * A classe Principal do sistema.
 * 
 * @author 1829203
 *
 */
public class Principal {
	
	/**
	 * Fun��o para iniciar o programa.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String[] opcoes = {"Peso ideal",
						   "Calcular B�skara",
						   "Fibonacci Vetor e Array"};
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Lista 03", null);
			switch (opcao) {
			case 1:
				calcularPesoIdeal();
				break;
				
			case 2:
				calcularBaskara();
				break;
				
			case 3:
				criarSerieFibonacci();
				break;
				
			case -1:
				continua = false;
				break;
			}
		} while (continua);
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
	 * Faz a execu��o de tela do c�lculo de peso ideal.
	 */
	public static void calcularPesoIdeal() {
		// Pega as vari�veis do teclado
		String sexo = Console.recuperaTexto("Informe o sexo, M para masculino e F para feminino:");
		double h = Console.recuperaDecimal("Informe a sua altura:");
		
		// Executa a conta
		double pesoIdeal = Exercicios.calcularPesoIdeal(h, sexo);
		
		// Mostra o resultado na tela
		System.out.printf("O seu peso ideal �: %.2f\n\n", pesoIdeal);
	}
	
	/**
	 * Calcula a equa��o do segundo grau conforme B�skara.
	 */
	private static void calcularBaskara() {
		double a = Console.recuperaDecimal("Informe o termo a:");
		double b = Console.recuperaDecimal("Informe o termo b:");
		double c = Console.recuperaDecimal("Informe o termo c:");
		double[] raizes = Exercicios.calcularEquacao2Grau(a, b, c);
		
		if(raizes.length == 0) {
			System.out.println("N�o existem ra�zes reais!");
		}
		
		if(raizes.length == 1) {
			System.out.println("Existe uma raiz real: " + raizes[0]);
		}
		
		if(raizes.length == 2) {
			System.out.println("Raiz 1: " + raizes[0]);
			System.out.println("Raiz 2: " + raizes[1]);
		}
	}
	
	/**
	 * Cria a s�rie de Fibonacci com vetor e Array com o tamanho informado pelo usu�rio.
	 */
	private static void criarSerieFibonacci() {
		int quantidade = Console.recuperaInteiro("Informe a quantidade de elementos da s�rie:");
		
		int[] fiboVetor = Exercicios.criaSerieFibonacciComVetor(quantidade);
		System.out.println("Vetor primitivo");
		imprimirVetorInteiros(fiboVetor);
		System.out.println("ArrayList");
		ArrayList<Integer> fiboArray = Exercicios.criarSerieFibonacciComArray(quantidade);
		System.out.println(fiboArray);
	}
	
}