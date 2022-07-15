package EstudoPOO;

public class Cliente {

	String nome;
	String genero;
	String dataNasc;
	
	public void pagar ()
	{
		System.out.println("O cliente efetuou o pagamento");
	}

	public void estado() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Gênero: "+this.genero);
		System.out.println("Data de nascimento: "+this.dataNasc);
	}
}
