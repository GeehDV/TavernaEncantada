package comanda;

public class PedidoSopa implements Pedido {

	public void executar() {
		System.out.println("\nSopa de Batata servida ao cliente! ");
	}

	@Override
	public void add(Pedido pedidoNovo) {
		
	}
}
