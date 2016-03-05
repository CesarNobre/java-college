package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Conta;

public class RemoveTeste {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		//Remover uma conta
		Conta conta = em.find(Conta.class, 1);
		em.remove(conta);
		em.getTransaction().commit();
		
		em.close();
		System.exit(0);
	}
}
