package ad.billy.service;

import ad.billy.model.Person;




public interface PersonService {
	
	Person save(Person person);
	Long delete(Person person);
	Person update(Person person);
	Person find(Person person);
	

}
