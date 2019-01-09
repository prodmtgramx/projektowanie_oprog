package com.km.modelDTO;

import java.util.List;


import com.km.models.Ocena;
import com.km.models.Trener;
import com.km.models.Wiadomosci;

public class TrenerDTO {
	private long id;	
	private String name;	
	private String secondName;	
	private String descr;	
	private String email;
	private List<Ocena> oceny;
	private List<Wiadomosci> wiadomosci;
	
	public TrenerDTO(Trener trener){
		this.setDescr(trener.getDescr());
		this.setEmail(trener.getEmail());
		this.setId(trener.getId());
		this.setName(trener.getName());
		this.setOceny(trener.getOceny());
		this.setSecondName(trener.getSecondName());
		this.setWiadomosci(trener.getWiadomosci());
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Ocena> getOceny() {
		return oceny;
	}
	public void setOceny(List<Ocena> oceny) {
		this.oceny = oceny;
	}
	public List<Wiadomosci> getWiadomosci() {
		return wiadomosci;
	}
	public void setWiadomosci(List<Wiadomosci> wiadomosci) {
		this.wiadomosci = wiadomosci;
	}
	
	
}
