package model.contas.tipos.corrente;

import model.contas.Conta;
import model.contas.clientes.Cliente;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente, String senha) {
		super(cliente, senha);
	}

	@Override
	public void imprimirExtrato(String senha) {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns(senha);
	}
	
}