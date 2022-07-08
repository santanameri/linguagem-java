import java.util.Scanner;

public class Ex5DoWhile {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do
		{
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			soma = soma + numero;
			
		} while (numero != 0);
			System.out.println("A soma dos números é igual a: " + soma);
	}
}
