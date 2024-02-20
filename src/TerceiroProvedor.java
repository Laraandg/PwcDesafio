import java.util.Scanner;
public class TerceiroProvedor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o endereço (nome da rua e o número): ");
            String enderecoCompleto = scanner.nextLine();

            // Dividir a entrada em número da rua e nome da rua
            String[] partesEndereco = enderecoCompleto.split(",\\s+", 2);

            String numeroRua = partesEndereco[0];
            String nomeRua = partesEndereco[1];

            System.out.println("Número da Rua: " + numeroRua + " \nNome da Rua: " + nomeRua);
        }
    }
}