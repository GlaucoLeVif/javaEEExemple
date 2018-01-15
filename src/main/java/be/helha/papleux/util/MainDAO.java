package be.helha.papleux.util;

import java.util.Scanner;

import be.helha.papleux.dao.DAOUtilisateurLocalBean;
import be.helha.papleux.entities.Abonne;
import be.helha.papleux.entities.Adresse;
import be.helha.papleux.entities.Livre;

public class MainDAO {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
//		DAOUtilisateurLocalBean dao=null;
		
		System.out.println("GESTION DE PERSONNES");
		System.out.println("--------------------");
		System.out.println(
				"100.Recherche de tous les utilisateurs.\n"+
				"101.Recherche de tous les abonnés.\n"+
				" 10. Recherche d'un utilisateur par le login.\n" + 
				" 11. Recherche d'un abonné par le login.\n" + 
				" 12. Recherche d'un abonné par l'adresse.\n" + 
				" 13. Recherche des livres d'un abonné.\n" + 
				" 14. Recherche du propriétaire d'un livre.\n" + 
				" 15. Recherche des livres à une adresse.\n" + 
				" 20. Ajout d'un abonné login unique.\n" + 
				" 30. Modification d'un abonné.\n" + 
				" 40. Supression d'une personne.\n" + 
				"  0. Quitter.");
		System.out.print("Votre choix : ");
		int i = Integer.parseInt(scan.nextLine());
		
//		while(i>0) {
//			switch(i) {
//				case 100:
//					System.out.println("'Utilisateurs' -> "+ dao.rechercherUtilisateurs().toString());
//				;break;
//				
//				case 101:
//					System.out.println("'Abonnes' -> "+dao.rechercherAbonnes().toString());
//				;break;
//				
//				case 10:
//					System.out.println("Login de l'utilisateur cherché: ");
//					String user = scan.nextLine();
//					System.out.println("'"+user+"' -> "+dao.rechercherUtilisateurByLogin(user).toString());
//				;break;
//				case 11:
//					System.out.println("Login de l'abonné cherché: ");
//					String abo = scan.nextLine();
//					System.out.println("'"+abo+"' -> "+dao.rechercherAbonneByLogin(abo).toString());
//				;break;
//					
//				case 12: 
//					System.out.print("Rue de l'abonné cherché: ");
//					String rue = scan.nextLine();
//					System.out.println("'"+rue+"' -> " + dao.rechercherAbonneByRue(rue).toString());
//				;break;
//					
//				case 13: 
//					System.out.print("Login du propriétaire des livres: ");
//					String proprio = scan.nextLine();	
//					System.out.println("'"+proprio+"' -> " + dao.rechercherLivreByLogin(proprio));
//				;break;
//					
//				case 14:
//					System.out.print("Titre du livre dont vous recherchez le propriétaire: ");
//					String titre = scan.nextLine();
//					System.out.println("'"+titre+"' -> " + dao.rechercherProprioByTitre(titre).toString());
//				;break;
//					
//				case 15: 
//					System.out.print("Rue de l'adresse à laquelle vous cherchez les livres: ");
//					String rueLivre = scan.nextLine();
//					System.out.println("'"+rueLivre+"' -> " + dao.rechercherLivresByRue(rueLivre).toString());
//				;break;
//					
//				case 20: 
//					System.out.print("Login de l'abonné à ajouter: ");
//					String nouvTitre = scan.nextLine();
//					System.out.print("Mot de passe de l'abonné à ajouter: ");
//					String password = scan.nextLine();
//					System.out.print("Nom de l'abonné à ajouter: ");
//					String nom = scan.nextLine();
//					Abonne personne = new Abonne(nouvTitre,password,nom);
//					
//					System.out.print("Rue de l'abonné à ajouter: ");
//					String nouvRue = scan.nextLine();
//					System.out.print("Numéro de la rue de l'abonné à ajouter: ");
//					String numero = scan.nextLine();
//					System.out.print("Code postal de l'abonné à ajouter: ");
//					int postal = Integer.parseInt(scan.nextLine());
//					System.out.print("Ville de l'abonné à ajouter: ");
//					String ville = scan.nextLine();	
//					Adresse adresse = new Adresse(nouvRue,numero,postal,ville);
//					personne.setDomicile(adresse);
//					
//					System.out.print("Titre du livre à ajouter (0 pour terminer): ");
//					String boucle = scan.nextLine();
//					while(!boucle.equals("0")) {
//						personne.ajouterLivre(new Livre(boucle));
//						System.out.print("Titre du livre à ajouter (0 pour terminer): ");
//						boucle = scan.nextLine();
//					}
//					
//					dao.ajouterAbonne(personne);
//				;break;
//					
//				case 30: 
//					System.out.print("Login de la personne à modifier: ");
//					String log = scan.nextLine();
//					System.out.print("Nouveau login: ");
//					String nouvLogin = scan.nextLine();
//					dao.modifierUtilisateur(log, nouvLogin);
//				;break;
//					
//				case 40: 
//					System.out.print("Login de la personne à supprimer: ");
//					String loginDelete = scan.nextLine();
//					boolean isSupp = dao.supprimerUtilisateur(loginDelete);
//					System.out.println("'"+loginDelete+"' -> "+isSupp);
//				;break;
//					
//				default:
//					System.out.println("Commande inexistante");
//				;break;
//			}
//			
//			System.out.println("GESTION DE PERSONNES");
//			System.out.println("--------------------");
//			System.out.println(
//					"100.Recherche de tous les utilisateurs.\n"+
//					"101.Recherche de tous les abonnés.\n"+
//					" 10. Recherche d'un utilisateur par le login.\n" + 
//					" 11. Recherche d'un abonné par le login.\n" + 
//					" 12. Recherche d'un abonné par l'adresse.\n" + 
//					" 13. Recherche des livres d'un abonné.\n" + 
//					" 14. Recherche du propriétaire d'un livre.\n" + 
//					" 15. Recherche des livres à une adresse.\n" + 
//					" 20. Ajout d'un abonné login unique.\n" + 
//					" 30. Modification d'un abonné.\n" + 
//					" 40. Supression d'une personne.\n" + 
//					"  0. Quitter.");
//					System.out.print("Votre choix : ");
//					i = Integer.parseInt(scan.nextLine());
//		}
		
		scan.close();
	}
}
