import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Banco {

    public String nome;

    public Endereco endereco;

    public void imprimirDadosBanco() {
        System.out.println("O endereço do banco é: " + endereco);
    }

    public void solicitarCartao() {
        System.out.println("Deseja solicitar seu cartão de crédito?");
        Scanner entrada = new Scanner(System.in);
        String resposta = entrada.nextLine();

        if (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Seu cartão de crédito chegará na sua casa em 7 dias.");
        } else {
            System.out.println("Estamos tristes em saber que você não deseja nosso cartão, quem sabe na próxima vez!");

        }


    }
}

