package EstudoPOO;

public class Aviao {
	
	String modelo;
	String tipoVoo;
	String fabricante;
	String rotaVoo;
	boolean voando;
	
	public void voar ()
	{
	if (this.voando == true)
		System.out.println("O avião está no ar!");
	else 
		System.out.println("O avião ainda não decolou!");
	}
	
	public void pousar()
	{
		this.voando = false;
	}
	
	public void estado ()
	{
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Tipo de vôo: "+this.tipoVoo);
		System.out.println("Fabricante: "+this.fabricante);
		System.out.println("Rota do vôo: "+this.rotaVoo);
	}
}
