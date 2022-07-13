package EstudoPOO;

public class Patinete {

	String modelo;
	String tamanho;
	double preco;
	boolean andar;
	
	public void brincar ()
	{
		if (this.andar == true)
			System.out.println("O patinete pode ser usado para brincar.");
		else
			System.out.println("O patinete não pode ser usado para brincar.");
	}
	public void quebrar ()
	{
		this.andar = false;
	}
	
	public void estado ()
	{
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Tamanho: "+this.tamanho);
		System.out.println("Preço: R$ "+this.preco);
	}
}
