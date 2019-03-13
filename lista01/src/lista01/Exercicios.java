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
	
	/**
	 * Calcula a distância entre dois pontos no plano cartesiano.
	 * @param x1 Coordenada x do ponto 1.
	 * @param y1 Coordenada y do ponto 1.
	 * @param x2 Coordenada x do ponto 2.
	 * @param y2 Coordenada y do ponto 2.
	 * @return A distância entre os pontos.
	 */
	public static double calcularDistanciaEntrePontos(double x1, double y1, double x2, double y2) {
		
		//double distancia = Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
		
		double distanciaX = x2 - x1;
		double distanciaY = y2 - y1;
		double quadradoDistanciaX = Math.pow(distanciaX, 2);
		double quadradoDistanciaY = Math.pow(distanciaY, 2);
		double somaQuadradoDistancias = quadradoDistanciaX + quadradoDistanciaY;
		double distancia = Math.sqrt(somaQuadradoDistancias);
		return distancia;
	}
	
	/**
	 * Calcula a média aritmética de 3 notas.
	 * 
	 * @param n1 Primeira nota do aluno.
	 * @param n2 Segunda nota do aluno.
	 * @param n3 Terceira nota do aluno.
	 * @return Média aritmética das 3 notas recebidas.
	 */
	public static double calcularMediaAritmeticaAluno (double n1, double n2, double n3) {
		double mediaAritmetica = (n1 + n2 + n3) / 3;
		return mediaAritmetica;
	}
	
}