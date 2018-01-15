package be.helha.papleux.sessionejb;

import java.util.List;

import javax.ejb.Remote;

import be.helha.papleux.entities.Livre;
import be.helha.papleux.entities.Utilisateur;
import be.helha.papleux.entities.Abonne;

@Remote
public interface IGestionUtilisateurEJBRemote {
	List<Utilisateur> selectAll();
	
	Utilisateur addUtilisateur(Utilisateur p);
	
	Abonne addAbonne(Abonne a);
}
