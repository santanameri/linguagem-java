package Familia55;

import java.util.Scanner;

public class Lista1Q2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o 1° número: ");
		n1 = leia.nextInt();
		System.out.println("Digite o 2° número: ");
		n2 = leia.nextInt();
		System.out.println("Digite o 3° número: ");
		n3 = leia.nextInt();
		
		if (n1 < n2) {
			if (n2 < n3) {
				System.out.println(n1 + "\n" + n2 + "\n" + n3);
			} 
			else if (n1 < n3) {
				System.out.println(n1 + "\n" + n3 + "\n" + n2);
			} else {
				System.out.println(n3 + "\n" + n1 + "\n" + n2);
			}
		}
		else if (n2 < n3) {
			if (n1 < n3) {
				System.out.println(n2 + "\n" + n1 + "\n" + n3);
			} else {
				System.out.println(n2 + "\n" + n3 + "\n" + n1);
			}
		} else {
			System.out.println(n3 + "\n" + n2 + "\n" + n1);
		}
		

	}

}
