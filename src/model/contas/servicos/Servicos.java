package model.contas.servicos;

public interface Servicos {
	void sacar(double valor, String senha);
	
	void depositar(double valor, String senha);
	
	void transferir(double valor, Servicos contaDestino, String senha);
	
	void imprimirExtrato(String senha);

}
