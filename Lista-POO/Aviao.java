package EstudoPOO;

public class Aviao {
	
	String modelo;
	String tipoVoo;
	String fabricante;
	String rotaVoo;
	
	public void voar ()
	{
		System.out.println("O avião decolou!");
	}
	
	public void pousar()
	{
		System.out.println("O avião pousou!");
	}
	
	public void estado ()
	{
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Tipo de vôo: "+this.tipoVoo);
		System.out.println("Fabricante: "+this.fabricante);
		System.out.println("Rota do vôo: "+this.rotaVoo);
	}
}
