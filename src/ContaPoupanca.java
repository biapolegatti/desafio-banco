public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("O extrato da conta poupanca é: ");
        super.imprimirInfosComuns();
    }

}
