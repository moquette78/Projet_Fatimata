package gestion;

import java.util.List;

import metier.Client;
import metier.Produit;
import metier.Commande;
import metier.CommandeProduit;

public class Service {
	
	
	
	/**
	 * On ajout un nouvel objet CommandeProduit a la liste de Produit et de Commande
	 * 
	 * @param c la commande
	 * @param p le produit
	 */
	public static void ajouterCommandeProduit(Commande c, Produit p) {
		c.getCommandeProduit().add(new CommandeProduit(p.getQuantite(),p.getPrix()*p.getQuantite(),c,p));
		p.getCommandeProduit().add(new CommandeProduit(p.getQuantite(),p.getPrix()*p.getQuantite(),c,p));

	}
	
	/**
	 * ajoute la quantite "quantite" de commande co au client cl 
	 * 
	 * @param cl le client
	 * @param co la commande
	 * @param quantite la quantite
	 */
	public static void ajouterCommandeClient(Client cl, Commande co, int quantite) {
			for(int i=0;i<quantite;i++) {
			cl.getCommandes().add(co);
			}
		}
	
	
	/**
	 * 
	 * @param c le client
	 * @return la liste de commande d'un client
	 */
	public static List<Commande> listerCommandeClient(Client c) {
		
			return c.getCommandes();
		
		}

}
