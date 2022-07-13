package EstudoPOO;

public class FuncionarioObjeto {

	public static void main(String[] args) {

		Funcionario novato = new Funcionario();
		
		novato.nome = "João";
		novato.dataNasc = "18/12/1993";
		novato.CPF = "111.111.111-11";
		novato.salario = 2457;
		
		novato.estado();		

	}

}
