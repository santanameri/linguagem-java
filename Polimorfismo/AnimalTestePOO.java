package EstudoPOO;

import java.util.Scanner;

public class AnimalTestePOO {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		CachorroPOO cachorro = new CachorroPOO();
		CavaloPOO cavalo = new CavaloPOO();
		PreguicaPOO preguica = new PreguicaPOO();
		AnimalPOO animal = null;
		
		int x=0;
		
		do {
			System.out.println("Escolha um animal: \n1: Cachorro | 2: Cavalo | 3: Preguiça\n");
			x = ler.nextInt();
			if (x==1) {
				animal = cachorro;
				System.out.println("Escolha um nome para o cachorro: ");
				String nomeanimal = ler.next();
				System.out.println("Qual a idade do cachorro?");
				int idadeanimal = ler.nextInt();
				System.out.println("Que som o cachorro emite?");
				String somanimal = ler.next();
				cachorro.Nome(nomeanimal);
				cachorro.Idade(idadeanimal);
				cachorro.Som(somanimal);
				cachorro.correndo();
			}
			else if (x==2) {
				animal = cavalo;
				System.out.println("Escolha um nome para o cavalo: ");
				String nomeanimal = ler.next();
				System.out.println("Qual a idade do cavalo?");
				int idadeanimal = ler.nextInt();
				System.out.println("Que som o cavalo emite?");
				String somanimal = ler.next();
				cavalo.Nome(nomeanimal);
				cavalo.Idade(idadeanimal);
				cavalo.Som(somanimal);
				cavalo.correndo();
			}
			else if (x==3) {
				animal = preguica;
				System.out.println("Escolha um nome para o preguiça: ");
				String nomeanimal = ler.next();
				System.out.println("Qual a idade da preguiça?");
				int idadeanimal = ler.nextInt();
				System.out.println("Que som a preguiça emite?");
				String somanimal = ler.next();
				preguica.Nome(nomeanimal);
				preguica.Idade(idadeanimal);
				preguica.Som(somanimal);
				preguica.subirArvore();
			} else {
				System.out.println("Dado inválido!");
			}
		} while (x<=0 || x>=4);
		
	}

}
