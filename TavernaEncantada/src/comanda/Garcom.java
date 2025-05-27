package comanda;

import java.util.ArrayList;
import java.util.List;

public class Garcom {
	
	private List<Pedido> pedidos = new ArrayList<>();
	
	public void adicionarPedido(Pedido pedidoNovo) {
		System.out.println("\nUm novo pedido foi adicionado! " + pedidoNovo.getClass().getSimpleName());
		pedidos.add(pedidoNovo); // adiciona o pedido na lista que o garçom vai entregar depois
		}
	
	public void entregarPedido() {
		if (pedidos.isEmpty()) { // declara que se não houver pedido, não haverá pedidos para serem entregues
		System.out.println("\nNenhum pedido para entregar! ");
		return; // então retorna para os pedidos, caso não tenha nenhum pedido realizado
		}
		
		System.out.println("\nEntregando os pedidos...");
		
		for (Pedido pedidoNovo : pedidos) {
		System.out.println("\nEntregando o pedido: " + pedidoNovo.getClass().getSimpleName());
		pedidoNovo.executar(); 
		
		}
		
		
		pedidos.clear();
		System.out.println("\nPedidos entregues com sucesso! ");
		}
}


