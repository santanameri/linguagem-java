package Familia55;

import java.util.Scanner;

public class Lista1Q3 {

		public static void main(String[] args) {
			
			int idade;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("\nDigite a sua idade: ");
			idade = leia.nextInt();
			
			if (idade>=10 && idade <=14) {
				System.out.println("\nSua idade corresponde a faixa etária: infantil.");
			} else if (idade>=15 && idade<=17) {
				System.out.println("\nSua idade corresponde a faixa etária: juvenil.");
			} else {
				System.out.println("\nSua idade corresponde a faixa etária: adulto.");
			}
		}
}
