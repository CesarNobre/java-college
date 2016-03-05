package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Conta;

public class RefreshTeste {

	public static void main(String[] args) {
		//Atualiza o objeto com informações do banco
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		//Buscar uma conta
		Conta conta = em.find(Conta.class, 1);
		
		conta.setNomeTitular("Lula");
		System.out.println(conta.getNomeTitular());
		
		em.refresh(conta);
		System.out.println(conta.getNomeTitular());
		em.close();
		System.exit(0);
	}
}
