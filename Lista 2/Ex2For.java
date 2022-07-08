import java.util.Scanner;

public class Ex2For {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x, numero, contPar=0, contImpar=0;
		
		for (x=1; x<=10; x++)
		{
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if (numero % 2 == 0)
			{
				contPar = contPar + 1;
			}
			else
			{
				contImpar = contImpar + 1;
			}
		}
		
		System.out.println("Foram digitados "  + contPar + " números pares e " + contImpar + " números ímpares.");
		
	}
}
