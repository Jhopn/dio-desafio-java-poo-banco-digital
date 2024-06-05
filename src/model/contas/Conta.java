package model.contas;

import model.contas.clientes.Cliente;
import model.contas.servicos.Servicos;

public abstract class Conta implements Servicos {
    private Cliente cliente;
    private String senha;
    private double saldo;
    
    public Conta(Cliente cliente, String senha) {
        this.cliente = cliente;
        this.senha = senha;
        this.saldo = 0;
    }

    @Override
    public void depositar(double valor, String senha) {
        conferirSenha(senha);
        this.saldo += valor;
    }


    @Override
    public void imprimirExtrato(String senha) {
        conferirSenha(senha);
        System.out.println("O saldo atual é R$: " + this.getSaldo());
    }


    @Override
    public void sacar(double valor, String senha) {
        conferirSenha(senha);
        conferirSaldo(valor);
        this.saldo -= valor;
        System.out.println("Saque realizado, seu saldo atual é R$: "+ this.getSaldo());
      
    }

    @Override
    public void transferir(double valor, Servicos contaDestino, String senha) {
        conferirSenha(senha);
        conferirSaldo(valor);
        this.saldo -= valor;
        contaDestino.depositar(valor, senha);
        System.out.println("Transferencia realizada, seu saldo atual é R$: "+ this.getSaldo());
    }

    private void conferirSenha(String senha){
        if (senha != this.getSenha()){
            System.out.println("Senha incorreta!");
        }
    }

    private void conferirSaldo(double valor){
        if(this.getSaldo() < valor){
            System.out.println("Valor abaixo do saldo, impossivel efetuar saque");
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    protected void imprimirInfosComuns(String senha) {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
	}
}
