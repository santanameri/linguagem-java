import java.util.Scanner;

public class Ex3While {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, totalMenor21 = 0, totalMaior50 = 0;
						
			while (idade != -99)
			{
				System.out.println("Informe a sua idade: ");
				idade = leia.nextInt();
				
				if (idade < 21 && idade > 0)
				{
					totalMenor21 = totalMenor21 + 1;
					
				}
				else if (idade > 50 && idade > 0)
				{
					totalMaior50 = totalMaior50 + 1;
					
				}
			}
			
			System.out.println("A quantidade de pessoas com menos de 21 anos é: " + totalMenor21);
			System.out.println("A quantidade de pessoas com mais de 50 anos é: " + totalMaior50);
	}
}
