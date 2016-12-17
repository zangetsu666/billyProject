package ad.billy.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ad.billy.model.Banc;


@Repository
public interface BancDao extends CrudRepository<Banc, Long> {
	
	
	

}
