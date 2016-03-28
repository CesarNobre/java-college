package br.com.fiap.bean;

import javax.annotation.ManagedBean;
import javax.swing.JOptionPane;

import org.apache.axis2.AxisFault;

import br.com.fiap.bo.EstoqueBOStub;
import br.com.fiap.bo.EstoqueBOStub.BuscarProduto;
import br.com.fiap.bo.EstoqueBOStub.BuscarProdutoResponse;
import br.com.fiap.bo.EstoqueBOStub.ProdutoTO;

@ManagedBean
public class ProdutoBean {
	private int codigo;
	private String resposta;
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public void buscar(){
		try {
			EstoqueBOStub ws = new EstoqueBOStub();
			
			BuscarProduto param = new BuscarProduto();
			
			param.setCodigo(codigo);
			
			BuscarProdutoResponse response = ws.buscarProduto(param);
			
			ProdutoTO produto = response.get_return();
			
			this.resposta = produto.getDescricao();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
