package EstudoPOO;

public class Paciente {

	String nome;
	int idade;
	String sintoma;
	boolean tratamento;
	
	public void medicar ()
	{
		if (this.tratamento == true)
			System.out.println("O paciente está em tratamento com medicação.");
		else 
			System.out.println("O paciente não está em tratamento com medicação.");
	}
	public void doer ()
	{
		this.tratamento = false;
	}
	public void estado ()
	{
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade+" anos.");
		System.out.println("Sintoma: "+this.sintoma);
	}
}
