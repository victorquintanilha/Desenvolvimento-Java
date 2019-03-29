package lista04;

import java.util.ArrayList;

/**
 * Classe para representar um Livro.
 * 
 * @author 1829203
 *
 */
public class Livro {
	
	//Estados
	
	private String codigo;
	
	private String titulo;
	
	private ArrayList<String> autores;
	
	private String isbn;
	
	private Integer ano;
	
	//Comportamentos
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public ArrayList<String> getAutores() {
		return autores;
	}

	public void setAutores(ArrayList<String> autores) {
		this.autores = autores;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
}