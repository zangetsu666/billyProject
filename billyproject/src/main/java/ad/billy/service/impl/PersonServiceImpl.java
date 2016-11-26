package ad.billy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ad.billy.dao.PersonDao;
import ad.billy.model.Person;
import ad.billy.service.PersonService;



@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonDao personDao;

	@Override
	public Person save(Person person) {
		return personDao.save(person);
	}

	@Override
	public Long delete(Person person) {
		Long id = person.getId();
		personDao.delete(person);
		return id;
	}

	@Override
	public Person update(Person person) {
		return personDao.save(person);	
	}

	@Override
	public Person find(Person person) {
		return personDao.findOne(person.getId());
	}
	

	
	

}
