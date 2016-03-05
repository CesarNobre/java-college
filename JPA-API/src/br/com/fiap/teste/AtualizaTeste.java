package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Conta;

public class AtualizaTeste {

	//Opera��o de select n�o precisa de commit ou begin
	public static void main(String[] args) {
		//Crio a f�brica
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		//Crio Entity Manager
		EntityManager em = fabrica.createEntityManager();
		//Segundo par�metro � sempre a chave prim�ria
		Conta conta = em.find(Conta.class, 1);
		System.out.println(conta.getNomeTitular());
		
		//Atualiza a conta
		conta.setSaldo(10000);
		conta.setNomeTitular("Reinaldo");
		
		em.getTransaction().begin();
		//Merge � tipo o update
		em.merge(conta);
		em.getTransaction().commit();
		
		em.close();
		System.exit(0);
	}
}
