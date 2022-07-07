package Familia55;

import java.util.Scanner;

public class Lista1Q1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.println("\nInforme o 1° número: ");
		n1 = leia.nextInt();
		System.out.println("\nInforme o 2° número: ");
		n2 = leia.nextInt();
		System.out.println("\nInforme o 3° número: ");
		n3 = leia.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("O 1° número, " + n1 + ", é o maior!");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("O 2° número, " + n2 + ", é o maior!");
		} else {
			System.out.println("O 3° número, " + n3 + ", é o maior!");
		}
	}

}
