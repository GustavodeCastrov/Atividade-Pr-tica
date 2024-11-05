/*
 * Dev: Gustavo de Castro Vaz
 * 05/11/2024
 */


import java.util.Scanner;
public class CustoCarro {
	public static void main(String[] args) {
		Scanner sca = new Scanner (System.in);
		
		double custo, custof;
		
		System.out.print("Digite o custo de fábrica do carro: ");
		custo = sca.nextDouble();
		
		if(custo <= 0) {
			System.out.println("Não existe almoço grátis!");
			return;
		}
		
		custof = custo + (custo * 0.45) + (custo * 0.28);
		
		System.out.println("O valor do seu carro novo é: "+custof);
		
		sca.close();
	}
}
