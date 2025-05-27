package noticacao;

public class Cozinha implements Observador {

	private String nome;
	
	public Cozinha(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void atualizar(String mensagem) {
		System.out.println("[" + nome + "] recebeu notificação: " + mensagem);
	}
}
