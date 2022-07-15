package EstudoPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class ExeCollections {

	public static void main(String[] args) {
		int op;
		Scanner ler = new Scanner (System.in);
		ArrayList <String> estoque = new ArrayList ();
		
		do {
			System.out.println("\n***********************");
			System.out.println("\n(1)Deseja armazenar produto no estoque da loja?");
			System.out.println("\n(2)Deseja remover produto do estoque da loja?");
			System.out.println("\n(3)Deseja atualizar produtos do estoque da loja?");
			System.out.println("\n(4)Deseja mostrar os produtos do estoque da loja?");
			System.out.println("\nDeseja encerrar o sistema?");
			System.out.println("\nEscolha a sua opção");
			System.out.println("\n***********************");
			op = ler.nextInt();
			
			switch (op) {
			case 1: 
				ler.nextLine();
				System.out.println("\nInforme o produto que deseja adicionar ao estoque: ");
				String produto = ler.nextLine();
				estoque.add(produto);
				break;
			case 2:
				ler.nextLine();
				System.out.println("\nInforme o produto que deseja remover do estoque: ");
				String produto1 = ler.nextLine();
				if (estoque.contains(produto1)) {
					estoque.remove(produto1);
				} else {
					System.out.println("\nO produto informado não existe no estoque!");
				}
				break;
			case 3:
				ler.nextLine();
				System.out.println("\nInforme o produto do estoque que você deseja atualizar: ");
				String atualiza = ler.nextLine();
				System.out.println("\nInforme o produto que você queira substituir "+ atualiza+ " : ");
				String novo = ler.nextLine();
				if (estoque.contains(atualiza)) {
					estoque.remove(atualiza);
					estoque.add(novo);
				} else {
					System.out.println("\nO produto informado não existe no estoque!");
				}
				System.out.println(estoque);
				break;
			case 4:
				ler.nextLine();
				System.out.println("\nOs produtos do estoque da loja são: ");
				System.out.println(estoque);
				break;
			case 0:
				System.out.println("\nSistema finalizado!");
				break;
			default:
				System.out.println("\nOpção inválida!");
			} 
		} while (op != 0);

	}

}
