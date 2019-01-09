package com.km.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ocena {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private int value;
	private String comment;
	private Timestamp date;
	private long klient_id;
	private long trener_id;
	
	public Ocena(){
		this.date = new Timestamp(System.currentTimeMillis());
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
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
