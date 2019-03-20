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
		String[] opcoes = {"Mostrar vetor",
				           "Mostrar Array",
				           "Maior elemento",
				           "Menor elemento"};
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Lista 02", null);
			switch (opcao) {
			case 1:
				int[] vetor = criarVetorInteiros();
				imprimirVetorInteiros(vetor);
				break;
				
			case 2:
				ArrayList<Integer> array = criarArrayDeInteiros();
				System.out.println(array);
				break;
				
			case 3:
				ArrayList<Integer> maiores = criarArrayDeInteiros();
				Integer maior = Collections.max(maiores);
				System.out.println("O maior elemento do array " + maiores + " é " + maior + ".");
				break;
				
			case 4:
				ArrayList<Integer> menores = criarArrayDeInteiros();
				Integer menor = Collections.min(menores);
				System.out.println("O menor elemento do array " + menores + " é " + menor + ".");
				break;
				
			case -1:
				continua = false;
				System.out.println("Saindo do sistema...");
				break;
			}
		} while (continua);
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
	 * Cria um vetor de inteiros com a quantidade escolhida pelo usuário.
	 * 
	 * @return
	 */
	public static int[] criarVetorInteiros() {
		int quantidade = Console.recuperaInteiro("Informe a quantidade:");
		int[] valores = new int[quantidade];
		for (int i = 0; i < quantidade; i++) {
			valores[i] = Console.recuperaInteiro("Informe o valor " + (i + 1) + ":");
		}
		return valores;
	}
	
}