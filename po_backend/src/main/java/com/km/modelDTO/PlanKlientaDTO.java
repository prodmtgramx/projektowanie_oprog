package com.km.modelDTO;

import java.math.BigDecimal;
import java.util.List;

import com.km.models.Cwiczenie;
import com.km.models.Posilek;

public class PlanKlientaDTO {

	private BigDecimal price;
	private String name;
	private String descr;
	private List<Cwiczenie> cwiczenia;
	private List<Posilek> posilki;
	
	
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public List<Cwiczenie> getCwiczenia() {
		return cwiczenia;
	}

	public void setCwiczenia(List<Cwiczenie> cwiczenia) {
		this.cwiczenia = cwiczenia;
	}

	public List<Posilek> getPosilki() {
		return posilki;
	}

	public void setPosilki(List<Posilek> posilki) {
		this.posilki = posilki;
	}
	
	
	
}


