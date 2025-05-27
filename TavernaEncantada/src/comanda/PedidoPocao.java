package comanda;

public class PedidoPocao implements Pedido {

	public void executar() {
		System.out.println("\nPoção mágica servida ao cliente!  ");
	}
	
	@Override
	public void add(Pedido pedidoNovo) {
		
	}
}
