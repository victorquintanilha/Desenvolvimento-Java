package lista03;

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
	
}