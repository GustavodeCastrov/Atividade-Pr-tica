import java.util.Scanner;

public class Execício_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mult = 1;
        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();
        
        for (int i = 1; i <= num; i++) { 
            if (i % 2 != 0) {
                mult *= i; 
            }
        }
        
        System.out.println("O produto dos números ímpares até " + num + " é: " + mult);
    }
}
