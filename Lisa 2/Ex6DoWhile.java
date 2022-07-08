import java.util.Scanner;

public class Ex6DoWhile {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double numero, soma = 0, qtd = 0, media = 0;
		
		do
		{
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if (numero % 3 == 0 && numero != 0)
			{
				soma = soma + numero;
				qtd = qtd + 1;
				media = soma / qtd;
				
			}
		} while (numero != 0);
		
		System.out.println("A média dos números múltiplos de 3 é: " + media);
	}
}
