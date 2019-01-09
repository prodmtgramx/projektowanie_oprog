package com.km.models;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.km.modelDTO.PlanKlientaDTO;


@Entity
public class PlanKlienta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private BigDecimal price;
	private String name;
	private String descr;
	
	private long klient_id;
	private long trener_id;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Cwiczenie> cwiczenia;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Posilek> posilki;
	
	public PlanKlienta() {
		
	}
	
	public PlanKlienta(PlanKlientaDTO pkdto){
		this.setCwiczenia(pkdto.getCwiczenia());
		this.setDescr(pkdto.getDescr());
		this.setName(pkdto.getName());
		this.setPosilki(pkdto.getPosilki());
		this.setPrice(pkdto.getPrice());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
