package be.helha.papleux.dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import be.helha.papleux.entities.Abonne;
import be.helha.papleux.entities.Livre;
import be.helha.papleux.entities.Utilisateur;

@Stateless
@LocalBean
public class DAOUtilisateurLocalBean {
	@PersistenceContext(unitName="papleuxJTA")
	private EntityManager em; //On instancie jamais l'EM, c'est le serveeur qui va donner une référence
	
	public DAOUtilisateurLocalBean() {
		
	}

	public List<Utilisateur> rechercherUtilisateurs() {
		String Utilisateur = "SELECT u FROM Utilisateur u";
		Query queryUtilisateurs = em.createQuery(Utilisateur);
		List<Utilisateur> list = (List<Utilisateur>) queryUtilisateurs.getResultList();
		return list;
	}
//	public List<Utilisateur> rechercherAbonnes() {
//		String Abonne = "SELECT a FROM Abonne a";
//		Query queryAbonnes = em.createQuery(Abonne);
//		List<Utilisateur> list = (List<Utilisateur>) queryAbonnes.getResultList();
//		return list;
//	}
	public List<Utilisateur> rechercherUtilisateurById(int id) {
		String PersonneById = "SELECT u FROM Utilisateur u WHERE u.id=:id";
		Query queryId = em.createQuery(PersonneById);
		queryId.setParameter("id", id);
		List<Utilisateur> list = (List<Utilisateur>) queryId.getResultList();
		return list;
	}
//	public List<Utilisateur> rechercherAbonneByLogin(String login) {
//		String PersonneByLogin = "SELECT a FROM Abonne a WHERE a.login=:varLogin";
//		Query queryLogin = em.createQuery(PersonneByLogin);
//		queryLogin.setParameter("varLogin", login);
//		List<Utilisateur> list = (List<Utilisateur>) queryLogin.getResultList();
//		return list;
//	}
//	public List<Utilisateur> rechercherAbonneByRue(String rue) {
//		String requetePersonneByRue = "SELECT a FROM Abonne a where a.domicile.rue=:varRue";
//		Query queryRue = em.createQuery(requetePersonneByRue);
//		queryRue.setParameter("varRue", rue);
//		List<Utilisateur> list = (List<Utilisateur>) queryRue.getResultList();
//		return list;
//	}
	public List<Livre> rechercherLivreById(int id) {
		String requeteLivreById = "select a.livres from Abonne a where a.id=:id";
		Query queryLivre = em.createQuery(requeteLivreById);
		queryLivre.setParameter("id", id);
		List<Livre> list = (List<Livre>) queryLivre.getResultList();
		return list;
	}
//	public List<Utilisateur> rechercherProprioByTitre(String titre) {
//		String requeteProprioByTitre = "SELECT a FROM Abonne a JOIN a.livres l where l.titre =:titre";
//		Query queryProprio = em.createQuery(requeteProprioByTitre);
//		queryProprio.setParameter("titre", titre);
//		List<Utilisateur> list = (List<Utilisateur>) queryProprio.getResultList();
//		return list;
//	}
//	public List<Livre> rechercherLivresByRue(String rue) {
//		String requeteLivreByRue = "SELECT a.livres FROM Abonne a where a.domicile.rue =:rue";
//		Query queryProprio = em.createQuery(requeteLivreByRue);
//		queryProprio.setParameter("rue", rue);
//		List<Livre> list = (List<Livre>) queryProprio.getResultList();
//		return list;
//	}
//	
//	
//	
//	public int rechercherIdByLogin(String login) {
//		String requeteIdByLogin = "SELECT u.id FROM Utilisateur u where u.login =:login";
//		Query queryProprio = em.createQuery(requeteIdByLogin);
//		queryProprio.setParameter("login", login);
//		
//		if(!queryProprio.getResultList().isEmpty()) {
//			int id = Integer.parseInt(queryProprio.getResultList().get(0).toString());
//			return id;
//		}
//		return -1;
//	}
//	
	public void ajouterUtilisateur(Utilisateur personne) {
		em.persist(personne);
	}
	
	public void ajouterAbonne(Abonne personne) {
		em.persist(personne);
	}
	
//	public void modifierUtilisateur(String login, String nouvLogin) {
//		int id = rechercherIdByLogin(login);
//		if(id>=0) {
//			Utilisateur aModifier = em.find(Utilisateur.class, id);
//			aModifier.setLogin(nouvLogin);
//			em.merge(aModifier);
//		}
//		rechercherUtilisateurByLogin(nouvLogin);
//	}
//	public boolean supprimerUtilisateur(String loginDelete) {
//		int id = rechercherIdByLogin(loginDelete);
//		if(id>=0) {
//			Utilisateur aSupp = em.find(Utilisateur.class, id);
//			em.remove(aSupp);
//			return true;
//		}
//		return false;
//	}
}