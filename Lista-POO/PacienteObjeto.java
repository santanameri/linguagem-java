package EstudoPOO;

public class PacienteObjeto {
	public static void main(String[] args) {
		Paciente urgencia = new Paciente ();
		
		urgencia.nome = "Paula";
		urgencia.idade = 32;
		urgencia.sintoma = "Febre";
		
		urgencia.estado();
	}
}
