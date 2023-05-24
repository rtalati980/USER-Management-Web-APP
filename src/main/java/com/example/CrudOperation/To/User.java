package com.example.CrudOperation.To;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="usersc")
public class User {
     
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column
	String name;
	@Column
	String email;
	@Column
	int age;
	@Column
	private Gender gender;
	
	public User() { 
		super();
	}

	public User(int id, String name, String email, int age, Gender gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
}
