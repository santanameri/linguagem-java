package EstudoPOO;

public class AviaoObjeto {

		public static void main(String[] args) {
			Aviao aeronave = new Aviao ();
			
			aeronave.modelo = "A380";
			aeronave.fabricante = "AIRBUS";
			aeronave.tipoVoo = "Comercial";
			aeronave.rotaVoo = "Recife-Paris";
		
			
			aeronave.estado();
			
		}
}
