package com.km.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Zlecenie {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private long klient_id;
	private long trener_id;
	private boolean accepted;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean isAccepted() {
		return accepted;
	}
	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}
	public long getKlient_id() {
		return klient_id;
	}
	public void setKlient_id(long klient_id) {
		this.klient_id = klient_id;
	}
	public long getTrener_id() {
		return trener_id;
	}
	public void setTrener_id(long trener_id) {
		this.trener_id = trener_id;
	}
	
	

	
	
	
	
	
}
