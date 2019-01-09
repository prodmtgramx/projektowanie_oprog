package com.km.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Klient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String username;
	private String firstName;
	private String secondName;
	private Integer year;
	private String password;
	private String email;
	
	@OneToMany
	@JoinColumn(name = "klient_id")
	private List<Ocena> oceny;
	
	@OneToMany
	@JoinColumn(name = "klient_id")
	private List<Wiadomosci> wiadomosci;
	
	@OneToMany
	@JoinColumn(name = "klient_id")
	private List<PlanKlienta> plany;
	
	@OneToMany
	@JoinColumn(name = "klient_id")
	private List<Zlecenie> zlecenia;
	
	@OneToOne
	private DaneKlienta daneKlienta;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public List<PlanKlienta> getPlany() {
		return plany;
	}

	public void setPlany(List<PlanKlienta> plany) {
		this.plany = plany;
	}

	public List<Zlecenie> getZlecenia() {
		return zlecenia;
	}

	public void setZlecenia(List<Zlecenie> zlecenia) {
		this.zlecenia = zlecenia;
	}

	public DaneKlienta getDaneKlienta() {
		return daneKlienta;
	}

	public void setDaneKlienta(DaneKlienta daneKlienta) {
		this.daneKlienta = daneKlienta;
	}
	
	
	

}
