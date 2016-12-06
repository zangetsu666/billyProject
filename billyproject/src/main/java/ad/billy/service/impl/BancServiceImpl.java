package ad.billy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import ad.billy.dao.BancDao;
import ad.billy.model.Banc;
import ad.billy.service.BancService;

public class BancServiceImpl implements BancService {

	@Autowired
	private BancDao bancDao;
	
	@Override
	public Banc save(Banc banc) {
		return bancDao.save(banc);
	}

	@Override
	public void delete(Banc banc) {
		bancDao.delete(banc);
	}

	@Override
	public Banc update(Banc banc) {
		return bancDao.save(banc);
	}

	@Override
	public Banc find(Banc banc) {
		return bancDao.findOne(banc.getId());
	}

}
