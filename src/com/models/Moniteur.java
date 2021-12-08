package com.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Moniteur {
	
	@Id
	@GeneratedValue
	
	private int id_moniteur;
	
	@Column
	private String nom_moniteur;
	private String prenom_moniteur;
	
	
	private Date date_naissance;
	
	private String sexe;

	@OneToMany(mappedBy="moniteur",fetch=FetchType.EAGER)
	private List<lecon> lstlecon;
	
	
	public int getId_moniteur() {
		return id_moniteur;
	}

	public void setId_moniteur(int id_moniteur) {
		this.id_moniteur = id_moniteur;
	}

	public String getNom_moniteur() {
		return nom_moniteur;
	}

	public void setNom_moniteur(String nom_moniteur) {
		this.nom_moniteur = nom_moniteur;
	}

	public String getPrenom_moniteur() {
		return prenom_moniteur;
	}

	public void setPrenom_moniteur(String prenom_moniteur) {
		this.prenom_moniteur = prenom_moniteur;
	}

	public Date getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	
	
	public List<lecon> getLstlecon() {
		return lstlecon;
	}

	public void setLstlecon(List<lecon> lstlecon) {
		this.lstlecon = lstlecon;
	}
	

	public Moniteur(int id_moniteur, String nom_moniteur, String prenom_moniteur, Date date_naissance, String sexe,
			List<lecon> lstlecon) {
		super();
		this.id_moniteur = id_moniteur;
		this.nom_moniteur = nom_moniteur;
		this.prenom_moniteur = prenom_moniteur;
		this.date_naissance = date_naissance;
		this.sexe = sexe;
		this.lstlecon = lstlecon;
	}

	public Moniteur() {}

	@Override
	public String toString() {
		return "Moniteur [id_moniteur=" + id_moniteur + ", nom_moniteur=" + nom_moniteur + ", prenom_moniteur="
				+ prenom_moniteur + ", date_naissance=" + date_naissance + ", sexe=" + sexe + ", lstlecon=" + lstlecon
				+ "]";
	}

	
	
	

}
