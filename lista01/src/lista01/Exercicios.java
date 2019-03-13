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
	 * @param r - razăo da PA.
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
	
	/**
	 * Calcula a média ponderada de 3 notas.
	 * 
	 * @param n1 Primeira nota do aluno.
	 * @param n2 Segunda nota do aluno.
	 * @param n3 Terceira nota do aluno.
	 * @param peso1 Peso da primeira nota do aluno.
	 * @param peso2 Peso da segunda nota do aluno.
	 * @param peso3 Peso da terceira nota do aluno.
	 * @return Média ponderada das 3 notas recebidas.
	 */
	public static double calcularMediaPonderadaAluno (double n1, double n2, double n3, int peso1, int peso2, int peso3) {
		double mediaPonderada = ((n1 * peso1) + (n2 * peso2) + (n3 * peso3)) / (peso1 + peso2 + peso3);
		return mediaPonderada;
	}
	
	/**
	 * Calcula a média harmônica de três notas.
	 * 
	 * @param nota1 Primeira nota do aluno.
	 * @param nota2	Segunda nota do aluno.
	 * @param nota3 Terceira nota do aluno.
	 * @return a média harmônica das três notas.
	 */
	public static double calcularMediaHarmonica (double nota1, double nota2, double nota3) {
		return 3 / (1 / nota1 + 1 / nota2 + 1 / nota3);
	}
	
	/**
	 * Converte uma temperatura em Celsius para Fahrenheit.
	 * 
	 * @param c - Temperatura em Celsius.
	 * @return - Retorna a temperatura convertida em Fahrenheit.
	 */
	public static double converterDeCelsiusParaFahrenheit (double c) {
		double f = (9 * c + 160) / 5;
		return f;
	}
	
}