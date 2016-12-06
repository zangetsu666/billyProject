package ad.billy.service;

import ad.billy.model.Banc;

public interface BancService {
	
	Banc save(Banc banc);
	void delete(Banc banc);
	Banc update(Banc banc);
	Banc find(Banc banc);
	
	
	

}
