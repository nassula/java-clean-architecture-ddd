package br.com.nass.escola;

import br.com.nass.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.nass.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.nass.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.nass.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import br.com.nass.escola.gamificacao.aplicacao.GeraSeloAlunoNovato;
import br.com.nass.escola.gamificacao.infra.selo.RepositorioDeSelosEmMemoria;
import br.com.nass.escola.shared.dominio.evento.PublicadorDeEventos;
import br.com.nass.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.nass.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.nass.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.nass.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import br.com.nass.escola.gamificacao.infra.selo.RepositorioDeSelosEmMemoria;
import br.com.nass.escola.shared.dominio.evento.PublicadorDeEventos;

public class MatricularAlunoPorLinhaDeComando {
	
	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulano@email.com";
		
		MatricularAlunoDto dto = new MatricularAlunoDto(
				nome, cpf, email);
		
		PublicadorDeEventos publicador = new PublicadorDeEventos();
		publicador.adicionar(new LogDeAlunoMatriculado());
		publicador.adicionar(new GeraSeloAlunoNovato(
				new RepositorioDeSelosEmMemoria()));
		
		MatricularAluno matricular = new MatricularAluno(
				new RepositorioDeAlunosEmMemoria(), publicador);
		
		matricular.executa(dto);
	}

}
