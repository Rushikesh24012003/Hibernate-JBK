package com.jbk;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;



@Entity
public class Artist {
	
	private int a_id ;
	private int a_age;
	private String a_name;
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public int getA_age() {
		return a_age;
	}
	public void setA_age(int a_age) {
		this.a_age = a_age;
	}
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String a_name) {
		this.a_name = a_name;
	}
	public Artist(int a_id, int a_age, String a_name) {
		super();
		this.a_id = a_id;
		this.a_age = a_age;
		this.a_name = a_name;
	}
	public Artist() {
		super();
	}
	public Artist(int a_id) {
		super();
		this.a_id = a_id;
	}
	public Artist(int a_age, String a_name) {
		super();
		this.a_age = a_age;
		this.a_name = a_name;
	}
	@Override
	public String toString() {
		return "Artist [a_id=" + a_id + ", a_age=" + a_age + ", a_name=" + a_name + "]";
	}
	
	

}
