package EstudoPOO;

public class PatineteObjeto {

	public static void main(String[] args) {
		
		Patinete novo = new Patinete ();
		
		novo.modelo = "Infantil";
		novo.tamanho = "Pequeno";
		novo.preco = 380;
		
		novo.estado();
	}

}
