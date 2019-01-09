package com.km.modelDTO;

import java.util.List;




import com.km.models.Klient;
import com.km.models.Ocena;
import com.km.models.Wiadomosci;


public class KlientDTO {
	
	private long id;
	private String firstName;
	private String secondName;
	private Integer year;
	private String email;

	private List<Ocena> oceny;

	private List<Wiadomosci> wiadomosci;
		
	public KlientDTO(Klient klient){
		this.setEmail(klient.getEmail());
		this.setFirstName(klient.getFirstName());
		this.setId(klient.getId());
		this.setOceny(klient.getOceny());
		this.setSecondName(klient.getSecondName());
		this.setWiadomosci(klient.getWiadomosci());
		this.setYear(klient.getYear());
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
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
