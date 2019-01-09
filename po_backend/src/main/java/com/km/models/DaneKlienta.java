package com.km.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DaneKlienta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private double waga;
	private double wzrost;
	private double tkankaTluszczowa;
	private String opisProblemow;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getWaga() {
		return waga;
	}
	public void setWaga(double waga) {
		this.waga = waga;
	}
	public double getWzrost() {
		return wzrost;
	}
	public void setWzrost(double wzrost) {
		this.wzrost = wzrost;
	}
	public double getTkankaTluszczowa() {
		return tkankaTluszczowa;
	}
	public void setTkankaTluszczowa(double tkankaTluszczowa) {
		this.tkankaTluszczowa = tkankaTluszczowa;
	}
	public String getOpisProblemow() {
		return opisProblemow;
	}
	public void setOpisProblemow(String opisProblemow) {
		this.opisProblemow = opisProblemow;
	}
	
	
	
}
