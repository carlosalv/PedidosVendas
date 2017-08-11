package metodoMain;

import br.com.pedidosVendas.Cliente;
import br.com.pedidosVendas.Produto;
import java.sql.Date;
public class Controle {

	public static void main(String[] args) {

		Produto produto = new Produto();
		produto.nomeProduto = "console";
		produto.peso = 2;
		produto.qtdeDisponivel = 500;

		System.out.println("Produto: " + produto.nomeProduto);
		System.out.println("Peso: " + produto.peso + " kilos");
		System.out.println("Quantidade Disponivel: " + produto.qtdeDisponivel);
		
		Cliente cliente = new Cliente();
		cliente.nome = "Carlos";
		cliente.dataNscimento = "21/04/1989";
		cliente.limiteCredito = 1000.0;
		cliente.CPF = "045.137.433.95";
		cliente.cartaoCredito = "Master Card";
		cliente.status = true;
		
		System.out.println("data de nascimento: " + cliente.dataNscimento);
		System.out.println("NOME: " + cliente.nome);
		System.out.println("LIMITE DE CREDITO: " + cliente.limiteCredito );
		System.out.println("CPF: " + cliente.CPF);
		System.out.println("Cartão de Credito: " + cliente.cartaoCredito);
		System.out.println("Status do Cartão: " );
									
				if(cliente.status == true){
					System.out.println("Disponivel para compras");
										
				}else{
					System.out.println("Não disponivel pra compras");
						}
		
	}

	
	
	
		
		
	
	

}
