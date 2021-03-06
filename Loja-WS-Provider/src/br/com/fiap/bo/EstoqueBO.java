package br.com.fiap.bo;

import org.apache.axis2.AxisFault;

import br.com.fiap.to.ProdutoTO;

public class EstoqueBO {
	public ProdutoTO buscarProduto(int codigo) 
			throws AxisFault {
		ProdutoTO produto;
		
		switch (codigo) {
		case 401:
			produto = new ProdutoTO(401,"Camisa Branca",15,100);
			break;
		case 402:
			produto = new ProdutoTO(402,"Camisa Rosa",25,50);
			break;

		default:
			throw new AxisFault("erro");
		}
		
		return produto;
	}
}
