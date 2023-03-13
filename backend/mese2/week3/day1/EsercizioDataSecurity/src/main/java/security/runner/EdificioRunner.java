package security.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import security.model.Edificio;
import security.service.EdificioService;

@Component
@Order(2)
public class EdificioRunner implements ApplicationRunner {
	
	@Autowired
	EdificioService edServ;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
//		salvaEdificio();
		visualizzaEdifici();
		
	}
	
	private void salvaEdificio() {
		Edificio ed1 = Edificio.builder().nome("Burj Khalifa").citta("Dubai").edificioLibero(true).codiceSicurezza("qwertyui").build();
		if(ed1.getCodiceSicurezza() != null) {
			ed1.setEdificioLibero(false);
		}
		String edIns1 = edServ.aggiungiEdificio(ed1);
		System.out.println(edIns1);
	}
	
	private void visualizzaEdifici() {
		List<Edificio> listaEdifici = edServ.getAllEdifici();
		listaEdifici.forEach(ed -> System.out.println(ed));
	}

}
