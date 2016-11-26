package ad.billy.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pais {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	private String nom;
	private String codi;
	
	@OneToMany(mappedBy="pais", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Parroquia> parroquiaList;

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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
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
	 * @return the parroquiaList
	 */
	public List<Parroquia> getParroquiaList() {
		return parroquiaList;
	}

	/**
	 * @param parroquiaList the parroquiaList to set
	 */
	public void setParroquiaList(List<Parroquia> parroquiaList) {
		this.parroquiaList = parroquiaList;
	}
	
	
	
	
	
}
