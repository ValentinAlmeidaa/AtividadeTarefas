package br.ucsal.app;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import br.ucsal.app.Tarefa;


public class Principal {

	public static void main(String[] args) {
		
		GerenciadorTarefas meuGC= new GerenciadorTarefas();
		Tarefa tarefa= new Tarefa("Faculdade", "Palestra Do Professor", "Não concluido");
		
		meuGC.adicionarTarefas(tarefa);
		
		Tarefa tarefa1= new Tarefa("Trabalho", "Dia de promoção", "Concluida");
		meuGC.adicionarTarefas(tarefa1);
		
		Tarefa tarefa2= new Tarefa("Encontro", "Sair com Anita", "Não concluido");
		meuGC.adicionarTarefas(tarefa2);
		
		Tarefa x= meuGC.pesquisarTarefa("Faculdade");
		System.out.println(x);
		
		x = meuGC.pesquisarTarefa("Trabalho");
		System.out.println(x);
		
		if(x != null) {
			System.out.println(x.toString());
		}else {
			System.out.println(x);
		}
		
	}
}
