package be.helha.papleux.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import be.helha.papleux.entities.Abonne;
import be.helha.papleux.entities.Adresse;
import be.helha.papleux.entities.Livre;
import be.helha.papleux.entities.Utilisateur;
import be.helha.papleux.sessionejb.GestionUtilisateurEJB;

@Named
@RequestScoped
public class UtilisateurControl {
	
	private String loginUt, passwordUt, loginAb, passwordAb, nom, rue, numero, ville;
	private int codePostal;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	@EJB
	private GestionUtilisateurEJB gestionUtilisateurEJB;
	
	public List<Utilisateur> doList() {
		return gestionUtilisateurEJB.selectAll();
	}
	
	public void createUser() {
		gestionUtilisateurEJB.addUtilisateur(new Utilisateur(loginUt, passwordUt));
	}
	
	public void createAbonne() {
		Abonne a = new Abonne(loginAb, passwordAb, nom);
		Adresse ad = new Adresse(rue, numero, codePostal, ville);
		a.setDomicile(ad);
		gestionUtilisateurEJB.addAbonne(a);
		
	}

	public String getLoginUt() {
		return loginUt;
	}

	public void setLoginUt(String loginUt) {
		this.loginUt = loginUt;
	}

	public String getPasswordUt() {
		return passwordUt;
	}

	public void setPasswordUt(String passwordUt) {
		this.passwordUt = passwordUt;
	}

	public String getLoginAb() {
		return loginAb;
	}

	public void setLoginAb(String loginAb) {
		this.loginAb = loginAb;
	}

	public String getPasswordAb() {
		return passwordAb;
	}

	public void setPasswordAb(String passwordAb) {
		this.passwordAb = passwordAb;
	}
	
	
}
