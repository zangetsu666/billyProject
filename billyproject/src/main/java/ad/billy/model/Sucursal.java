package ad.billy.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;




@Entity
public class Sucursal {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	private String codi;
	private String direccio;
	
//	@ManyToOne
//	private Banc banc;
//	
	

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the codi
	 */
	public String getCodi() {
		return codi;
	}

	/**
	 * @param codi the codi to set
	 */
	public void setCodi(String codi) {
		this.codi = codi;
	}

	/**
	 * @return the direccio
	 */
	public String getDireccio() {
		return direccio;
	}

	/**
	 * @param direccio the direccio to set
	 */
	public void setDireccio(String direccio) {
		this.direccio = direccio;
	}

//	/**
//	 * @return the banc
//	 */
//	public Banc getBanc() {
//		return banc;
//	}
//
//	/**
//	 * @param banc the banc to set
//	 */
//	public void setBanc(Banc banc) {
//		this.banc = banc;
//	}

	

}
