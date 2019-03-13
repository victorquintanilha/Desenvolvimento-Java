package lista01;

/**
 * Classe para executar os exerc�cios da Lista 01
 * @author 1829203
 *
 */
public class Exercicios {
	
	/**
	 * Calcula o En�simo termo da PA.
	 * 
	 * @param a1 - primeiro termo.
	 * @param n - indice do en�simo termo.
	 * @param r - raz�o da PA.
	 * @return O En�simo termo da PA.
	 */
	public static int calcularEnesimoTermoPA (int a1, int n, int r) {
		int an = a1 + (n-1) * r;
		return an;
	}
	
}