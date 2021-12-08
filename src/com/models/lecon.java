package com.models;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
public class lecon {
	
	@Id
	@GeneratedValue
	private int id_lecon;
	
	//@Column
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_eleve")
	private Eleve eleve;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_Moniteur")
	private Moniteur moniteur;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_voiture")
	private Voiture voiture;
	
	
	private Date date_lecon;
	
	public Eleve getEleve() {
		return eleve;
	}
	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}
	public Moniteur getMoniteur() {
		return moniteur;
	}
	public void setMoniteur(Moniteur moniteur) {
		this.moniteur = moniteur;
	}
	public Voiture getVoiture() {
		return voiture;
	}
	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
	public int getId_lecon() {
		return id_lecon;
	}
	public void setId_lecon(int id_lecon) {
		this.id_lecon = id_lecon;
	}
	
	public Date getDate_lecon() {
		
		return date_lecon;
	}
	public void setDate_lecon(Date date_lecon) {
		
		this.date_lecon = date_lecon;
	}
	
	
	
	public lecon() {}
	
	
	
	
	
	
	
}
