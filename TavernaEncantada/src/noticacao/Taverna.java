package noticacao;

import java.util.ArrayList;
import java.util.List;

public class Taverna {

	    private List<Observador> cozinheiros = new ArrayList<>();

	    public void adicionarObservador(Observador o) {
	        cozinheiros.add(o);
	    }

	    public void novoPedido(String prato) {
	        System.out.println("Novo pedido recebido: " + prato);
	        notificarCozinha("Novo pedido: " + prato);
	    }

	    private void notificarCozinha(String mensagem) {
	        for (Observador o : cozinheiros) {
	            o.atualizar(mensagem);
	        }
	    }
	}


