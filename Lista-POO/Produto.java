package EstudoPOO;

public class Produto {
	
String nome;
String cor;
String marca;
String modelo;
String preco;
boolean ligado;

public void tocar()
{
	if (this.ligado == true)
		System.out.println("Está funcionando!");
	else 
		System.out.println("Não está funcionando!");
}
public void ligar()
{
	if (this.ligado == true)
		System.out.println("Erro! Já está ligado!");
	else 
		this.ligado=true;
}
public void desligar()
{
	this.ligado = false;
}

public void estado()
{
	System.out.println("Nome: "+this.nome);
	System.out.println("Cor: "+this.cor);
	System.out.println("Marca: "+this.marca);
	System.out.println("Modelo: "+this.modelo);
}
}