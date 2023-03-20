package incendi.model;

import java.util.Random;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Sonda implements Dispositivo {
	
	private Random valoreCasuale = new Random();
	private long id;
	private double latitudine;
	private double longitudine;
	private int valoreFumo;
	
	public Sonda(Long id) {
		this.id = id;
		this.latitudine = valoreCasuale.nextDouble(-90, 90);
		this.longitudine = valoreCasuale.nextDouble(-90, 90);
		this.valoreFumo = valoreCasuale.nextInt(0, 11);
	}

	@Override
	public String stampaDettaglioPericoloIncendio() {
		return "URL: http://host/alarm?=idsonda=" + id + "&lat=" + latitudine + "&lon=" + longitudine + "&smokelevel="
				+ valoreFumo;
	}

	@Override
	public String toString() {
		return "Sonda [id=" + id + ", latitudine=" + latitudine + ", longitudine=" + longitudine + ", valoreFumo="
				+ valoreFumo + "]";
	}

}
