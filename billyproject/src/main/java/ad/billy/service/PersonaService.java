package ad.billy.service;

import ad.billy.model.Persona;




public interface PersonaService {
	
	Persona save(Persona persona);
	Persona delete(Persona persona);
	Persona update(Persona persona);
	Persona find(Persona persona);
	

}
