package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")      creates the object only when we use getBean method
public class Alien {

	
	public Alien() {
		super();
		System.out.println("Alien Object created.....");
	}
	private String aname;
	private int aid;
	@Autowired           //fetches the object by type
	@Qualifier("lap1")   //fetches the object by name
	Laptop laptop;
	
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	@Override
	public String toString() {
		return "Alien [aname=" + aname + ", aid=" + aid + "]";
	}
	public void alienMethod() {
		System.out.println("in Alien Method.........");
		laptop.laptopMethod();
	}
}
