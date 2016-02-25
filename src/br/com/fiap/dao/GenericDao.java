package br.com.fiap.dao;

import br.com.fiap.notation.Tabela;

public class GenericDao {
	public void generateSQL(Object obj){
		Tabela anotacao = obj.getClass().getAnnotation(Tabela.class);
		System.out.println("SELECT * FROM " + anotacao.nome());
	}
}
