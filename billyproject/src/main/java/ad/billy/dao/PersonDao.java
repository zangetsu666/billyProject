package ad.billy.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ad.billy.model.Person;


@Repository
public interface PersonDao extends CrudRepository<Person, Long>{
	

	
}
