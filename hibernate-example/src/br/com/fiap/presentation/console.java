package br.com.fiap.presentation;

import br.com.fiap.entity.Cliente;

public class console {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Cesar");
		cliente.setEmail("cesarnobrefilho@gmail.com");
		cliente.setLogado(true);
		;
	}

}
