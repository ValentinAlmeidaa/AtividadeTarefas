package br.ucsal.app;

/**
 * Esta classe representa uma
 * tarefa
 * @author valentinalmeidaa
 *
 */

public class Tarefa {
	
	private String titulo;
	private String descricao;
	private String concluido;
	
	public Tarefa(String titulo, String descricao, String concluido) {
		this.setTitulo(titulo);
		this.setDescricao(descricao);
		this.concluido= concluido;
	}

	// void set + Nome do Atributo (Parametro Tipo do Atributo variavel)
	public void setDescricao(String descricao) {
		this.descricao=descricao;
		
	}
	public String getDescricao() {
		return this.descricao;
	}

	public void setTitulo(String titulo) {
		String[] titulos = titulo.split(" ");
		this.titulo=titulos[0];
	}
	public String getTitulo() {
		return this.titulo;
	}
	// Tipo do Atributo get + Nome do Atributo
	public String getConcluido() {
		return this.concluido;
	}
	public void setConcluido(String concluido) {
		this.concluido=concluido;
	}
	public String toString() {
		return "Titulo: "+this.getTitulo()+"\nDescrição: "+this.getDescricao()+"\n "+this.concluido+"\n";
	}
}
