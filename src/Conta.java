import lombok.Getter;

@Getter
public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 0001;

    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        saldo =- valor;
    }

    @Override
    public void depositar(double valor) {
        saldo =+ valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Agência: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.numero);
        System.out.println("Saldo: " + this.saldo);
    }

}
