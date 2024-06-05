import model.contas.Conta;
import model.contas.clientes.Cliente;
import model.contas.tipos.corrente.ContaCorrente;
import model.contas.tipos.poupanca.ContaPoupanca;

public class Main {
    public static void main(String[] args) throws Exception {
        Cliente clienteUm = new Cliente("Jhoão Pedro", "988786676", "78348347");
        Cliente clienteDois = new Cliente("Pedro Lucas", "588456565", "12632347");

        Conta contaClienteUm = new ContaCorrente(clienteUm, "Senha tal");
        Conta contaClienteDois = new ContaPoupanca(clienteDois, "Senha");

        contaClienteUm.depositar(124.8, "Senha tal");
        contaClienteUm.depositar(124.8, "Senhatal");
        contaClienteUm.sacar(54.8, "Senha tal");
        contaClienteUm.imprimirExtrato("Senha tal");  

        contaClienteUm.transferir(20.78, contaClienteDois, "Senha tal");
        contaClienteDois.imprimirExtrato("Senha");   


    }
}
