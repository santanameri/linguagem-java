package EstudoPOO;

public class PreguicaPOO extends AnimalPOO {
	public PreguicaPOO () {
		super ("Preguiça");
	}
	
	@Override
	public void Nome (String nomeanimal) {
		System.out.println("Nome da preguiça: "+nomeanimal);
	}
	@Override
	public void Idade (int idadeanimal) {
		System.out.println("Idade da preguiça: "+idadeanimal);
	}
	@Override
	public void Som (String somanimal) {
		System.out.println("Som da preguiça: "+somanimal);
	}
	public void subirArvore () {
		System.out.println("Preguiça subindo em árvore!");
	}
}
