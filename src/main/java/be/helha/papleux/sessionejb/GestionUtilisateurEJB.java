package be.helha.papleux.sessionejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import be.helha.papleux.dao.DAOUtilisateurLocalBean;
import be.helha.papleux.entities.Abonne;
import be.helha.papleux.entities.Livre;
import be.helha.papleux.entities.Utilisateur;

@Stateless
@LocalBean
public class GestionUtilisateurEJB implements IGestionUtilisateurEJBRemote {

	@EJB
	private DAOUtilisateurLocalBean dao;//Jamais de NEW
	
	
	@Override	
	public List<Utilisateur> selectAll() {
		return dao.rechercherUtilisateurs();
	}

	@Override
	public Utilisateur addUtilisateur(Utilisateur p) {
		dao.ajouterUtilisateur(p);
		return p;
	}
	
	@Override
	public Abonne addAbonne(Abonne p) {
		dao.ajouterAbonne(p);
		return p;
	}
}
