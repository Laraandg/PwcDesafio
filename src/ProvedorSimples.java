import java.util.Scanner;

public class ProvedorSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o endereço (nome da rua e número): ");
        String enderecoCompleto = scanner.nextLine();

        // Divide o endereço em partes usando o espaço como separador
        String[] partesEndereco = enderecoCompleto.split(" ");

        // A primeira parte é o nome da rua
        String nomeRua = partesEndereco[0];

        // A última parte é o número da rua
        String numeroRua = partesEndereco[partesEndereco.length - 1];

        System.out.println("Nome da rua: " + nomeRua);
        System.out.println("Número da rua: " + numeroRua);
    }
}
