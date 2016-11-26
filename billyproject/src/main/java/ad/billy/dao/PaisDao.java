package ad.billy.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ad.billy.model.Pais;






@Repository
public interface PaisDao extends CrudRepository<Pais, Long>{

}
