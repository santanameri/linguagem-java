package EstudoPOO;

public class ContaBancaria {

	String tipoConta;
	String tipoCartao;
	double saldo;
	double limite;
	boolean ativo;
	
	public void pagar ()
	{
		if (this.ativo == true)
			System.out.println("A conta está apta para fazer pagamento.");
		else 
			System.out.println("A conta está inapta para fazer pagamento.");
	}
	public void sacar ()
	{
		if (this.ativo == true)
			System.out.println("A conta está apta para fazer saque.");
		else
			System.out.println("A conta está inapta pode efetuar saque.");
	}
	public void transferir ()
	{
		if (this.ativo == true)
			System.out.println("A conta está apta para transferência");
		else 
			System.out.println("A conta está inapta para transferência");
	}
	public void estado ()
	{
		System.out.println("Tipo de conta: "+this.tipoConta);
		System.out.println("Tipo de cartão: "+this.tipoCartao);
		System.out.println("Saldo: R$ "+this.saldo);
		System.out.println("Limite de cartão: R$ "+this.limite);
	}
}
