package EstudoPOO;

public class CachorroPOO extends AnimalPOO implements CorrerPOO {

	public CachorroPOO () {
		super ("Cachorro");
	}
	
	@Override
	public void Nome (String nomeanimal) {
		System.out.println("Nome do cachorro: "+nomeanimal);
	}
	@Override
	public void Idade (int idadeanimal) {
		System.out.println("Idade do cachorro: "+idadeanimal);
	}
	@Override 
	public void Som (String somanimal) {
		System.out.println("Som do cachorro: "+somanimal);
	}
	public void correndo () {
		System.out.println("Cachorro correndo!");
	}
	
}
