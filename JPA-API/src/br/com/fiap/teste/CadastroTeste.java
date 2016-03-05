package br.com.fiap.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Conta;
import br.com.fiap.entity.Status;

public class CadastroTeste {

	public static void main(String[] args) {
		//Obter o EntityManager
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = factory.createEntityManager();
		
		//Cadastrar
		Conta conta = new Conta();
		conta.setStatus(Status.ATIVO);
		conta.setNomeTitular("Gabriel Loureiro");
		conta.setSaldo(1);
		conta.setDataCadastro(Calendar.getInstance());
		
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();
		
		em.close();
		System.exit(0);
	}

}
