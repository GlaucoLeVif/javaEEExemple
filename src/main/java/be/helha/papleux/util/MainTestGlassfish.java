package be.helha.papleux.util;


import javax.naming.InitialContext;
import javax.naming.Context;
import javax.naming.NamingException;

import be.helha.papleux.entities.Abonne;
import be.helha.papleux.sessionejb.IGestionUtilisateurEJBRemote;

public class MainTestGlassfish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IGestionUtilisateurEJBRemote bean = null;
		
		try {
			Context context = new InitialContext();
			bean = (IGestionUtilisateurEJBRemote) context.lookup("java:global/cannuyer/GestionUtilisateurEJB!be.helha.cannuyer.sessionejb.IGestionUtilisateurEJBRemote");
			System.out.println(bean.selectAll());
		}
		catch (NamingException e) {
			e.printStackTrace();
		}
		
	}

}
