package br.com.fiap.bo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.fiap.DTO.VeiculoTO;

public class VeiculoBO {
	public static final Logger log = LoggerFactory.getLogger(VeiculoBO.class);
	
	public void cadastrar(VeiculoTO veiculo){
		log.debug("Cadastrando um veiculo");
		if(veiculo == null){
			log.error("Veiculo vazio");
		}
	}
}
