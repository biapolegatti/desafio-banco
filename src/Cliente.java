import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    public String nome;

    public Endereco endereco;

    public void imprimirDadosCliente() {
        System.out.println("O nome do(a) cliente é: " + nome);
        System.out.println("O endereço do(a) cliente é: " + endereco);
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}


