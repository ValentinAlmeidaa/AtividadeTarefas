package br.ucsal.app;

import br.ucsal.app.Tarefa;

public class GerenciadorTarefas {
	
	//Atributos
	private Tarefa[] minhasTarefas;
	private int quantidadeTarefas;
	
	//Construtor
		GerenciadorTarefas() {
			this.minhasTarefas = new Tarefa[500];
			this.quantidadeTarefas = 0;
		}
	
		
	public void adicionarTarefas(Tarefa tarefa) {
		if(this.existeTarefa(tarefa) == false) {
			this.minhasTarefas[quantidadeTarefas] = tarefa;
			//quantidadeTarefas = quantidadeTarefas + 1;
			this.quantidadeTarefas++;
		}
	}


	private boolean existeTarefa(Tarefa busca) {
		for(int i = 0; i < this.quantidadeTarefas ; i++ ) {
			Tarefa tarefa = this.minhasTarefas[i];
			if(tarefa.getTitulo().equals(busca.getTitulo())) {
				return true;
			}
		}
		return false;
	}
	public Tarefa pesquisarTarefa(String byTitulo) {
		
		for(int i = 0; i < this.quantidadeTarefas ; i++ ) {
			Tarefa tarefa = this.minhasTarefas[i];
			if(tarefa.getTitulo().contains(byTitulo)) {
				return tarefa;
			}
		}
		return null;
	}

}
