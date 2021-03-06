package br.com.fiap.presentation;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Sexo;

public class console {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Cesar");
		cliente.setEmail("cesarnobrefilho@gmail.com");
		cliente.setLogado(true);
		cliente.setDataNascimento(
				new GregorianCalendar(1996,Calendar.SEPTEMBER, 13));
		cliente.setSexo(Sexo.MASCULINO);
		
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
