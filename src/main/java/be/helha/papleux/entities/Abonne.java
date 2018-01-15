package be.helha.papleux.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Abonne extends Utilisateur implements Serializable{
	private String nom;
	
	@OneToOne(cascade=CascadeType.ALL)//Très dangereux
	private Adresse domicile;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Livre> livres = new HashSet<Livre>();
	
	public Abonne() {
	}
	public Abonne(String log, String mdp, String nom) {
		super(log,mdp);
		this.nom = nom;
	}
	
	
	
	public Set<Livre> getLivres() {
		return livres;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Adresse getDomicile() {
		return domicile;
	}
	public void setDomicile(Adresse domicile) {
		this.domicile = domicile;
	}
	
	
	
	public void ajouterLivre(Livre livre) {
		livres.add(livre);
	}
	
	
	
	public String toString() {
		return super.toString()+" | "+nom;
	}
}