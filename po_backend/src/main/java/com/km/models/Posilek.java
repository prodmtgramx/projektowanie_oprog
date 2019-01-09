package com.km.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Posilek {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nazwa;
	private String opis;	
	private int kalorie;
	private String eatTime;
	private String jakPrzygotowac;
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
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public int getKalorie() {
		return kalorie;
	}
	public void setKalorie(int kalorie) {
		this.kalorie = kalorie;
	}
	public String getEatTime() {
		return eatTime;
	}
	public void setEatTime(String eatTime) {
		this.eatTime = eatTime;
	}
	public String getJakPrzygotowac() {
		return jakPrzygotowac;
	}
	public void setJakPrzygotowac(String jakPrzygotowac) {
		this.jakPrzygotowac = jakPrzygotowac;
	}
	

	
}
