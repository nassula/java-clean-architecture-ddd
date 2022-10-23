package br.com.nass.escola.aplicacao.indicacao;

import br.com.nass.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);

}
