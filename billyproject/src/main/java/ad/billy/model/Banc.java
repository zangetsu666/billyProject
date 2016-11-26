package ad.billy.model;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

import javax.persistence.Id;

@Entity
public class Banc {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	private String nom;
	private String swift;

	
	@OneToMany(mappedBy="banc", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Sucursal> sucursalList;

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
	 * @return the swift
	 */
	public String getSwift() {
		return swift;
	}

	/**
	 * @param swift the swift to set
	 */
	public void setSwift(String swift) {
		this.swift = swift;
	}



	/**
	 * @return the sucursalList
	 */
	public List<Sucursal> getSucursalList() {
		return sucursalList;
	}

	/**
	 * @param sucursalList the sucursalList to set
	 */
	public void setSucursalList(List<Sucursal> sucursalList) {
		this.sucursalList = sucursalList;
	}
	
	

}
