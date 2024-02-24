package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien
{
	@Id
	private int id;
	public Alien()
	{
		
	}
	public Alien(int id, String aname) {
		super();
		this.id = id;
		this.aname = aname;
	}
	private String aname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", aname=" + aname + "]";
	}
	
	
	

}
