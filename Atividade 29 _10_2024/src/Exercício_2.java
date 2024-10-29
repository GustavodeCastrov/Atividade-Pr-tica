import java.util.Scanner;

public class Exercício_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSorteado;
        int numInformado = 0;
        int tentativas = 7;

        // Solicitar número ao usuário
        while (numInformado <= 0 || numInformado > 100) {
            System.out.print("Informe um número de 1 a 100: ");
            numInformado = scanner.nextInt();
            if (numInformado <= 0 || numInformado > 100) {
                System.out.println("Dado inválido. Tente novamente.");
            }
        }

        // Iniciar tentativas
        while (tentativas > 0) {
            System.out.println("Você tem " + tentativas + " tentativas restantes.");
            System.out.print("Escolha um número de 1 a 100: ");
            numSorteado = scanner.nextInt();

            // Verificar se o número é válido
            if (numSorteado <= 0 || numSorteado > 100) {
                System.out.println("Número inválido. Tente novamente.");
                continue; // Volta para o início do loop sem gastar uma tentativa
            }

            // Verificar se o número é maior ou menor
            if (numSorteado > numInformado) {
                System.out.println("Seu número é maior do que o número que o usuário digitou. Você errou.");
            } else if (numSorteado < numInformado) {
                System.out.println("Seu número é menor do que o número que o usuário digitou. Você errou.");
            } else {
                System.out.println("Você acertou!");
                break; 
            }

            tentativas--; // Reduz o número de tentativas
        }

        // Verifica se acabaram as tentativas
        if (tentativas == 0) {
            System.out.println("Acabaram suas tentativas! O número informado era: " + numInformado);
        }

        scanner.close();
    }
}
