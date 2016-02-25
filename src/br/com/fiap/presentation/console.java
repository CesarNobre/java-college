package br.com.fiap.presentation;

import br.com.fiap.bean.Aluno;
import br.com.fiap.notation.Tabela;

public class console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno cesar = new Aluno("Cesar",80,26);
		Tabela t = cesar.getClass().getAnnotation(Tabela.class);
		System.out.println(t.toString());
	}	

}
