package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {

	private String lname;
	private int lid;
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	@Override
	public String toString() {
		return "Laptop [lname=" + lname + ", lid=" + lid + "]";
	}
	public void laptopMethod() {
		System.out.println("in laptop method............");
	}
}
