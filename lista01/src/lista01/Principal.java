package lista01;

/**
 * A classe Principal do sistema.
 * 
 * @author 1829203
 * @version 1.0
 * @since 28/02/2019
 *
 */
public class Principal {
	
	/**
	 * Função para iniciar o programa.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a1 = Console.recuperaInteiro("Digite o termo a1:");
		int n = Console.recuperaInteiro("Digite o n:");
		int r = Console.recuperaInteiro("Digite a razão:");
		
		int an = Exercicios.calcularEnesimoTermoPA(a1, n, r);
		
		System.out.println("O resultado é: "+an);
		
	}
	
}