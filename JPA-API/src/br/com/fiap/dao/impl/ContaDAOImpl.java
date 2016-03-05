package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ContaDAO;
import br.com.fiap.entity.Conta;

public class ContaDAOImpl implements ContaDAO {

	private EntityManager em;
	
	//Cadastrar os métodos
	
	@Override
	public void cadastrar(Conta conta) {
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();
	}

	@Override
	public void excluir(int codigo) {
		//Primeiro devemos buscar 
		Conta conta = em.find(Conta.class, 1);
		em.getTransaction().begin();
		em.remove(conta);
		em.getTransaction().commit();
	}

	@Override
	public void atualizar(Conta conta) {
		em.getTransaction().begin();
		em.merge(conta);
		em.getTransaction().commit();
	}

	@Override
	public Conta buscarPorCodigo(int codigo) {
			return null;
	}
}
