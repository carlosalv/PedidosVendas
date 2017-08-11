package br.com.pedidosVendas;

import java.util.ArrayList;

public class Produto {

	public String nomeProduto;
	public int peso;
	public int qtdeDisponivel;

	ArrayList<ItemPedido> ItemPedido;

	String consultarProduto() {
		return nomeProduto;

	}

}
