package br.com.fiap.presentation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.fiap.bo.VeiculoBO;

public class ConsoleView {
	public static final Logger log = LoggerFactory.getLogger(VeiculoBO.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.trace("Iniciando a aplicação");
		VeiculoBO bo = new VeiculoBO();
		bo.cadastrar(null);
		log.info("Finalizando a aplicação");
	}

}
