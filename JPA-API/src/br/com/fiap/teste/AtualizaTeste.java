package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Conta;

public class AtualizaTeste {

	//Operação de select não precisa de commit ou begin
	public static void main(String[] args) {
		//Crio a fábrica
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		//Crio Entity Manager
		EntityManager em = fabrica.createEntityManager();
		//Segundo parâmetro é sempre a chave primária
		Conta conta = em.find(Conta.class, 1);
		System.out.println(conta.getNomeTitular());
		
		//Atualiza a conta
		conta.setSaldo(10000);
		conta.setNomeTitular("Reinaldo");
		
		em.getTransaction().begin();
		//Merge é tipo o update
		em.merge(conta);
		em.getTransaction().commit();
		
		em.close();
		System.exit(0);
	}
}
