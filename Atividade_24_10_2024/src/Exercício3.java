import java.util.Scanner;
public class Exercício3 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = sca.nextInt();
		
		int soma = 0;
		
		for(int i = 1; i <= n; i++) {
			
				if(i % 2 == 0) {
					soma +=i;
				}
			
		}
		
		System.out.println("A soma dos números é: "+soma);

	}

}
