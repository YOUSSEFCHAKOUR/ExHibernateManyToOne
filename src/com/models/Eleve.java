package com.models;

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
public class Eleve {
	
	@Id
	@GeneratedValue
	private int id_eleve;
	
	@Column
	private String nom;
	private String prenom;
	private String adress;
	private int CP;
	private String ville;
	
	@OneToMany(mappedBy="eleve",fetch=FetchType.EAGER)
	
	private  List<lecon> lstlecon;
	
	public List<lecon> getLstlecon() {
		return lstlecon;
	}
	public void setLstlecon(List<lecon> lstlecon) {
		this.lstlecon = lstlecon;
	}
	public int getId_eleve() {
		return id_eleve;
	}
	public void setId_eleve(int id_eleve) {
		this.id_eleve = id_eleve;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getCP() {
		return CP;
	}
	public void setCP(int cP) {
		CP = cP;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	public Eleve(int id_eleve, String nom, String prenom, String adress, int cP, String ville, List<lecon> lstlecon) {
		super();
		this.id_eleve = id_eleve;
		this.nom = nom;
		this.prenom = prenom;
		this.adress = adress;
		CP = cP;
		this.ville = ville;
		this.lstlecon = lstlecon;
	}
	public Eleve() {}
	@Override
	public String toString() {
		return "Eleve [id_eleve=" + id_eleve + ", nom=" + nom + ", prenom=" + prenom + ", adress=" + adress + ", CP="
				+ CP + ", ville=" + ville + ", lstlecon=" + lstlecon + "]";
	}
	
	

}
