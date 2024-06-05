package model.contas.tipos.poupanca;

import model.contas.Conta;
import model.contas.clientes.Cliente;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(Cliente cliente, String senha) {
		super(cliente, senha);
	}

	@Override
	public void imprimirExtrato(String senha) {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns(senha);
	}
}

