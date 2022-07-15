package EstudoPOO;

public abstract class AnimalPOO {
	
	private String NomeAnimal;
	 
	public AnimalPOO (String especieanimal) {
		this.NomeAnimal = especieanimal;
	}
	
	abstract public void Nome (String nomeanimal);
	abstract public void Idade (int idadeanimal);
	abstract public void Som (String somanimal);

	public String getNomeAnimal() {
		return NomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		NomeAnimal = nomeAnimal;
	}
	
	
	
}
