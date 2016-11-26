package ad.billy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import ad.billy.dao.PaisDao;
import ad.billy.model.Pais;
import ad.billy.service.PaisService;

public class PaisServiceImpl implements PaisService {

	@Autowired
	private PaisDao paisDao;
	
	@Override
	public Pais save(Pais pais) {
		return paisDao.save(pais);
	}

	@Override
	public Pais delete(Pais pais) {
		
		paisDao.delete(pais);
		return pais;
	}

	@Override
	public Pais update(Pais pais) {
		
		return paisDao.save(pais);
	}

	@Override
	public Pais find(Pais pais) {
		
		return paisDao.findOne(pais.getId());
	}
	
	

}
