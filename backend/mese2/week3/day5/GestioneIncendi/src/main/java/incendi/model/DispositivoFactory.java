package incendi.model;

public class DispositivoFactory {
	// creo istanze ti tipo sonda, seguendo il pattern factory come svolto a lezione
	public static Dispositivo generaDispositivo(String tipoDisp, long id) {
		if(tipoDisp == null) {
			return null;
		} else if (tipoDisp.equalsIgnoreCase("SONDA")) {
			return new Sonda(id);
		}
		return null;
	}

}
