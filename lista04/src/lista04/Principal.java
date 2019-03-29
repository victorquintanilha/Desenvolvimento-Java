package lista04;

import java.util.ArrayList;

/**
 * Classe principal de execu��o
 * 
 * @author 1829203
 *
 */
public class Principal {

	/**
	 * M�todo de entrada de execu��o.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Livro livro01 = new Livro();
		livro01.setCodigo("1598FHK");
		livro01.setTitulo("Core Java 2");
		
		ArrayList<String> autoresLivro01 = new ArrayList<>();
		autoresLivro01.add("Cay S. Horstmann");
		autoresLivro01.add("Gary Cornell");
		
		livro01.setAutores(autoresLivro01);
		
		livro01.setIsbn("0130819336");
		livro01.setAno(1999);
		
	}

}
