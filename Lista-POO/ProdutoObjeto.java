package EstudoPOO;

public class ProdutoObjeto {

		public static void main(String[] args) {
			Produto som = new Produto ();
					
					som.nome = "Caixa de Som";
					som.cor = "Preto";
					som.marca = "JBL";
					som.modelo = "Xtreme 3";
					som.preco = "R$1800";
					
					som.estado();
		}
}
