public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("O extrato da conta corrente é: ");
        super.imprimirInfosComuns();
    }

}
