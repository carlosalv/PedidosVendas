package br.com.pedidosVendas;

import java.util.ArrayList;

public class Cliente extends Pessoa {
	
	public	double limiteCredito;
	public	String cartaoCredito;
	public	String contato;
	public	Boolean status;
	

	
	ArrayList <Pedido> pedido;
	
	
	
	double verificarCredito(){
		return 0;
	}
	int validarCartao(){
		return 0;
	}



}
