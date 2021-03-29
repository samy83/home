package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
	//obligatoire
	@Column(name="prenom", nullable=false)
	private String prenom;
	
	//obligatoire
	@Column(name="age", nullable=false)
	private int age;
	
	//falcutatif
	@Column(name="pays", nullable=true)
	private String pays;

	public User() {
		
	}
	
	public User(String prenom, int age, String pays) {
		this.prenom=prenom;
		this.age=age;
		this.pays=pays;
	}
	
	public User(long id, String prenom, int age, String pays) {
		this.prenom=prenom;
		this.age=age;
		this.pays=pays;
		this.id=id;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

}
