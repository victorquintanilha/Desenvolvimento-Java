package lista03;

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
		String[] opcoes = {"Peso ideal",
						   "Calcular Báskara"};
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
				
			case -1:
				continua = false;
				break;
			}
		} while (continua);
	}
	
	/**
	 * Faz a execução de tela do cálculo de peso ideal.
	 */
	public static void calcularPesoIdeal() {
		// Pega as variáveis do teclado
		String sexo = Console.recuperaTexto("Informe o sexo, M para masculino e F para feminino:");
		double h = Console.recuperaDecimal("Informe a sua altura:");
		
		// Executa a conta
		double pesoIdeal = Exercicios.calcularPesoIdeal(h, sexo);
		
		// Mostra o resultado na tela
		System.out.printf("O seu peso ideal é: %.2f\n\n", pesoIdeal);
	}
	
	/**
	 * Calcula a equação do segundo grau conforme Báskara.
	 */
	private static void calcularBaskara() {
		double a = Console.recuperaDecimal("Informe o termo a:");
		double b = Console.recuperaDecimal("Informe o termo b:");
		double c = Console.recuperaDecimal("Informe o termo c:");
		double[] raizes = Exercicios.calcularEquacao2Grau(a, b, c);
		
		if(raizes.length == 0) {
			System.out.println("Não existem raízes reais!");
		}
		
		if(raizes.length == 1) {
			System.out.println("Existe uma raiz real: " + raizes[0]);
		}
		
		if(raizes.length == 2) {
			System.out.println("Raiz 1: " + raizes[0]);
			System.out.println("Raiz 2: " + raizes[1]);
		}
	}
	
}