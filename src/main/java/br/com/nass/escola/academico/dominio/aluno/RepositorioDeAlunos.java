package br.com.nass.escola.academico.dominio.aluno;

import java.util.List;

import br.com.alura.escola.shared.dominio.CPF;
import br.com.nass.escola.shared.dominio.CPF;

public interface RepositorioDeAlunos {
	
	void matricular(Aluno aluno);
	
	Aluno buscarPorCPF(CPF cpf);
	
	List<Aluno> listarTodosAlunosMatriculados();
	
	//...

}
