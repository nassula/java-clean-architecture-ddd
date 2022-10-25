package br.com.nass.escola.shared.dominio.evento;

import br.com.nass.escola.academico.dominio.aluno.LogDeAlunoMatriculado;

import java.util.ArrayList;
import java.util.List;

public class PublicadorDeEventos {
	
	private List<Ouvinte> ouvintes = new ArrayList<>();

	public void adicionar(LogDeAlunoMatriculado ouvinte) {
		this.ouvintes.add(ouvinte);
	}
	
	public void publicar(Evento evento) {
		this.ouvintes.forEach(o -> {
			o.processa(evento);
		});
	}

}
