package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.ContaDAO;
import br.com.fiap.dao.impl.ContaDAOImpl;

public class DAOTeste {
	
public static void main(String[] args) {
	EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
	EntityManager em = fabrica.createEntityManager();
	
	ContaDAO dao = new ContaDAOImpl(em);
	
}
}
