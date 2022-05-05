import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Laura");
        cliente1.setEndereco(new Endereco("Rua dos Bancários", 10, "Vilas dos Ricos", "Sao Paulo/SP"));
        cliente1.imprimirDadosCliente();
        System.out.println("======================");

        Banco banco1 = new Banco();
        banco1.setNome("Banco Digital");
        banco1.setEndereco(new Endereco("Rua da Internet", 300, "Vilas dos Bots", "Sao Paulo/SP"));
        banco1.imprimirDadosBanco();


        Conta cc = new ContaCorrente();

        Conta poupanca = new ContaPoupanca();
        cc.depositar(100);
        cc.transferir(100, poupanca);

        System.out.println("======================");
        cc.imprimirExtrato();
        System.out.println("======================");
        poupanca.imprimirExtrato();
        System.out.println("======================");

        banco1.solicitarCartao();

        System.out.println("======================");
        System.out.println("Atendimento encerrado.");

    }
}