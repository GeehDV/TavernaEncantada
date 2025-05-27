package sistema;

import comanda.Garcom;
import comanda.PedidoPocao;
import comanda.PedidoSopa;
import noticacao.Cozinha;
import noticacao.Taverna;

public class Main {
	
	public static void main(String[] args) {
		
		        // Observer: Cozinha recebe notificações da Taverna
		        Taverna taverna = new Taverna();
		        Cozinha cozinha = new Cozinha("Cozinha do Mestre Cuca ");
		        taverna.adicionarObservador(cozinha);

		        taverna.novoPedido("\nSopa de Javali ");
		        taverna.novoPedido("\nPoção Mística ");

		        // Command: Garçom gerencia e executa pedidos
		        Garcom garcom = new Garcom();
		        garcom.adicionarPedido(new PedidoSopa());
		        garcom.adicionarPedido(new PedidoPocao());

		        garcom.entregarPedido();
		   }
	}
