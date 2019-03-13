package lista01;

/**
 * Classe para executar os exercícios da Lista 01
 * @author 1829203
 *
 */
public class Exercicios {
	
	/**
	 * Calcula o Enésimo termo da PA.
	 * 
	 * @param a1 - primeiro termo.
	 * @param n - indice do enésimo termo.
	 * @param r - razão da PA.
	 * @return O Enésimo termo da PA.
	 */
	public static int calcularEnesimoTermoPA (int a1, int n, int r) {
		int an = a1 + (n-1) * r;
		return an;
	}
	
}