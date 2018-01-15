package be.helha.papleux.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

@Entity
public class Utilisateur implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String login;
	private String password;
	
	
	
	public Utilisateur() {
	}
	public Utilisateur(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Utilisateur) {
			Utilisateur u=(Utilisateur) o;
			return this.login.equals(u.login);
		}
		return false;
	}

	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	public String toString() {
		return id + " : "+login+" | "+password;
	}
}