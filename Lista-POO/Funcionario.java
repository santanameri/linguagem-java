package EstudoPOO;

public class Funcionario {

	String nome;
	String dataNasc;
	String CPF;
	double salario;
	boolean funcao;
	
	public void trabalhar ()
	{
		if (this.funcao == true)
			System.out.println("O funcionário exercendo a sua função!");
		else 
			System.out.println("O funcionário não está exercendo a sua função!");
	}
	public void descansar ()
	{
		this.funcao = false;
	}
	
	public void estado ()
	{
		System.out.println("Nome: "+this.nome);
		System.out.println("Data de nascimento: "+this.dataNasc);
		System.out.println("CPF: "+this.CPF);
		System.out.println("Salário: R$ "+this.salario);
	}
}
