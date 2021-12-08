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
public class Voiture {
	@Id
	@GeneratedValue
	private int num_imm_voiture;
	

	@Column
	private String modele;
	private String coleur;
	
	private Date date_mise_circulation;
	
	@OneToMany(mappedBy="voiture",fetch=FetchType.EAGER)
	private List<lecon> lstlecon;
	
	public List<lecon> getLstlecon() {
		return lstlecon;
	}
	public void setLstlecon(List<lecon> lstlecon) {
		this.lstlecon = lstlecon;
	}
	public int getNum_imm_voiture() {
		return num_imm_voiture;
	}
	public void setNum_imm_voiture(int num_imm_voiture) {
		this.num_imm_voiture = num_imm_voiture;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getColeur() {
		return coleur;
	}
	public void setColeur(String coleur) {
		this.coleur = coleur;
	}
	public Date getDate_mise_circulation() {
		return date_mise_circulation;
	}
	public void setDate_mise_circulation(Date date_mise_circulation) {
		this.date_mise_circulation = date_mise_circulation;
	}
	
	public Voiture(int num_imm_voiture, String modele, String coleur, Date date_mise_circulation,
			List<lecon> lstlecon) {
		super();
		this.num_imm_voiture = num_imm_voiture;
		this.modele = modele;
		this.coleur = coleur;
		this.date_mise_circulation = date_mise_circulation;
		this.lstlecon = lstlecon;
	}
	public Voiture() {}
	@Override
	public String toString() {
		return "Voiture [num_imm_voiture=" + num_imm_voiture + ", modele=" + modele + ", coleur=" + coleur
				+ ", date_mise_circulation=" + date_mise_circulation + ", lstlecon=" + lstlecon + "]";
	}
	
	
	
}
