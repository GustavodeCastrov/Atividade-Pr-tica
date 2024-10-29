import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		int valor = 0, nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, nota5 = 0, nota6 = 0;
		
		System.out.print("Digite o valor que deseja sacar: ");
		valor = sca.nextInt();
		
			if(valor < 0) {
				System.out.print("Valor inválido!");
				return;
			}
			else {
				
				while(valor >= 100) {
					valor -= 100;
					nota6++;
				}
				while(valor >= 50) {
					valor -= 50;
					nota5++;
				}
				while(valor >= 20) {
					valor-= 20;
					nota4++;
				}
				while(valor >= 10) {
					valor -= 10;
					nota3++;
				}
				if(valor % 5 == 0) {
					while(valor >= 5) {
						valor -= 5;
						nota2++;
					}
				}
				else if(valor % 2 == 0) {
					while(valor >= 2) {
						valor -= 2;
						nota1++;
					}
				}
				
				
				System.out.println("O seu troco em notas é Notas de cem: "+nota6+ " Notas cinquenta: "+nota5+" Notas de vinte: "+nota4+ " Notas de dez: "+nota3+ " Notas de cinco: "+nota2+" Notas dois: "+nota1);
				
		}
			sca.close();
	}
}
