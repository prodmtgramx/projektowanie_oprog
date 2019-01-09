package com.km.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Trener {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;	
	private String username;	
	private String name;	
	private String secondName;	
	private String descr;	
	private String password;
	private String email;
	
	@OneToMany
	@JoinColumn(name = "trener_id")
	private List<Ocena> oceny;
	
	@OneToMany
	@JoinColumn(name = "trener_id")
	private List<Zlecenie> zlecenia;
	
	@OneToMany
	@JoinColumn(name = "trener_id")
	private List<Wiadomosci> wiadomosci;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "trener_id")
	private List<PlanKlienta> plany;

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

	@Override
	public String toString() {
		return "Trener [id=" + id + ", username=" + username + ", name=" + name + ", secondName=" + secondName
				+ ", descr=" + descr + ", password=" + password + ", email=" + email + "]";
	}

	public List<Zlecenie> getZlecenia() {
		return zlecenia;
	}

	public void setZlecenia(List<Zlecenie> zlecenia) {
		this.zlecenia = zlecenia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trener other = (Trener) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	
	
	
	
	

}
