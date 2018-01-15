package be.helha.papleux.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import be.helha.papleux.entities.Abonne;
import be.helha.papleux.entities.Livre;
import be.helha.papleux.entities.Utilisateur;
import be.helha.papleux.sessionejb.GestionUtilisateurEJB;

@Named
@RequestScoped
public class NextControl {
	@EJB
	private GestionUtilisateurEJB gestionUtilisateurEJB;
	
	private Utilisateur user;
	private String nom;

	public String doNext() {
		return "next.xhtml";
	}
	
	public String doDetail(Utilisateur user) {
		this.user = user;
		if (user.getClass().equals(Utilisateur.class)) {
			return "detailUtilisateur.xhtml";
		}else if (user.getClass().equals(Abonne.class)) {
			return "detailAbonne.xhtml";
		}else {
			return "next.xhtml";
		}
	}
	
	public Utilisateur getUser() {
		return user;
	}

	public void setUser(Utilisateur user) {
		this.user = user;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
