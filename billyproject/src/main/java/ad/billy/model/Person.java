package ad.billy.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String nom;
	private String cognom;
	private Date dataNaixement;
	private String direccio;
	private String telefonFixe;
	private String telefonMovil;
	
	private String email;
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
	 * @return the cognom
	 */
	public String getCognom() {
		return cognom;
	}
	/**
	 * @param cognom the cognom to set
	 */
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}
	/**
	 * @return the dataNaixement
	 */
	public Date getDataNaixement() {
		return dataNaixement;
	}
	/**
	 * @param dataNaixement the dataNaixement to set
	 */
	public void setDataNaixement(Date dataNaixement) {
		this.dataNaixement = dataNaixement;
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
	/**
	 * @return the telefonFixe
	 */
	public String getTelefonFixe() {
		return telefonFixe;
	}
	/**
	 * @param telefonFixe the telefonFixe to set
	 */
	public void setTelefonFixe(String telefonFixe) {
		this.telefonFixe = telefonFixe;
	}
	/**
	 * @return the telefonMovil
	 */
	public String getTelefonMovil() {
		return telefonMovil;
	}
	/**
	 * @param telefonMovil the telefonMovil to set
	 */
	public void setTelefonMovil(String telefonMovil) {
		this.telefonMovil = telefonMovil;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
	
}


