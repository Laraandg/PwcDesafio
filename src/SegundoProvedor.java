import java.util.Scanner;

public class SegundoProvedor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o endereço (nome da rua e o número): ");
            String enderecoCompleto = scanner.nextLine();

            /* Essa parte do código foi refeita através de expressão regular para que fosse possível concluir a segunda parte do desafio.
            Separando o nome da rua e o número */

            String[] partesEndereco = enderecoCompleto.split("\\s+(?=\\d)");

            // Primeira parte de entrada será o nome da rua
            String nomeRua = partesEndereco[0];

            // Segunda parte de entrada será o número da rua
            String numeroRua = partesEndereco[1];

            System.out.println("Nome da rua: " + nomeRua + "\nNúmero: " + numeroRua);
        }
    }
}