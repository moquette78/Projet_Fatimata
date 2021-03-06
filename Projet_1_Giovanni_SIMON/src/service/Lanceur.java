package service;

import java.util.ArrayList;
import java.util.Date;

import metier.Client;
import metier.Commande;
import metier.CommandeProduit;
import metier.Produit;
import gestion.Service;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Creation de deux nouveaux clients
		 * 
		 */
		Client charles=new Client(1,"chachar","azerty","Dupont","Charle","1 rue Charlemagne",new Date(),"charles@live.fr","nouveau","cheque",new ArrayList<Commande> ());
		Client paul=new Client(2,"popol","123toto","Simon","Paul","3 rue De Gaulle",new Date(),"paul@live.fr","confirme","cb",new ArrayList<Commande> ());

		/**
		 * Creation de deux nouveaux produits
		 * 
		 */
		
		Produit p1= new Produit(10,"chaussette",2.1,"super chaussette",4,"vetements",2, new ArrayList<CommandeProduit> ());
		Produit p2= new Produit(11,"tele",500.4,"super tele",5,"media",3, new ArrayList<CommandeProduit> ());
		//Produit p3= new Produit(12,"chaise",20,"super chaise",12,"meuble",2, new ArrayList<CommandeProduit> ());

		/**
		 * Creation de deux nouvelles commandes
		 * 
		 */
		
		Commande c1 = new Commande(100,new Date(),"en cours","facture 1","10%",charles,new ArrayList<CommandeProduit> ());
		Commande c2 = new Commande(101,new Date(),"terminée","facture 2","15%",paul,new ArrayList<CommandeProduit> ());

		System.out.println("---------avant ajout------------------\n");
		System.out.println(charles.toString()+"\n");
		System.out.println(paul.toString() + "\n");
		/**
		 * On ajoute Une nouvelle CommandeProduit a la liste et on rajoute cette commande au client
		 * 
		 */
		
		
		Service.ajouterCommandeProduit(c1, p1);
		Service.ajouterCommandeProduit(c2, p2);
		Service.ajouterCommandeClient(charles,c1,2);
		Service.ajouterCommandeClient(paul,c2,3);
		
		System.out.println("---------après ajout------------------\n");
		
		System.out.println(charles.toString() + "\n");
		System.out.println(paul.toString());
		}
	

}
