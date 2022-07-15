package EstudoPOO;

public class CavaloPOO extends AnimalPOO implements CorrerPOO {
	public CavaloPOO () {
		super ("Cavalo");
	}
	
	@Override
	public void Nome (String nomeanimal) {
		System.out.println("Nome do cavalo: "+nomeanimal);
	}
	@Override
	public void Idade (int idadeanimal) {
		System.out.println("Idade do cavalo: "+idadeanimal);
	}
	@Override
	public void Som (String somanimal) {
		System.out.println("Som do cavalo: "+somanimal);
	}
	public void correndo () {
		System.out.println("Cavalo correndo!");
	}
}
