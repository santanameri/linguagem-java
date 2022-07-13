package EstudoPOO;

public class ContaBancariaObjeto {
	public static void main(String[] args) {
		
		ContaBancaria digital = new ContaBancaria ();
		
		digital.tipoConta = "Conta Corrente";
		digital.tipoCartao = "Débito e Crédito";
		digital.saldo = 2467;
		digital.limite = 5800;
		
		digital.estado();
	}
}
