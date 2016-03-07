package br.com.fiap.view;

import javax.swing.JOptionPane;

import org.tempuri.CalcPrecoPrazoWSStub;
import org.tempuri.CalcPrecoPrazoWSStub.CalcPrecoPrazo;

import br.com.fiap.bo.EstoqueBOStub;
import br.com.fiap.bo.EstoqueBOStub.BuscarProduto;
import br.com.fiap.bo.EstoqueBOStub.BuscarProdutoResponse;
import br.com.fiap.bo.EstoqueBOStub.ProdutoTO;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			EstoqueBOStub ws = new EstoqueBOStub();	
			BuscarProduto param = new BuscarProduto();
			int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite um código"));
			param.setCodigo(codigo);
			
			BuscarProdutoResponse response = ws.buscarProduto(param);
			
			ProdutoTO produto = response.get_return();
			
			System.out.println(produto.getCodigo());
			System.out.println(produto.getAltura());
			System.out.println(produto.getLargura());
			System.out.println(produto.getTipo());
 
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	private static void CorreiosWS(){
		try {
			CalcPrecoPrazoWSStub ws = new CalcPrecoPrazoWSStub();
			CalcPrecoPrazo param = new CalcPrecoPrazo();
			param.setNCdEmpresa("123");
			param.setSDsSenha("123");
			param.setNCdServico("1");
			param.setSCepOrigem("04349-000");
			param.setSCepDestino("04349-000");
			param.setNVlPeso("30");
			param.setNCdFormato(1);
			


		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
