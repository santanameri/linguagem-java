import java.util.Scanner;

public class Ex4While {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int qtd = 0, idade, sexo, temperamento, pessoaCalma=0, mulherNervosa=0, homemAgres=0, outrosCalm=0, pessoaNerv=0, pessoaCalm=0;
		
		 while (qtd != 150)
		 {
			 qtd = qtd + 1;
			 
			 System.out.println("Informe a sua idade: ");
			 idade = leia.nextInt();
			 System.out.println("Sexo: 1-Feminino, 2-Masculino, 3-Outros");
			 sexo = leia.nextInt();
			 System.out.println("Personalidade: 1-Calma, 2-Nervosa, 3-Agressiva");
			 temperamento = leia.nextInt();
			 
			 if(temperamento == 1) {
				 pessoaCalma++;
			 }
			 if (sexo == 1 && temperamento == 2) {
				 mulherNervosa++;
			 }
			 if (sexo == 2 && temperamento == 3) {
				 homemAgres++;
			 }
			 if (sexo == 3 && temperamento == 1) {
				 outrosCalm++;
			 }
			 if (idade > 40 && temperamento == 2) {
				 pessoaNerv++;
			 }
			 if (idade <18 && temperamento == 1) {
				 pessoaCalm++;
			 }
			 
		 }
		 
		 	System.out.println("Número de pessoas calmas: " + pessoaCalma); 
			System.out.println("Número de mulheres nervosas: " + mulherNervosa); 
			System.out.println("Número de homens agressivos: " + homemAgres); 
			System.out.println("Número de outros calmos: " + outrosCalm); 
			System.out.println("Número de pessoas nervosas com mais de 40 anos: " + pessoaNerv); 
			System.out.println("Número de pessoas calmas com menos de 18 anos: " + pessoaCalm); 
	}

}
