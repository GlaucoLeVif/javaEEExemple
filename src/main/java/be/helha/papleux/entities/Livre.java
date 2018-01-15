package be.helha.papleux.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livre implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String titre;
	
	public Livre() {}
	
	public Livre(String titre) {
		this.titre = titre;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	@Override
	public String toString() {
		return "id=" + id + " : "+ titre;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Livre) {
			Livre l = (Livre) o;
			return l.titre.equalsIgnoreCase(this.titre);
		}
		return false;
	}
}
