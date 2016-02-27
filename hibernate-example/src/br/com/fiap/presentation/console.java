package br.com.fiap.presentation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Sexo;

public class console {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Cesar");
		cliente.setEmail("cesarnobrefilho@gmail.com");
		cliente.setLogado(true);
		cliente.setFoto(new byte[255]);
		cliente.setSexo(Sexo.MASCULINO);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.close();
	}

}