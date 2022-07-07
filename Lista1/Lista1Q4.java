package Familia55;

import java.util.Scanner;

public class Lista1Q4 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double numero;
		
		System.out.println("\nDigite um número: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 0) {
			numero = Math.sqrt(numero);
			System.out.println("O número digitado é par! E a sua raiz quadrada é: " + numero);
		} else {
			numero = Math.pow(numero, 2);
			System.out.println("O número digitado é ímpar! E o seu quadrado é: " + numero);
		}
	}
}
