package com.jeffersonbatista_crud.agenda_helo.contacts;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String phone;
	@Column(nullable = false)
	private String email;
	
	private String urlAvatar;
	
	//MÈTODO CONSTRUTOR
	public Contact() {
	}
	
	public Contact(String name, String phone, String email, String urlAvatar) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.urlAvatar = urlAvatar;
	}

	//SET AND GET
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUrlAvatar() {
		return urlAvatar;
	}


	public void setUrlAvatar(String urlAvatar) {
		this.urlAvatar = urlAvatar;
	}
	//Indetify Object
	@Override
	public int hashCode() {
		return getClass().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return id == other.id;
	}
	
	//toString
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", urlAvatar="
				+ urlAvatar + "]";
	}
		
	
}