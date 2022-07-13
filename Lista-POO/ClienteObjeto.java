package EstudoPOO;

public class ClienteObjeto {
	
	public static void main(String[] args) {
		Cliente n1 = new Cliente ();
		
		n1.nome = "Maria";
		n1.genero = "Feminino";
		n1.dataNasc = "03/05/1987";
		
		n1.estado();
				
	}
}
