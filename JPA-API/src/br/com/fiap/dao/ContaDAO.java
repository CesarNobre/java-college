package br.com.fiap.dao;

import br.com.fiap.entity.Conta;

public interface ContaDAO {

	void cadastrar(Conta conta);
	void excluir(int codigo);
	void atualizar(Conta conta);
	Conta buscarPorCodigo(int codigo);
}
