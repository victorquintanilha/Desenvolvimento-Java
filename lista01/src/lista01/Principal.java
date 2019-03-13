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
		
		String[] opcoes = {"Enésimo termo PA",
						   "Distância entre pontos",
						   "Média aritmética",
						   "Média ponderada",
						   "Média harmônica",
						   "Conversão de temperaturas"};
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Lista 01", null);
			switch (opcao) {
			case 1:
				calcularEnesimoTermoPA();
				break;
				
			case 2:
				calcularEnesimoTermoPA();
				break;
				
			case 3:
				calcularMediaAritmeticaAluno();
				break;
				
			case 4:
				calcularMediaPonderadaAluno();
				break;
				
			case 5:
				calcularMediaHarmonica();
				break;
				
			case 6:
				converterDeCelsiusParaFahrenheit();
				break;
				
			case -1:
				continua = false;
				break;
			}
		} while (continua);
	}
	
	/**
	 * Faz a execução de tela do cálculo do enésimo termo da PA.
	 */
	public static void calcularEnesimoTermoPA() {
		// Pega as variáveis do teclado
		int a1 = Console.recuperaInteiro("Digite o termo a1:");
		int n = Console.recuperaInteiro("Digite o n:");
		int r = Console.recuperaInteiro("Digite a razão:");

		// Executa a conta
		int an = Exercicios.calcularEnesimoTermoPA(a1, n, r);

		// Mostra o resultado na tela
		System.out.println("O resultado é: " + an);
	}
	
	/**
	 * Faz a execução de tela da distância entre pontos.
	 */
	public static void calcularDistanciaEntrePontos() {
		// Pega os pontos do teclado
		double x1 = Console.recuperaDecimal("A coordenada X do ponto 1:");
		double y1 = Console.recuperaDecimal("A coordenada Y do ponto 1:");
		double x2 = Console.recuperaDecimal("A coordenada X do ponto 2:");
		double y2 = Console.recuperaDecimal("A coordenada Y do ponto 2:");
		
		// Executa a conta
		double distancia = Exercicios.calcularDistanciaEntrePontos(x1, y1, x2, y2);
		
		// Mostra o resultado na tela
		//System.out.println("A distância é: " + distancia);
		System.out.printf("A distância é: %.4f", distancia);
	}
	
	/**
	 * Faz a execução de tela do cálculo da média aritmética de 3 notas.
	 */
	public static void calcularMediaAritmeticaAluno() {
		// Pega as 3 notas do teclado
		double n1 = Console.recuperaDecimal("Digite a primeira nota:");
		double n2 = Console.recuperaDecimal("Digite a segunda nota:");
		double n3 = Console.recuperaDecimal("Digite a terceira nota:");
		
		// Executa a conta
		double mediaAritmetica = Exercicios.calcularMediaAritmeticaAluno(n1, n2, n3);
		
		// Mostra o resultado na tela
		//System.out.println("O resultado é: " + String.format("%.2f", mediaAritmetica));
		System.out.printf("O resultado é: %.2f", mediaAritmetica);
	}
	
	/**
	 * Faz a execução de tela do cálculo da média ponderada de 3 notas.
	 */
	public static void calcularMediaPonderadaAluno() {
		// Pega as 3 notas e os 3 pesos do teclado
		double n1 = Console.recuperaDecimal("Digite a primeira nota:");
		double n2 = Console.recuperaDecimal("Digite a segunda nota:");
		double n3 = Console.recuperaDecimal("Digite a terceira nota:");
		int peso1 = Console.recuperaInteiro("Digite o peso da 1ª nota:");
		int peso2 = Console.recuperaInteiro("Digite o peso da 2ª nota:");
		int peso3 = Console.recuperaInteiro("Digite o peso da 3ª nota:");
		
		// Executa a conta
		double mediaPonderada = Exercicios.calcularMediaPonderadaAluno(n1, n2, n3, peso1, peso2, peso3);
		
		// Mostra o resultado na tela
		System.out.printf("O resultado é: %.2f", mediaPonderada);
	}
	
	/**
	 * Faz a execução de tela do cálculo da média harmônica.
	 */
	public static void calcularMediaHarmonica() {
		// Pega as 3 notas do teclado
		double nota1 = Console.recuperaDecimal("Digite a primeira nota:");
		double nota2 = Console.recuperaDecimal("Digite a segunda nota:");
		double nota3 = Console.recuperaDecimal("Digite a terceira nota:");
		
		// Executa a conta
		double mediaHarmonica = Exercicios.calcularMediaHarmonica(nota1, nota2, nota3);
		
		// Mostra o resultado na tela
		System.out.printf("O resultado é: %.2f", mediaHarmonica);
	}
	
	/**
	 * Faz a execução de tela da conversão de uma temperatura de Celsius para Fahrenheit.
	 */
	public static void converterDeCelsiusParaFahrenheit() {
		// Pega a temperatura em Celsius do teclado
		double c = Console.recuperaDecimal("Digite uma temperatura em Celsius:");
		
		// Executa a conversão
		double conversaoCelsiusParaFahrenheit = Exercicios.converterDeCelsiusParaFahrenheit(c);
		
		// Mostra o resultado da conversão na tela.
		System.out.printf("A temperatura em Fahrenheit é: %.2f", conversaoCelsiusParaFahrenheit);
	}
	
}