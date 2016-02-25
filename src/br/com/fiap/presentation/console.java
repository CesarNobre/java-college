package br.com.fiap.presentation;

import br.com.fiap.bean.Aluno;
import br.com.fiap.dao.GenericDao;
import br.com.fiap.notation.Tabela;

public class console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno cesar = new Aluno("Cesar",80,26);
		GenericDao dao = new GenericDao();
		dao.generateSQL(cesar);		
	}	

}
