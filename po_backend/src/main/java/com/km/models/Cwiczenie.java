package com.km.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cwiczenie {
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nazwa;
	private String jakWykonac;
	private String naCoDziala;
	private int liczbaPowtorzen;
	private int serie;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getJakWykonac() {
		return jakWykonac;
	}
	public void setJakWykonac(String jakWykonac) {
		this.jakWykonac = jakWykonac;
	}
	public String getNaCoDziala() {
		return naCoDziala;
	}
	public void setNaCoDziala(String naCoDziala) {
		this.naCoDziala = naCoDziala;
	}
	public int getLiczbaPowtorzen() {
		return liczbaPowtorzen;
	}
	public void setLiczbaPowtorzen(int liczbaPowtorzen) {
		this.liczbaPowtorzen = liczbaPowtorzen;
	}
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}

	
	
	
}
